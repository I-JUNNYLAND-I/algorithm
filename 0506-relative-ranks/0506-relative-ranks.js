/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function(score) {
    return score
        .map((elem, index) => [elem, index + 1])
        .sort((a, b) => b[0] - a[0])
        .map((elem, index) => {
            if (index === 0) return ["Gold Medal", elem[1]]
            if (index === 1) return ["Silver Medal", elem[1]]
            if (index === 2) return ["Bronze Medal", elem[1]]
            return [index + 1 + "", elem[1]]
        })
        .sort((a, b) => a[1] - b[1])
        .map(elem => elem[0])
};