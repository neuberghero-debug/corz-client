package gg.corz;

public record lIiIilliIiIill(String id, float pitch, float volume) {
   private final float iIliIiIIiIlliIiIIi;
   private final float llliIiIIiilliIiIIi;
   private final String IIliIiIIilIliIiIIi;

   public lIiIilliIiIill(String id, float pitch, float volume) {
      this.IIliIiIIilIliIiIIi = id;
      this.iIliIiIIiIlliIiIIi = pitch;
      this.llliIiIIiilliIiIIi = volume;
   }

   public String IliIlllilIi() {
      return this.IIliIiIIilIliIiIIi;
   }

   public float iIlIlllllill() {
      return this.llliIiIIiilliIiIIi;
   }

   public float liiiIIllIl() {
      return this.iIliIiIIiIlliIiIIi;
   }
}
