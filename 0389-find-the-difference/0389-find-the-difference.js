/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
 s = s.trim().split('');
  t = t.split('');
    let sScore = 0;
  let tScore = 0;
  s.forEach((v) => {
    sScore += v.charCodeAt();
  });
  t.forEach((v) => {
    tScore += v.charCodeAt();
  });
  return String.fromCharCode(tScore - sScore);
};