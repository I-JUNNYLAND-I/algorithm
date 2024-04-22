class Solution {
    func nextGreatestLetter(_ letters: [Character], _ target: Character) -> Character {
        return letters.first { $0 > target } ?? letters[0]
    }
}