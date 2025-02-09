public class Monster {
    // Thuộc tính
    private int HP; // Điểm sức khỏe
    private int attackPoint; // Điểm tấn công
    private int defense; // Điểm phòng thủ
    private float speed; // Tốc độ di chuyển

    // Constructor
    public Monster(String name, int HP, int attackPoint, int defense, int speed) {
        this.HP = HP;
        this.attackPoint = attackPoint;
        this.defense = defense;
        this.speed = speed;
    }

    // Phương thức di chuyển
    public void move() {
        // Logic di chuyển quái vật
        System.out.println("Quái vật đang di chuyển với tốc độ: " + speed);
        // Có thể thêm logic để thay đổi vị trí của quái vật
    }

    // Phương thức tấn công người chơi
    public void attack(Player player) {
        int damage = attackPoint - player.getDefense(); // Tính sát thương
        if (damage > 0) {
            player.reduceHP(damage); // Giảm HP của người chơi
            System.out.println("Quái vật tấn công người chơi và gây ra " + damage + " sát thương!");
        } else {
            System.out.println("Tấn công không có hiệu lực!");
        }
    }

    // Phương thức sử dụng kỹ năng
    public void usingskill(Skill skill) {
        // Logic sử dụng kỹ năng
        System.out.println("Quái vật sử dụng kỹ năng: " + skill.getName());
        // Có thể thêm logic để áp dụng hiệu ứng của kỹ năng
    }
    public static void main(String[] args) {
        // Khởi tạo các quái vật với số liệu cụ thể
        Monster goblin = new Monster("Goblin", 50, 10, 5, 6);
        Monster troll = new Monster("Troll", 80, 15, 10, 4);
        Monster dragon = new Monster("Dragon", 150, 25, 15, 3);

        // Hiển thị thông tin quái vật
        goblin.displayInfo();
        troll.displayInfo();
        dragon.displayInfo();

        // Di chuyển quái vật
        goblin.move();
        troll.move();
        dragon.move();
    }

    private void displayInfo() {
    }

    // Getter và Setter nếu cần
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setPosition(int monsterX, int monsterY) {
    }
}