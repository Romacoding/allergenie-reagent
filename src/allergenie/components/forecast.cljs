(ns allergenie.components.forecast
  (:require [allergenie.state :as state]
            [allergenie.components.air :as a]
            [allergenie.components.pollen :as p]
            [allergenie.components.weather :as w]))

(defn forecast []
  [:div {:class "container"}
   [:div {:class "columns"}
    [:div {:class "column"}
     [:h2 {:class "title has-text-centered"}
      (str "Information for " (:location @state/pollen-info))]
     [:div {:class "columns"}

      [:div {:class "column"}
       [a/air]]

      [:div {:class "column"}
       [p/pollen]]

      [:div {:class "column"}
       [w/weather]]]]]])
