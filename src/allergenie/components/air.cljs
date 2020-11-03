(ns allergenie.components.air
  (:require [allergenie.state :as state]))

(defn air
  []
  [:div {:class "column card m-4"}
   [:h3 {:class "title is-3 has-text-centered"} "Air Quality"]
   [:p {:class "is-small has-text-justified m-2"} "The air you breathe matters. Besides pollen, there's all sorts of other stuff in the air that can have an effect on your breathing and allergy symptoms."]
   [:div {:class "m-4"}
    (let [pollutans @state/air-info]
      (for [pollutant pollutans]
        (let [air-color (cond
                          (> (:aqi pollutant) 200) "is-danger"
                          (> (:aqi pollutant) 100) "is-warning"
                          :else "is-success")]
          [:div {:class "m-3" :key (:name pollutant)}
           [:p (str "Pollutant: " (:name pollutant))]
           [:p (str "Air Quality Index: " (:aqi pollutant) ", " (:level pollutant))]
           [:progress {:class (str "progress " air-color) :value (:aqi pollutant) :max "500"} (:aqi pollutant)]])))]])
