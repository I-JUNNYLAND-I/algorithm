/**
 * @param {number[][]} boxTypes
 * @param {number} truckSize
 * @return {number}
 */
var maximumUnits = function(boxTypes, truckSize) {
    return boxTypes
                    .sort((a, b) => b[1] - a[1])
                    .reduce((acc, cur) => {
                        if (acc.boxCount + cur[0] <= truckSize) {
                            acc.boxCount += cur[0];
                            acc.totalUnit += cur[1] * cur[0];
                        } else {
                            acc.totalUnit += cur[1] * (truckSize - acc.boxCount);
                            acc.boxCount = truckSize;
                        }
                        return acc
                    }, {boxCount:0, totalUnit:0}).totalUnit
};