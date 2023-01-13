/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    address=address.split(".")
    return address.join("[.]")
};