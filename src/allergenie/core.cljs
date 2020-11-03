(ns allergenie.core
  (:require [reagent.dom :as rd]
            [allergenie.components.air :as a]
            [allergenie.components.pollen :as p]
            [allergenie.components.weather :as w]
            [allergenie.components.footer :as f]
            [allergenie.components.header :as h]
            [allergenie.util :refer [get-pollen get-air get-weather]]))

(get-pollen)
(get-air)
(get-weather)

(defn app
  [_]
  [:div.container
   [h/header]
   [a/air]
   [p/pollen]
   [w/weather]
   [f/footer]])

(def dom-node (js/document.getElementById "app"))

(defn ^:dev/after-load start
  []
  (rd/render [app] dom-node))

(defn ^:export main
  []
  (start))