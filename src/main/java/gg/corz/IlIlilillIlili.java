package gg.corz;

public record IlIlilillIlili(
   llliIIIiilliIIIi mode,
   IiilIlIlliilIlIl interiorClarity,
   Iiiliiiliiliii layerMode,
   float ghostOpacity,
   float missingOpacity,
   float wrongBlockOpacity,
   float wrongStateOpacity,
   float occludedOpacity,
   float interiorFadeRadius,
   boolean renderCorrect,
   boolean renderMissing,
   boolean renderIncorrect,
   boolean missingThroughWalls,
   boolean outlines,
   float outlineWidth,
   float outlineOpacity,
   int renderDistance,
   int rebuildBudget,
   int playerY,
   boolean showBox,
   boolean showOrigin,
   boolean textured,
   int correctColor,
   int missingColor,
   int wrongBlockColor,
   int wrongStateColor,
   int extraColor,
   IIliIiilIliIii style,
   boolean litematicaTranslucent
) {
   private final float liIiiiIIIl;
   private final int iiliiiIIIl;
   private final int liiiiiIIIl;
   private final int IiiiiiIIIl;
   private final boolean IlliiiIIIl;
   private final boolean iIliiiIIIl;
   private final IiilIlIlliilIlIl lIIiiiIIIl;
   private final boolean iIiiiiIIIl;
   private final int iiiiiiIIIl;
   private final int iliiiiIIIl;
   private final Iiiliiiliiliii iIIiiiIIIl;
   private final float IiliiiIIIl;
   private final IIliIiilIliIii IIIIIIlIIl;
   private final boolean lIiiiiIIIl;
   private final float illiiiIIIl;
   private final int liliiiIIIl;
   private final float IlIiiiIIIl;
   private final float llIiiiIIIl;
   private final float iiIiiiIIIl;
   private final boolean lIIIIIlIIl;
   private final int IIiiiiIIIl;
   private final int lliiiiIIIl;
   private final float ilIiiiIIIl;
   private final boolean lIliiiIIIl;
   private final float IiIiiiIIIl;
   private final boolean IIliiiIIIl;
   private final boolean IliiiiIIIl;
   private final boolean llliiiIIIl;
   private final llliIIIiilliIIIi IIIiiiIIIl;

   static float Iiilliiliiil(float edge0, float edge1, float x) {
      if (edge1 <= edge0) {
         return x < edge0 ? 0.0F : 1.0F;
      } else {
         float var3 = Math.max(0.0F, Math.min(1.0F, (x - edge0) / (edge1 - edge0)));
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   public float IIIIllIIIl() {
      return this.IiIiiiIIIl;
   }

   public IiilIlIlliilIlIl Illillliilli() {
      return this.lIIiiiIIIl;
   }

   public boolean liiiIIllIl() {
      return this.IIIIIIlIIl == IIliIiilIliIii.lIIIlIiIIl;
   }

   public int iIlllIllll() {
      return this.iiiiiiIIIl;
   }

   public float IIillIiliIil() {
      IiilIlIlliilIlIl var1 = this.IIlllIlliIll();
      if (var1 == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 1.0F;
      } else {
         return var1 == IiilIlIlliilIlIl.lIlIIIIiIl ? 0.0F : 0.01F;
      }
   }

   public float iIIIlIlIIl() {
      return this.liIiiiIIIl;
   }

   public float lilIliilIl() {
      return this.illiiiIIIl;
   }

   public long IliIlllilIi() {
      long var1 = (long)this.IIIiiiIIIl.ordinal();
      var1 = var1 * 31L + (long)this.IIIIIIlIIl.ordinal();
      var1 = var1 * 31L + (long)this.iIIiiiIIIl.ordinal();
      var1 = var1 * 31L + (long)(this.IIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.lIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.iIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.llliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.IliiiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)Math.round(this.llIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.ilIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.IiIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.illiiiIIIl * 4.0F);
      var1 = var1 * 31L + (long)Math.round(this.IiliiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)(this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl ? 1 : 0);
      if (this.iIIiiiIIIl != Iiiliiiliiliii.iIIlllIlIl || this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl) {
         var1 = var1 * 31L + (long)this.IIiiiiIIIl;
      }

      return var1;
   }

   public boolean IiIIlliIIl() {
      return this.IIliiiIIIl;
   }

   public float Ililllililil(float densityScale, float dist) {
      if (this.IIlllIlliIll() == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 1.0F;
      } else {
         float var3 = this.Illlllllilll(dist);
         float var4 = this.Iilllilliill(dist);
         float var5 = Iiilliiliiil(var3, var4, densityScale);
         return this.IIillIiliIil() + (1.0F - this.IIillIiliIil()) * var5;
      }
   }

   public boolean illIlIilIl() {
      return this.llliiiIIIl;
   }

   public float IIiilIiiiIii() {
      return this.IlIiiiIIIl;
   }

   public float Iilllilliill(float densityScale) {
      return this.IIlllIlliIll() == IiilIlIlliilIlIl.iiIIIIIiIl ? 0.0F : Math.max(0.5F, this.iiIiiiIIIl) * densityScale;
   }

   public float llIIlilIIl() {
      return this.iiIiiiIIIl;
   }

   public float IlIlllIlilIl() {
      return this.liiiIIllIl() ? 1.0F : this.IiliiiIIIl;
   }

   public float Iiiiliiiiiii() {
      return this.ilIiiiIIIl;
   }

   public int ilIllIiIll() {
      return this.iliiiiIIIl;
   }

   private IiilIlIlliilIlIl IIlllIlliIll() {
      return this.liiiIIllIl() ? IiilIlIlliilIlIl.iiIIIIIiIl : this.lIIiiiIIIl;
   }

   public float IiIlliIliiIl() {
      if (!this.liiiIIllIl()) {
         return this.illiiiIIIl;
      } else {
         return this.IlliiiIIIl ? 3.0F : 1.0F;
      }
   }

   public float IIIllIIliIIl(IIlIlIllIlIlIl cls, boolean ghostDrawn) {
      if (this.liiiIIllIl()) {
         return IililIllililIl.liiiIIllIl(cls);
      } else if (cls == IIlIlIllIlIlIl.lllIIIIllillIIIIll && ghostDrawn) {
         return 0.0F;
      } else {
         return cls == IIlIlIllIlIlIl.iIlIIIIllIllIIIIll ? 0.0F : this.lIiiIiIlilli(cls);
      }
   }

   private int IiIiliIiiiIi() {
      long var2 = -8792142579211459646L;
      var2 ^= ((long)this.iIIiiiIIIl.IliIlllilIi() << 32 ^ var2) & -1L << 32;
      if (this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl && (int)(var2 >>> 32) < 0) {
         var2 ^= (4294967296L ^ var2) & -1L << 32;
      }

      return (int)(var2 >>> 32);
   }

   public int IIiIllIiIl() {
      return this.liliiiIIIl;
   }

   public int IIllllIlll() {
      return this.liiiiiIIIl;
   }

   public boolean iiiIlIIIll() {
      return this.iIiiiiIIIl;
   }

   public int liIlliiIll() {
      return this.IiiiiiIIIl;
   }

   public boolean iIlIlllllill(IIlIlIllIlIlIl cls) {
      if (!this.IliiiiIIIl || this.IIIiiiIIIl == llliIIIiilliIIIi.IiiiiIliil || this.IIIiiiIIIl == llliIIIiilliIIIi.liiiiIliil) {
         return false;
      } else if (this.liiiIIllIl()) {
         return cls == IIlIlIllIlIlIl.lllIIIIllillIIIIll && this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
      } else {
         return switch (cls) {
            case lllIIIIllillIIIIll -> this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
            case IilIIIIlllilIIIIll, iilIIIIllIIiIIIIll -> this.iIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.iIiiiIliil;
            case iIlIIIIllIllIIIIll -> this.IIliiiIIIl && this.IIIiiiIIIl == llliIIIiilliIIIi.lIiiiIliil;
            case lIiIIIIlliIiIIIIll, IliIIIIlllliIIIIll -> false;
         };
      }
   }

   public boolean iiIIlIIlIl() {
      return this.lIliiiIIIl;
   }

   public Iiiliiiliiliii Iilililiiili() {
      return this.iIIiiiIIIl;
   }

   public llliIIIiilliIIIi IIlilIliiIli() {
      return this.IIIiiiIIIl;
   }

   public boolean IlIillIiilIi(int sectionMinY) {
      long var3 = 2961883210343031180L;
      var3 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? true : sectionMinY <= this.IIiiiiIIIl + (int)(var3 >>> 32) && sectionMinY + 15 >= this.IIiiiiIIIl - (int)(var3 >>> 32);
   }

   public IIliIiilIliIii lllllillll() {
      return this.IIIIIIlIIl;
   }

   public boolean IilliliilIIi(IIlIlIllIlIlIl cls) {
      if (this.IIIiiiIIIl == llliIIIiilliIIIi.liiiiIliil || this.IIIiiiIIIl == llliIIIiilliIIIi.iliiiIliil) {
         return false;
      } else if (this.liiiIIllIl() && cls == IIlIlIllIlIlIl.iIlIIIIllIllIIIIll) {
         return false;
      } else {
         return switch (cls) {
            case lllIIIIllillIIIIll -> this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
            case IilIIIIlllilIIIIll, iilIIIIllIIiIIIIll, lIiIIIIlliIiIIIIll -> this.iIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.iIiiiIliil;
            case iIlIIIIllIllIIIIll -> this.IIliiiIIIl && this.IIIiiiIIIl == llliIIIiilliIIIi.lIiiiIliil;
            case IliIIIIlllliIIIIll -> false;
         };
      }
   }

   public int iIiIlIliIl() {
      return this.iiliiiIIIl;
   }

   public boolean lIlIliIlIl() {
      return this.iIliiiIIIl;
   }

   public int lliIliliIl() {
      return this.IIiiiiIIIl;
   }

   public float Iliilliiilii() {
      return this.llIiiiIIIl;
   }

   public boolean IiiIlliiIl() {
      return this.lIiiiiIIIl;
   }

   public boolean lIIlliIIll() {
      return this.IliiiiIIIl;
   }

   public float Illlllllilll(float densityScale) {
      IiilIlIlliilIlIl var2 = this.IIlllIlliIll();
      if (var2 == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 0.0F;
      } else {
         float var3 = Math.max(0.5F, this.iiIiiiIIIl) * densityScale;
         return var3 * (var2 == IiilIlIlliilIlIl.lIlIIIIiIl ? 0.55F : 0.3F);
      }
   }

   public float iliIiiliiiii(IIlIlIllIlIlIl cls) {
      return this.IIIllIIliIIl(cls, this.iIlIlllllill(cls));
   }

   public float lIiiIiIlilli(IIlIlIllIlIlIl cls) {
      return switch (cls) {
         case lllIIIIllillIIIIll -> this.llIiiiIIIl;
         case IilIIIIlllilIIIIll -> this.ilIiiiIIIl;
         case iilIIIIllIIiIIIIll -> this.IiIiiiIIIl;
         case iIlIIIIllIllIIIIll -> 0.1F;
         case lIiIIIIlliIiIIIIll -> this.ilIiiiIIIl;
         case IliIIIIlllliIIIIll -> 0.0F;
      };
   }

   public boolean Iillllilll() {
      return this.lIIIIIlIIl;
   }

   public boolean IllIllllIl() {
      return this.IlliiiIIIl;
   }

   public IlIlilillIlili(
      llliIIIiilliIIIi mode,
      IiilIlIlliilIlIl interiorClarity,
      Iiiliiiliiliii layerMode,
      float ghostOpacity,
      float missingOpacity,
      float wrongBlockOpacity,
      float wrongStateOpacity,
      float occludedOpacity,
      float interiorFadeRadius,
      boolean renderCorrect,
      boolean renderMissing,
      boolean renderIncorrect,
      boolean missingThroughWalls,
      boolean outlines,
      float outlineWidth,
      float outlineOpacity,
      int renderDistance,
      int rebuildBudget,
      int playerY,
      boolean showBox,
      boolean showOrigin,
      boolean textured,
      int correctColor,
      int missingColor,
      int wrongBlockColor,
      int wrongStateColor,
      int extraColor,
      IIliIiilIliIii style,
      boolean litematicaTranslucent
   ) {
      this.IIIiiiIIIl = mode;
      this.lIIiiiIIIl = interiorClarity;
      this.iIIiiiIIIl = layerMode;
      this.IlIiiiIIIl = ghostOpacity;
      this.llIiiiIIIl = missingOpacity;
      this.ilIiiiIIIl = wrongBlockOpacity;
      this.IiIiiiIIIl = wrongStateOpacity;
      this.liIiiiIIIl = occludedOpacity;
      this.iiIiiiIIIl = interiorFadeRadius;
      this.IIliiiIIIl = renderCorrect;
      this.lIliiiIIIl = renderMissing;
      this.iIliiiIIIl = renderIncorrect;
      this.IlliiiIIIl = missingThroughWalls;
      this.llliiiIIIl = outlines;
      this.illiiiIIIl = outlineWidth;
      this.IiliiiIIIl = outlineOpacity;
      this.liliiiIIIl = renderDistance;
      this.iiliiiIIIl = rebuildBudget;
      this.IIiiiiIIIl = playerY;
      this.lIiiiiIIIl = showBox;
      this.iIiiiiIIIl = showOrigin;
      this.IliiiiIIIl = textured;
      this.lliiiiIIIl = correctColor;
      this.iliiiiIIIl = missingColor;
      this.IiiiiiIIIl = wrongBlockColor;
      this.liiiiiIIIl = wrongStateColor;
      this.iiiiiiIIIl = extraColor;
      this.IIIIIIlIIl = style;
      this.lIIIIIlIIl = litematicaTranslucent;
   }

   public boolean IIIilIIiiIIi(int y) {
      long var3 = -3649321484629671784L;
      var3 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? true : Math.abs(y - this.IIiiiiIIIl) <= (int)(var3 >>> 32);
   }

   public int IlIllllIll() {
      return this.lliiiiIIIl;
   }
}
