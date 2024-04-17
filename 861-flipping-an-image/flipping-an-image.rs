impl Solution {
    pub fn flip_and_invert_image(image: Vec<Vec<i32>>) -> Vec<Vec<i32>> {
        let mut result = Vec::new();
        let mut real_result = Vec::new();

        for mut first in image {
            first.reverse();
            result.push(first);
        }

        for second in result {
            let result: Vec<i32> = second.iter()
                .map(|&value| if value == 1 { 0 } else { 1 })
                .collect();
            real_result.push(result);
        }

        real_result
    }
}