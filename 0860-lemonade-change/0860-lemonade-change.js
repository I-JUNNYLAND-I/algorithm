/**
 * @param {number[]} bills
 * @return {boolean}
 */
var lemonadeChange = function (bills) {
  let change = [0, 0, 0];

  for (let i = 0; i < bills.length; i++) {
    if (bills[i] === 5) change[0] += 1;
    else if (bills[i] === 10) {
      if (change[0] >= 1) {
        change[1] += 1;
        change[0] -= 1;
      } else return false;
    }
    else if (bills[i] === 20) {
      if (change[0] >= 1 && change[1] >= 1) {
        change[1] -= 1;
        change[0] -= 1;
      } else if (change[0] >= 3) {
        change[0] -= 3;
      } else return false;
    }
  }
  return true;
};
