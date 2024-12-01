    static void main(String[] args) {
        def map = [a: 1, b: 2]
        println map.getClass()

        // Accessing a non-existent key using the safe navigation operator
        println map?.c


        //Attempting to modify an immutable map
         map.c = 3


    }