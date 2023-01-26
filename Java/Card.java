class Card extends Payment {
    String numberCard;
    String dateCard;
    String cvv;

    public Card(Integer id, String numberCard, String dateCard, String cvv) {
        super(id);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }
}
