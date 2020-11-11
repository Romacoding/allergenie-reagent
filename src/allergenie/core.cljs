(ns allergenie.core
  (:require [reagent.dom :as rd]
            [allergenie.components.footer :as f]
            [allergenie.components.header :as h]
            [allergenie.components.navbar :as n]
            [allergenie.components.input :as i]
            [allergenie.components.forecast :as fr]
            [allergenie.components.separator :as s]
            [allergenie.components.glossary :as g]
            [allergenie.components.contact :as c]
            [allergenie.util :refer [get-pollen get-air get-weather]]))

(get-pollen)
(get-air)
(get-weather)

(defn app
  "The layout of components on the app."
  [_]
  [:div
   [n/navbar]
   [s/separator "home"]
   [h/header]
   [i/input]
   [s/separator "forecast"]
   [fr/forecast]
   [s/separator "glossary"]
   [g/glossary]
   [s/separator "contact"]
   [c/contact]
   [f/footer]])

(def dom-node (js/document.getElementById "app"))

(defn ^:dev/after-load start
  []
  (rd/render [app] dom-node))

(defn ^:export main
  []
  (start))