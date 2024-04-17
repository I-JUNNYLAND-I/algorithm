impl Solution {
    pub fn number_of_lines(widths: Vec<i32>, s: String) -> Vec<i32> {
        let mut lines = 1;
        let mut curr_line_width = 0;

        for c in s.chars() {
            let char_width = widths[c as usize - 'a' as usize];

            if curr_line_width + char_width > 100 {
                lines += 1;
                curr_line_width = 0;
            }

            curr_line_width += char_width;
        }

        vec![lines, curr_line_width]
    }
}