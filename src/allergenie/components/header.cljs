(ns allergenie.components.header)

; (defn header
;   []
;   [:h1 {:class "title is-1 has-text-centered m-4"} "AllerGenie"])

(defn header
  "Top banner and navigation for the website"
  []
  [:section {:class "section"}
   [:div {:class "container m-4"}
    [:div {:class "columns is-vcentered"}

     [:div {:class "column is-2 is-offset-1"}
      [:img {:src   "/img/genie.svg"
             :width "160px"}]]

     [:div {:class "column"}
      [:h1 {:class "title is-1"}
       "AllerGenie"]
      [:h3 {:class "subtitle"}
       "Your daily pollen forecast"]
      [:div {:div "content"}
       "AllerGenie provides daily air quality, pollen and weather forecasts. Our mission is to improve the quality of life through timely and accurate information intended to assist all allergy sufferers."]]]]])