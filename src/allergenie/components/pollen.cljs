(ns allergenie.components.pollen
  (:require [allergenie.state :as state]))

(defn pollen
  []
  [:div {:class "column card m-4"}
   [:h3 {:class "title is-3 has-text-centered"} "Pollen"]
   [:p {:class "is-small has-text-justified m-2"} "What the pollen levels feel like differs from person to person. Pollen can affect you as soon as you are exposed to it. So tracking the pollen levels every day can help you plan appropriate activities."]
   [:p {:class "m-4"} (str "Pollen index for today is: " (:index @state/pollen-info) ", " (:level @state/pollen-info))]
   [:div {:class "m-5"}
    [:progress {:class (str "progress " (:color @state/pollen-info)) :value (:index @state/pollen-info) :max "12"} (:index @state/pollen-info)]
    [:p (str "Main allergens:")]
    (let [triggers (:triggers @state/pollen-info)]
      (for [trigger triggers]
        [:p {:key (:Name trigger)} (:Name trigger)]))]])
