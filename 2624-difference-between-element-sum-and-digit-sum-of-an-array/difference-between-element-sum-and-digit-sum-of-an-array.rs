impl Solution {
    pub fn difference_of_sum(nums: Vec<i32>) -> i32 {
        let first_sum: i32 = nums.iter().sum();
        let mut second_sum: i32 = 0;
        for num in nums {
            let digit: i32 = Self::split_digits(num).iter().sum();
            second_sum = second_sum + digit
        }

        first_sum.abs_diff(second_sum) as i32
    }

    fn split_digits(num: i32) -> Vec<i32> {
        let mut digits = Vec::new();
        let mut remaining = num;

        while remaining > 0 {
            digits.push(remaining % 10);
            remaining /= 10;
        }

        digits.reverse();
        digits
    }
}