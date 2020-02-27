var app = new Vue({
    el: '#app',
    data: {
        pageInfo:'',
        pageNum:1
    },
    mounted() {
        console.log('view mounted');
        this.searchProduct();
    },
    methods: {
        handlePageChange(val){
            console.log('page change');
            this.pageNum=vall;
            this.searchProduct();
        },

        searchProduct(){
            axios.get('/product/search',{
                params:{
                    pageNum:this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handleProductUpdateClick(row){
            console.log('to product update click', row);
            location.href = 'product-update.html?productId=' + row.productId;
        },
        handleProductCreateClick(){
            console.log('to product create click');
            location.href = 'product-create.html';
        },
    },


})