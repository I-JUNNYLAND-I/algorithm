/**
 * @param {string[][]} paths
 * @return {string}
 */
var destCity = function(paths) {
    const departs = [];
    const arrives = [];
    paths.forEach(elem => {
        departs.push(elem[0]);
        arrives.push(elem[1]);
    })
    let entryPoint = departs[0];
    const goFrom = (depart) => {
        const index = departs.indexOf(depart);
        return arrives[index];
    }
    while (goFrom(entryPoint) != null) {
        entryPoint = goFrom(entryPoint);
    }
    return entryPoint
};