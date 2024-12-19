function onRemove(id) {
    if (confirm("Do you want to remove?")) {
        // location.href = "/remove-book?id=" + id;
        location.href = `/remove-book?id=${id}`;
    }
}