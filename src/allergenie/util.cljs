(ns allergenie.util
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs-http.client :as http]
            [cljs.core.async :refer [<!]]
            [allergenie.state :as state]))

(defn get-weather []
  (go (let [response (<! (http/get "http://localhost:8000/weather?zip=10701" {:with-credentials? false}))]
        (if (= (:status response) 200) (:body response) (prn "Could not get weather info"))
        (reset! state/weather-info (:body response)))))

(defn get-air []
  (go (let [response (<! (http/get "http://localhost:8000/air?zip=10701" {:with-credentials? false}))]
        (if (= (:status response) 200) (:body response) (prn "Could not get air quality info"))
        (reset! state/air-info (:air (:body response))))))

(defn get-pollen []
  (go (let [response (<! (http/get "http://localhost:8000/pollen?zip=10701" {:with-credentials? false}))]
        (if (= (:status response) 200) (:body response) (prn "Could not get air quality info"))
        (reset! state/pollen-info (:body response)))))

