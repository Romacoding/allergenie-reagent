(ns allergenie.components.navbar)

(defn navbar
  []
  [:nav {:class      "navbar is-fixed-top is-info"
         :role       "navigation"
         :aria-label "main navigation"}
   [:div {:class "container"}
    [:div {:class "navbar-brand"}
     [:a {:class "navbar-item"
          :href  "#home"} "Home"]
     [:span {:class       "navbar-burger burger"
             :data-target "navbarAllergenie"}
      ;; Empty spans needed for navbar burger
      [:span] [:span] [:span]]]
    [:div {:id    "navbarAllergenie"
           :class "navbar-menu"}
     [:div {:class "navbar-start"}

      [:a {:class "navbar-item"
           :href  "#forecast"} "Forecast"]

      [:a {:class "navbar-item"
           :href  "#glossary"} "Glossary"]

      [:a {:class "navbar-item"
           :href  "#contact"} "Contact"]]]]])
