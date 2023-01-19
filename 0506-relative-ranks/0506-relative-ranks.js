/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function (score) {
  let res = Array(score.length).fill(0);
  let tempStack = score.slice().sort((a, b) => a - b);
  let maxNum = -1;
  let index = -1;
  for (let i = 0; i < score.length; i++) {
    maxNum = tempStack.pop();
    index = score.indexOf(maxNum);
    if (i < 3) {
      i === 0
        ? (res[index] = 'Gold Medal')
        : i === 1
        ? (res[index] = 'Silver Medal')
        : (res[index] = 'Bronze Medal');
    } else {
      res[index] = String(i + 1);
    }
  }
  return res;
};
