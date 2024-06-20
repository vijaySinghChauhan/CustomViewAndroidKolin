
// script.js
document.addEventListener('DOMContentLoaded', () => {
    const customList = document.getElementById('customList');
    const fetchPostsButton = document.getElementById('107');

    console.log("hi")

    fetchPostsButton.addEventListener('click', () => {
        console.log("click")

        async()=>{
       await fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(posts => {
                customList.innerHTML = ''; // Clear the list before adding new items
                posts.forEach(post => {


                    console.log(post)

                    const listItem = document.createElement('li');
                    listItem.classList.add('custom-list-item');

                    const listItemText = document.createElement('span');
                    listItemText.textContent = `${post.id}: ${post.title}`;
                    listItemText.classList.add('list-item-text');

                    listItem.appendChild(listItemText);
                    customList.appendChild(listItem);
                });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
            });
        }
    });
});
