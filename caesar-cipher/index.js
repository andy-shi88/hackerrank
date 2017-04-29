process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////
function caesarCipher(plain, key){
    var result = "";
    var lowercase_aKey = 97;
    var uppercase_aKey = 65;
    var lowercase_zKey = 122;
    var uppercase_zKey = 90;

    for(var i in plain) {
        var p_n = plain.charCodeAt(i);
        var res_key = p_n + key;
        if(p_n >= lowercase_aKey && p_n <= lowercase_zKey) {
            var in_key = (res_key - lowercase_aKey) % 26;
            result += String.fromCharCode(lowercase_aKey + in_key);
        }else if(p_n >= uppercase_aKey && p_n <=uppercase_zKey) {
            var in_key = (res_key - uppercase_aKey) % 26;
            result += String.fromCharCode(uppercase_aKey + in_key);
        }else {
            result += plain[i];
        }
    }
    return result;
}
function main() {
    var n = parseInt(readLine());
    var s = readLine();
    var k = parseInt(readLine());
    var cipher = caesarCipher(s, k);
    console.log(cipher);
}
