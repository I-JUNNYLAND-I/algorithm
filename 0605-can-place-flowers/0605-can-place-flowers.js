/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    const bed = [1, 0, ...flowerbed, 0, 1];
    let temp = [];
    for (let i = 0; i < bed.length; i++) {
        if (bed[i] == 1) {
            temp.push(i);
        }
    }
    let count = 0;
    for (let j = 0; j < temp.length - 1; j++) {
        const start = temp[j];
        const end = temp[j + 1];
        const distance = end - start - 1;
        if (distance % 2 == 0) {
            count += (Math.floor(distance / 2) - 1);
        } else {
            count += Math.floor(distance / 2);
        }
    }
    return count >= n;
};