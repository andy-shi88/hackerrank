var fetch = require('node-fetch');

const api = {
  getDummyPost() {
    return fetch('https://jsonplaceholder.typicode.com/posts/1/', {method: 'GET', mode: 'cors'}).then((res) => res.json())
  }
}

module.exports = api;
