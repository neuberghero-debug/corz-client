package gg.corz;

public record iIIIlllIlIIlll(lilIiIiliilIiIil villager, IiIlIIiliIlIIi target, boolean hinted) {
   private final IiIlIIiliIlIIi IliIiilillliIiilil;
   private final boolean iliIiililIiiIiilil;
   private final lilIiIiliilIiIil lIiIiililiIiIiilil;

   public lilIiIiliilIiIil IliIlllilIi() {
      return this.lIiIiililiIiIiilil;
   }

   public IiIlIIiliIlIIi liiiIIllIl() {
      return this.IliIiilillliIiilil;
   }

   public iIIIlllIlIIlll(lilIiIiliilIiIil villager, IiIlIIiliIlIIi target, boolean hinted) {
      this.lIiIiililiIiIiilil = villager;
      this.IliIiilillliIiilil = target;
      this.iliIiililIiiIiilil = hinted;
   }

   public boolean iIlIlllllill() {
      return this.iliIiililIiiIiilil;
   }
}
