(ns allergenie.components.contact)

(defn contact
  []
  [:div {:class "container m-3"}
   [:div {:class "columns is-centered m-4"}
    [:div {:class "column is-half"}
     [:h2 {:class "title is-2 is-capitalized"} "Contact Us"]
     [:form {:action {:method "post"}}
      [:div {:class "field"}
       [:label {:for "name" :class "label is-size-4 has-text-weight-light"}]
       [:div {:class "control has-icons-left"}
        [:input {:type "text" :name "name" :id "name" :class "input" :placeholder "Name" :autofocus ""}]
        [:span {:class "icon is-left"}
         [:i {:class "fa fa-user"}]]]]
      [:div {:class "field"}
       [:label {:for "email" :class "label is-size-4 has-text-weight-light"}]
       [:div {:class "control has-icons-left"}
        [:input {:type "email" :name "email" :id "email" :class "input" :placeholder "Email"}]
        [:span {:class "icon is-left"}
         [:i {:class "fa fa-envelope"}]]]]
      [:div {:class "field"}
       [:label {:for "message" :class "label is-size-4 has-text-weight-light"}]
       [:textarea {:name "message" :id "message" :rows "5" :class "textarea is-medium" :placeholder "Message"}]]
      [:button {:type "submit" :class "button is-success is-size-5"} "Submit"]]]]])
