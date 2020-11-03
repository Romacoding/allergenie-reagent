(ns allergenie.state
  (:require [reagent.core :as r]))

(def air-info (r/atom []))

(def pollen-info (r/atom {}))

(def weather-info (r/atom {}))
