/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let result = ''
    let length=address.length
    for (let i = 0; i < length; i++) {
        if (address[i] === '.') {
            result += '[.]'
        } else {
            result += address[i]
        }
    }
    return result
};