package gg.corz;

public record iIIIIIliIlIIIIli(float p, String sound, float volume, float pitch) {
   private final float IiIiiIIlIi;
   private final float IIliiIIlIi;
   private final String liIiiIIlIi;
   private final float iiIiiIIlIi;

   public String liiiIIllIl() {
      return this.liIiiIIlIi;
   }

   public float IilliliilIIi() {
      return this.IIliiIIlIi;
   }

   public iIIIIIliIlIIIIli(float p, String sound, float volume, float pitch) {
      this.IiIiiIIlIi = p;
      this.liIiiIIlIi = sound;
      this.iiIiiIIlIi = volume;
      this.IIliiIIlIi = pitch;
   }

   public float iIlIlllllill() {
      return this.iiIiiIIlIi;
   }

   public float IliIlllilIi() {
      return this.IiIiiIIlIi;
   }
}
