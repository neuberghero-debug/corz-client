package gg.corz;

import java.util.Locale;

public record lIIlIliiIIlIli(
   iiiIIiilIIIlIiil type,
   long fromFeet,
   long toFeet,
   double supportTop,
   double landingY,
   double landingMinX,
   double landingMaxX,
   double landingMinZ,
   double landingMaxZ,
   boolean headroomClear,
   int gapCells,
   int dropBlocks,
   boolean sprintRequired,
   boolean jumpRequired,
   boolean sneakForbidden,
   double takeoffNear,
   double takeoffFar,
   boolean narrowLanding,
   double brakeFrom,
   double maxTakeoffSpeed,
   int maxAirborneTicks,
   int completionWindowTicks,
   String reject
) {
   private final boolean IliIIIIIIl;
   private final boolean lilIIIIIIl;
   private final int IIIlIIIIIl;
   private final long IIlIIIIIIl;
   private final boolean lIiIIIIIIl;
   private final double liiIIIIIIl;
   private final int lIIlIIIIIl;
   public static final double IIllIIIIIl = 2.5;
   public static final double iiIlIIIIIl = 0.12;
   private final int IIiIIIIIIl;
   private final double lllIIIIIIl;
   private final double iliIIIIIIl;
   private final double IilIIIIIIl;
   private final long iiIIIIIIIl;
   private final double illIIIIIIl;
   private final double lliIIIIIIl;
   private final double iIlIIIIIIl;
   private final double iiiIIIIIIl;
   private final boolean IiiIIIIIIl;
   public static final double lIllIIIIIl = 0.6;
   public static final double ilIlIIIIIl = 0.26;
   public static final double llIlIIIIIl = 0.02;
   private final iiiIIiilIIIlIiil liIIIIIIIl;
   private final double lIlIIIIIIl;
   public static final double IiIlIIIIIl = 0.8;
   private final String iIIlIIIIIl;
   private final boolean iIiIIIIIIl;
   public static final double liIlIIIIIl = 0.24;
   private final int iilIIIIIIl;
   public static final int IlIlIIIIIl = 12;
   private final double IllIIIIIIl;

   public String lliIliliIl() {
      return this.iIIlIIIIIl;
   }

   public int IilliliilIIi() {
      return llIiIiililIiIiil.IIlllIlliIll(this.IIlIIIIIIl);
   }

   public boolean IIlllIlliIll(double y) {
      return Math.abs(y - this.iIlIIIIIIl) <= 0.02;
   }

   public int IIIIllIIIl() {
      return this.IIiIIIIIIl;
   }

   public static lIIlIliiIIlIli Iilllilliill(
      iiiIIiilIIIlIiil supportTop, long headClear, long lowCoverTop, double to, double bodyClear, boolean type, boolean narrowLanding, boolean from
   ) {
      long var32 = -5741747973849487373L;
      long var34 = 7639805449270827822L;
      long var36 = -3997203576917458811L;
      long var26 = 3612819426890566323L;
      long var28 = -7677405638285671717L;
      long var30 = 7535684220247572971L;
      var26 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(headClear) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(headClear) ^ var26) & -1L >>> 32;
      var28 ^= ((long)llIiIiililIiIiil.Illlllllilll(headClear) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(lowCoverTop) ^ var28) & -1L >>> 32;
      var30 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(lowCoverTop) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)llIiIiililIiIiil.Illlllllilll(lowCoverTop) ^ var30) & -1L >>> 32;
      var32 ^= ((long)Math.abs((int)var28 - (int)(var26 >>> 32)) << 32 ^ var32) & -1L << 32;
      var32 ^= ((long)Math.abs((int)var30 - (int)(var28 >>> 32)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)(supportTop == iiiIIiilIIIlIiil.ilIIiillil ? 1 : 0) << 32 ^ var34) & -1L << 32;
      String var23 = null;
      double var21;
      if (bodyClear > 0.0 && bodyClear <= 0.26) {
         var21 = (double)((int)(var30 >>> 32)) + bodyClear;
      } else if (to >= 0.8) {
         var21 = (double)((int)(var30 >>> 32) - 1) + to;
      } else {
         var21 = (double)((int)(var30 >>> 32));
         var23 = to <= 0.0
            ? IiiIlliiIl<"IiiIlliiIl","g5fuYTdgn6UizsyY/9WhsQlBgHtB3FgkqQOWp9v0sVAOg3j6B64=">()
            : IiiIlliiIl<"IiiIlliiIl","lwya4XmpcfBxJoRzsxGRPzTy2+nFzQAw8qgKWpNcx/5fJe9lh2QDZABInQ==">();
      }

      if (var23 == null && !type) {
         var23 = IiiIlliiIl<"IiiIlliiIl","bUFXDkVTKppFf6Jt/9FF0kNcRJvlYNo3qj9Y2s/LfGiEq1Vf+QkqPw==">();
      }

      if (var23 == null && !narrowLanding) {
         var23 = IiiIlliiIl<"IiiIlliiIl","AVQ5Mu1pvD3ZEswMB7I76/j8fH0V/GKWpetKQFewYdRGoTycUU0L">();
      }

      var34 ^= ((long)Math.max(0, (int)var26 - (int)(var30 >>> 32)) ^ var34) & -1L >>> 32;
      if (var23 == null && (int)(var34 >>> 32) != 0) {
         if ((int)(var32 >>> 32) == 2 && (int)var32 == 0 || (int)var32 == 2 && (int)(var32 >>> 32) == 0) {
            if ((int)(var30 >>> 32) > (int)var26) {
               var23 = IiiIlliiIl<"IiiIlliiIl","yyLsq6Y16Bf/Njc5JQ5cVjuKE1iBl1OgTooCdXPIIpkm0+DkXQ==">();
            } else if ((int)var34 > 1) {
               var23 = IiiIlliiIl<"IiiIlliiIl","V/F+RjyFrze0fIBQtW8UFA1l5+YKkXal01g8iOstSw8kWcRPfq2l7RU1BOSQ">();
            }
         } else {
            var23 = IiiIlliiIl<"IiiIlliiIl","J+J/0gZ2xRNbjVpTiU/kNTv9ubNHnizKrytLuHJRwLfn8sJO1+Gu8LTcpWQ=">();
         }
      }

      var36 ^= ((long)((int)(var34 >>> 32) != 0 ? 12 + 2 * (int)var34 + 4 : 0) << 32 ^ var36) & -1L << 32;
      return new lIIlIliiIIlIli(
         supportTop,
         headClear,
         lowCoverTop,
         to,
         var21,
         (double)((int)var28),
         (double)((int)var28) + 1.0,
         (double)((int)var30),
         (double)((int)var30) + 1.0,
         narrowLanding,
         (int)(var34 >>> 32) != 0 ? 1 : 0,
         (int)var34,
         false,
         (boolean)((int)(var34 >>> 32)),
         (boolean)((int)(var34 >>> 32)),
         (int)(var34 >>> 32) != 0 ? 1.5 : 0.0,
         (int)(var34 >>> 32) != 0 ? 1.9 : 0.0,
         from,
         (int)(var34 >>> 32) != 0 ? 2.5 : 0.0,
         (int)(var34 >>> 32) != 0 ? (from ? 0.12 : 0.24) : Double.POSITIVE_INFINITY,
         (int)(var36 >>> 32),
         (int)(var34 >>> 32) != 0 ? 40 : 0,
         var23
      );
   }

   public double illIlIilIl() {
      return this.liiIIIIIIl;
   }

   public int iliIiiliiiii() {
      return llIiIiililIiIiil.IiIlliIliiIl(this.iiIIIIIIIl);
   }

   public boolean IiIlliIliiIl(double z, double x) {
      return z >= this.IllIIIIIIl && z < this.lllIIIIIIl && x >= this.illIIIIIIl && x < this.IilIIIIIIl;
   }

   public boolean Illlllllilll(double y, double onGround, double z, boolean x) {
      return x && this.IiIlliIliiIl(y, z) && this.IIlllIlliIll(onGround);
   }

   public double IiIiliIiiiIi() {
      return this.iIlIIIIIIl;
   }

   public boolean iIIIlIlIIl() {
      return this.lIiIIIIIIl;
   }

   public double lIlIliIlIl() {
      return this.iliIIIIIIl;
   }

   public int IIiIllIiIl() {
      return this.IIIlIIIIIl;
   }

   public int iIlIlllllill() {
      return llIiIiililIiIiil.IiIlliIliiIl(this.IIlIIIIIIl);
   }

   public double iiIIlIIlIl() {
      return this.lliIIIIIIl;
   }

   public String IIillIiliIil() {
      return String.format(
         Locale.ROOT,
         IiiIlliiIl<"IiiIlliiIl","q43Nr4DSEq1IBAmiuVWtIKMFegVd2KcpmdtoblOprCWB/nFWYjUlnB7DUxVsFhf88BEqACrJsb9BamH+e0cT70f4qrwm+FbAaCYKTI7mRRpNXqG7opzrQuRdKnOg/dc/Rmk6tMC5d0nrOFtJw8XbsQ7AGnXfxsO1bktv8vsHJ1oQ7EQYPF7JF6nO8oYD3+naplsOiQ5bFxr3X2kiXephp9VGjrEtKFsBqP1GsVTX+j61n4EWxMY/">(),
         this.liIIIIIIIl,
         this.iliIiiliiiii(),
         this.IIIllIIliIIl(),
         this.IlIlllIlilIl(),
         this.iIlIlllllill(),
         this.IilliliilIIi(),
         this.lIiiIiIlilli(),
         this.lIlIIIIIIl,
         this.iIlIIIIIIl,
         this.iilIIIIIIl,
         this.IIiIIIIIIl,
         this.lIiIIIIIIl,
         this.IiiIIIIIIl,
         this.lliIIIIIIl,
         this.iliIIIIIIl,
         this.IIIlIIIIIl,
         this.lIIlIIIIIl,
         this.liiiIIllIl(),
         this.iIIlIIIIIl == null ? "" : IiiIlliiIl<"IiiIlliiIl","D8DScqttVcSZmyxgb7SkfMSOofbvsdOHhFCXB0ZP8uz7K95M">() + this.iIIlIIIIIl
      );
   }

   public int iIiIlIliIl() {
      return this.lIIlIIIIIl;
   }

   public double IIlilIliiIli() {
      return this.IllIIIIIIl;
   }

   public double Illillliilli() {
      return this.lllIIIIIIl;
   }

   public double IlIillIiilIi() {
      return this.lIlIIIIIIl;
   }

   public lIIlIliiIIlIli IliIlllilIi(String why) {
      return new lIIlIliiIIlIli(
         this.liIIIIIIIl,
         this.iiIIIIIIIl,
         this.IIlIIIIIIl,
         this.lIlIIIIIIl,
         this.iIlIIIIIIl,
         this.IllIIIIIIl,
         this.lllIIIIIIl,
         this.illIIIIIIl,
         this.IilIIIIIIl,
         this.lilIIIIIIl,
         this.iilIIIIIIl,
         this.IIiIIIIIIl,
         this.lIiIIIIIIl,
         this.iIiIIIIIIl,
         this.IliIIIIIIl,
         this.lliIIIIIIl,
         this.iliIIIIIIl,
         this.IiiIIIIIIl,
         this.liiIIIIIIl,
         this.iiiIIIIIIl,
         this.IIIlIIIIIl,
         this.lIIlIIIIIl,
         why
      );
   }

   public boolean Iliilliiilii() {
      return this.lilIIIIIIl;
   }

   public double IIiilIiiiIii() {
      return this.IilIIIIIIl;
   }

   public long Iiilliiliiil() {
      return this.iiIIIIIIIl;
   }

   public int IlIlllIlilIl() {
      return llIiIiililIiIiil.Illlllllilll(this.iiIIIIIIIl);
   }

   public iiiIIiilIIIlIiil Ililllililil() {
      return this.liIIIIIIIl;
   }

   public double Iilililiiili() {
      return this.illIIIIIIl;
   }

   public boolean llIIlilIIl() {
      return this.iIiIIIIIIl;
   }

   public int IIIllIIliIIl() {
      return llIiIiililIiIiil.IIlllIlliIll(this.iiIIIIIIIl);
   }

   public boolean IllIllllIl() {
      return this.IiiIIIIIIl;
   }

   public long IIIilIIiiIIi() {
      return this.IIlIIIIIIl;
   }

   public double lilIliilIl() {
      return this.iiiIIIIIIl;
   }

   public int lIiiIiIlilli() {
      return llIiIiililIiIiil.Illlllllilll(this.IIlIIIIIIl);
   }

   public int Iiiiliiiiiii() {
      return this.iilIIIIIIl;
   }

   public boolean liiiIIllIl() {
      return this.iIIlIIIIIl == null;
   }

   public boolean IiIIlliIIl() {
      return this.IliIIIIIIl;
   }

   public lIIlIliiIIlIli(
      iiiIIiilIIIlIiil type,
      long fromFeet,
      long toFeet,
      double supportTop,
      double landingY,
      double landingMinX,
      double landingMaxX,
      double landingMinZ,
      double landingMaxZ,
      boolean headroomClear,
      int gapCells,
      int dropBlocks,
      boolean sprintRequired,
      boolean jumpRequired,
      boolean sneakForbidden,
      double takeoffNear,
      double takeoffFar,
      boolean narrowLanding,
      double brakeFrom,
      double maxTakeoffSpeed,
      int maxAirborneTicks,
      int completionWindowTicks,
      String reject
   ) {
      this.liIIIIIIIl = type;
      this.iiIIIIIIIl = fromFeet;
      this.IIlIIIIIIl = toFeet;
      this.lIlIIIIIIl = supportTop;
      this.iIlIIIIIIl = landingY;
      this.IllIIIIIIl = landingMinX;
      this.lllIIIIIIl = landingMaxX;
      this.illIIIIIIl = landingMinZ;
      this.IilIIIIIIl = landingMaxZ;
      this.lilIIIIIIl = headroomClear;
      this.iilIIIIIIl = gapCells;
      this.IIiIIIIIIl = dropBlocks;
      this.lIiIIIIIIl = sprintRequired;
      this.iIiIIIIIIl = jumpRequired;
      this.IliIIIIIIl = sneakForbidden;
      this.lliIIIIIIl = takeoffNear;
      this.iliIIIIIIl = takeoffFar;
      this.IiiIIIIIIl = narrowLanding;
      this.liiIIIIIIl = brakeFrom;
      this.iiiIIIIIIl = maxTakeoffSpeed;
      this.IIIlIIIIIl = maxAirborneTicks;
      this.lIIlIIIIIl = completionWindowTicks;
      this.iIIlIIIIIl = reject;
   }
}
