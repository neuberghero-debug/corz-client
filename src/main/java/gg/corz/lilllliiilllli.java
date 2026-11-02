package gg.corz;

public record lilllliiilllli(boolean players, boolean mobs, boolean animals, boolean invisibles, boolean teammates, boolean bots) {
   public static final lilllliiilllli IIliIiIIIl = new lilllliiilllli(true, true, false, false, false, false);
   private final boolean IlIiIiIIIl;
   private final boolean ilIiIiIIIl;
   private final boolean iIIiIiIIIl;
   private final boolean llIiIiIIIl;
   private final boolean IiIiIiIIIl;
   private final boolean liIiIiIIIl;
   public static final lilllliiilllli iiIiIiIIIl = new lilllliiilllli(true, false, false, false, false, false);

   public lilllliiilllli(boolean players, boolean mobs, boolean animals, boolean invisibles, boolean teammates, boolean bots) {
      this.iIIiIiIIIl = players;
      this.IlIiIiIIIl = mobs;
      this.llIiIiIIIl = animals;
      this.ilIiIiIIIl = invisibles;
      this.IiIiIiIIIl = teammates;
      this.liIiIiIIIl = bots;
   }

   public boolean IIIllIIliIIl() {
      return this.iIIiIiIIIl;
   }

   public lilllliiilllli IliIlllilIi(boolean v) {
      return new lilllliiilllli(v, this.IlIiIiIIIl, this.llIiIiIIIl, this.ilIiIiIIIl, this.IiIiIiIIIl, this.liIiIiIIIl);
   }

   public boolean IIlllIlliIll() {
      return this.ilIiIiIIIl;
   }

   public lilllliiilllli lIiiIiIlilli(boolean v) {
      return new lilllliiilllli(this.iIIiIiIIIl, this.IlIiIiIIIl, this.llIiIiIIIl, this.ilIiIiIIIl, v, this.liIiIiIIIl);
   }

   public lilllliiilllli IilliliilIIi(boolean v) {
      return new lilllliiilllli(this.iIIiIiIIIl, this.IlIiIiIIIl, this.llIiIiIIIl, v, this.IiIiIiIIIl, this.liIiIiIIIl);
   }

   public boolean IiIlliIliiIl() {
      return this.llIiIiIIIl;
   }

   public boolean IlIlllIlilIl() {
      return this.IlIiIiIIIl;
   }

   public boolean Illlllllilll() {
      return this.IiIiIiIIIl;
   }

   public lilllliiilllli iIlIlllllill(boolean v) {
      return new lilllliiilllli(this.iIIiIiIIIl, this.IlIiIiIIIl, v, this.ilIiIiIIIl, this.IiIiIiIIIl, this.liIiIiIIIl);
   }

   public boolean Iilllilliill() {
      return this.liIiIiIIIl;
   }

   public lilllliiilllli liiiIIllIl(boolean v) {
      return new lilllliiilllli(this.iIIiIiIIIl, v, this.llIiIiIIIl, this.ilIiIiIIIl, this.IiIiIiIIIl, this.liIiIiIIIl);
   }

   public lilllliiilllli iliIiiliiiii(boolean v) {
      return new lilllliiilllli(this.iIIiIiIIIl, this.IlIiIiIIIl, this.llIiIiIIIl, this.ilIiIiIIIl, this.IiIiIiIIIl, v);
   }
}
