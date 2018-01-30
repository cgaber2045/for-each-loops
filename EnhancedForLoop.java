import java.util.ArrayList;

public class EnhancedForLoop
{
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        public static double mean(double nums[]) {
            int count = 0;
            
            for (double x: nums) {
                count += x;
            }
            
            return count / nums.length;
        }
   
        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.
        public static double max(double nums[]) {
            double count = Integer.MIN_VALUE;
            
            for (double x: nums) {
                if (x > count) count = x;
            }
            
            return count;
        }
        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.
        public static int sumEvenVals(int nums[]) {
            int count = 0;
            
            for (int x: nums) {
                if (x % 2 == 0) count += x;
            }
            
            return count;
        }

        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        public static int vowelCount(String vowels[]) {
            int count = 0;
            
            for (String x : vowels) {
                for (int i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || 
                    x.charAt(i) == 'o' || x.charAt(i) == 'u') count++;
                }
            }
            
            return count;
        }        

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        public static int sumEvenLocs(int nums[]) {
            int count = 0;
            int i = 0;
            
            for (int x : nums) {
                if (i % 2 == 0) count += nums[i];
                i++;
            }
            
            return count;
        }              
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        public static int sumEvenLocsNorm(int nums[]) {
            int count = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) count += nums[i];
            }
            
            return count;
        }           
        
        // A regular for loop already contains all of the parts neccessary to look through the loop
        // It already gives the index and so it saves a few lines and is easier to read this way.
        
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        
        // -- METHODS FROM TOP TEST --
        
        int test[] = {10, 20, 40, 60, 80, 90};
        System.out.println(sumEvenVals(test));
        System.out.println(sumEvenLocs(test));
        System.out.println(sumEvenLocsNorm(test));
        
        String test2[] = {"Jake", "Went", "To", "The", "Store"};
        System.out.println(vowelCount(test2));
        
        double test3[] = {10.0, 20.0, 40.0, 60.0, 80.0, 90.0};
        System.out.println(mean(test3));
        System.out.println(max(test3));
    }
}