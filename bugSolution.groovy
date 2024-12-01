    static void main(String[] args) {
        def map = [a: 1, b: 2]
        println map.getClass()

        // Check if the key exists to avoid the null safe operator
        if (map.containsKey("c")) {
            println map.c
        } else {
            println "Key 'c' not found"
        }

        // Create a mutable map using as operator
        def mutableMap = map as LinkedHashMap
        mutableMap.c = 3
        println mutableMap

        //getOrElse method
        println map.getOrElse("c") { "default value" }
    }