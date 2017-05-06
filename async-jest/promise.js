var fetch = require('node-fetch');

function getDummyPost() {
  return fetch('https://jsonplaceholder.typicode.com/posts/1/', {method: 'GET', mode: 'cors'}).then((res) => res.json())
}

module.export = getDummyPost;
