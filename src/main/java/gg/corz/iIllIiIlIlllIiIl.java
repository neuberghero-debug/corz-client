package gg.corz;

public record iIllIiIlIlllIiIl(long cell, int tier, boolean sneak, String material, String face, float yaw, float pitch) {
   private final float IIilIliIll;
   private final int illlIliIll;
   private final float lIilIliIll;
   private final long llllIliIll;
   private final String lillIliIll;
   private final boolean IillIliIll;
   private final String iillIliIll;

   public String lIiiIiIlilli() {
      return this.iillIliIll;
   }

   public int liiiIIllIl() {
      return this.illlIliIll;
   }

   public float iliIiiliiiii() {
      return this.IIilIliIll;
   }

   public iIllIiIlIlllIiIl(long cell, int tier, boolean sneak, String material, String face, float yaw, float pitch) {
      this.llllIliIll = cell;
      this.illlIliIll = tier;
      this.IillIliIll = sneak;
      this.lillIliIll = material;
      this.iillIliIll = face;
      this.IIilIliIll = yaw;
      this.lIilIliIll = pitch;
   }

   public float IIIllIIliIIl() {
      return this.lIilIliIll;
   }

   public long IliIlllilIi() {
      return this.llllIliIll;
   }

   public String IilliliilIIi() {
      return this.lillIliIll;
   }

   public boolean iIlIlllllill() {
      return this.IillIliIll;
   }
}
