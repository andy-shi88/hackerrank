const api = require('./promise');

describe('getDummyPost', () => {
  it('should fetch json data', () => {
    api.getDummyPost().then((res)=>{
      expect(res).toHaveProperty('userId');
    })
  });
});
