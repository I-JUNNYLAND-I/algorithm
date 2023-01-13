/**
 * @param {string} date1
 * @param {string} date2
 * @return {number}
 */
var daysBetweenDates = function(date1, date2) {
    date1=new Date(date1)
    date2=new Date(date2)
    diffTime=Math.abs(date2-date1)
    console.log(diffTime)
    diffDay=Math.ceil(diffTime/(1000*60*60*24))
    return diffDay
};