impl Solution {
    pub fn next_greatest_letter(letters: Vec<char>, target: char) -> char {
        let partition = letters.partition_point(|letter| letter <= &target);
        letters[partition % letters.len()]
    }
}