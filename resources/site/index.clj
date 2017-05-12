{:title "Analysis of tech, politics, & activism"}

[:div
 [:h2 "Updates"]
 [:hr]

 [:ul {:class "posts"}
  (map 
   #(let [f %
          url (static.core/post-url f)
          [metadata _] (static.io/read-doc f)
          date (static.core/parse-date 
                "yyyy-MM-dd" "yyyy|MMM|dd" 
                (re-find #"\d*-\d*-\d*" (str f)))]
      [:li [:span date] [:a {:href url} (:title metadata)]]) 
   (take 25 (reverse (static.io/list-files :posts))))]

 [:h2 "Write-ups"]
 [:hr]

 [:ul {:class "posts"}
  (map
   #(let [f %
          url (str "/writeups/" (first (clojure.string/split
                                        (last (clojure.string/split (str f) #"/")) #"\."))
                   ".html")
          [metadata _] (static.io/read-doc f)
          date (static.core/parse-date
                "yyyy-MM-dd" "yyyy|MMM|dd"
                (str (:date metadata)))]
      [:li [:span date] [:a {:href url} (:title metadata)]])
   (sort-by #(-> %
                 static.io/read-doc
                 first
                 :date
                 str)
            (static.io/list-files :writeups)))]]
