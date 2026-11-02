package gg.corz;

public record lilliIiiilliIi(float off, float self, float def, float move, float space, float elev, float haz, float minUseful, float maxSelfOpen) {
   private final float IlIililiillIililii;
   private final float iIilliliiIlillilii;
   private final float illlliliiIilllilii;
   private final float Iiilliliiliillilii;
   private final float IIilliliilIillilii;
   private final float iiilliliiIIIililii;
   private final float llilliliiilillilii;
   private final float lillliliiiilllilii;
   private final float lIIililiiiIIililii;

   public float liiiIIllIl() {
      return this.illlliliiIilllilii;
   }

   public lilliIiiilliIi(float off, float self, float def, float move, float space, float elev, float haz, float minUseful, float maxSelfOpen) {
      this.illlliliiIilllilii = off;
      this.lillliliiiilllilii = self;
      this.IIilliliilIillilii = def;
      this.iIilliliiIlillilii = move;
      this.llilliliiilillilii = space;
      this.Iiilliliiliillilii = elev;
      this.iiilliliiIIIililii = haz;
      this.lIIililiiiIIililii = minUseful;
      this.IlIililiillIililii = maxSelfOpen;
   }

   public float IilliliilIIi() {
      return this.IIilliliilIillilii;
   }

   public float lIiiIiIlilli() {
      return this.iIilliliiIlillilii;
   }

   public float IlIlllIlilIl() {
      return this.iiilliliiIIIililii;
   }

   public float iIlIlllllill() {
      return this.lillliliiiilllilii;
   }

   public float IIlllIlliIll() {
      return this.IlIililiillIililii;
   }

   public float IIIllIIliIIl() {
      return this.Iiilliliiliillilii;
   }

   public static lilliIiiilliIi IliIlllilIi(IiIililiIili p, IlIIIlilllIIIlil s) {
      IiIililiIili var2 = p == null ? IiIililiIili.ilIiiIlIlIiIiiIlIl : p;
      IlIIIlilllIIIlil var3 = s == null ? IlIIIlilllIIIlil.iliIiilIil : s;

      lilliIiiilliIi var4 = switch (var2) {
         case IlIiiIlIlllIiiIlIl -> new lilliIiiilliIi(1.2F, 0.6F, 0.7F, 0.25F, 0.6F, 0.3F, 2.0F, 3.0F, 14.0F);
         case ilIiiIlIlIiIiiIlIl -> new lilliIiiilliIi(1.0F, 0.9F, 1.0F, 0.3F, 0.8F, 0.3F, 2.0F, 4.0F, 11.0F);
         case liIiiIlIliiIiiIlIl -> new lilliIiiilliIi(0.7F, 1.3F, 1.6F, 0.35F, 0.6F, 0.4F, 2.5F, 5.0F, 8.0F);
         case IIliiIlIllIliiIlIl -> new lilliIiiilliIi(0.0F, 1.5F, 2.0F, 0.2F, 0.0F, 0.2F, 3.0F, 99.0F, 4.0F);
      };

      float var5 = switch (var3) {
         case iliIiilIil -> 1.15F;
         case IiiIiilIil -> 1.0F;
         case liiIiilIil -> 0.85F;
      };

      float var6 = switch (var3) {
         case iliIiilIil -> 2.0F;
         case IiiIiilIil -> 0.0F;
         case liiIiilIil -> -2.0F;
      };
      return new lilliIiiilliIi(
         var4.illlliliiIilllilii * var5,
         var4.lillliliiiilllilii,
         var4.IIilliliilIillilii,
         var4.iIilliliiIlillilii,
         var4.llilliliiilillilii,
         var4.Iiilliliiliillilii,
         var4.iiilliliiIIIililii,
         var4.lIIililiiiIIililii,
         var4.IlIililiillIililii + var6
      );
   }

   public float iliIiiliiiii() {
      return this.llilliliiilillilii;
   }

   public float IiIlliIliiIl() {
      return this.lIIililiiiIIililii;
   }
}
