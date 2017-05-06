const getDummyPost = require('./promise');
describe('getDummyPost', () => {
  it('should fetch json data', () => {
    expect(getDummyPost).toHaveProperty('userId');
  });
});
