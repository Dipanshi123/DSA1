class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int count = 0;

        while (left <= right) {

            // Lightest + heaviest can share a boat
            if (people[left] + people[right] <= limit) {
                left++;
            }

            // Heaviest person gets a boat
            right--;

            count++;
        }

        return count;
    }
}