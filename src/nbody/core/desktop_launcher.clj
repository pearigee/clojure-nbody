(ns nbody.core.desktop-launcher
  (:require [nbody.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. nbody-game "Gabe's Clojure N-Body Sim" 800 800)
  (Keyboard/enableRepeatEvents true))
