package gg.corz;

public record iIiiiilIliiiil(float time, String sound, float volume, float pitch) {
   private final float IiIIIIililiIIIIili;
   private final float iIIIIIiliIlIIIIili;
   private final String llIIIIiliilIIIIili;
   private final float iiIIIIiliIIlIIIili;

   public iIiiiilIliiiil(float time, String sound, float volume, float pitch) {
      this.iIIIIIiliIlIIIIili = time;
      this.llIIIIiliilIIIIili = sound;
      this.IiIIIIililiIIIIili = volume;
      this.iiIIIIiliIIlIIIili = pitch;
   }

   public String liiiIIllIl() {
      return this.llIIIIiliilIIIIili;
   }

   public float IliIlllilIi() {
      return this.iIIIIIiliIlIIIIili;
   }

   public float iIlIlllllill() {
      return this.IiIIIIililiIIIIili;
   }

   public float IilliliilIIi() {
      return this.iiIIIIiliIIlIIIili;
   }
}
