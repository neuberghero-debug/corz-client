package gg.corz;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import net.minecraft.class_4184;

public class IiIliIllliIliIll extends ilIllIiIll {
   private String lIIIIiilll;
   private long llIIIiilll;
   private static final long llliililll = 650000000L;
   private final iliiliilIiiiliil iIiiililll;
   private String IIIIIiilll;
   private final IIIIlilllIIIlill lIiiililll;
   private final lIIIlIiliIIIlIil liiiililll;
   private final IIIIlilllIIIlill IIiiililll;
   private final IIIIlilllIIIlill iiliililll;
   private final IiIliiliIlii Iiiiililll;
   private final IIIIlilllIIIlill lliiililll;
   private float IlIIIiilll;
   private final IIIIlilllIIIlill liliililll;
   private static final float illiililll = 1.8181818E-9F;
   public static final String[] Illiililll;
   private long iIIIIiilll;
   private float ilIIIiilll;
   private final IIIIlilllIIIlill Iliiililll;
   private long iiiiililll;
   private final lliliIIiililiIIi Iiliililll;
   private final IIIIlilllIIIlill iliiililll;

   public float lIIlliIIll() {
      long var7 = -8920481423199622134L;
      long var1 = System.nanoTime();
      if (this.llIIIiilll < (1273847539879831100L ^ 1273847539879831100L)) {
         this.llIIIiilll = var1;
      }

      long var3 = Math.max(0L, Math.min(var1 - this.llIIIiilll, 7148269001850155692L ^ 7148269001893756972L));
      this.llIIIiilll = var1;
      var7 ^= ((long)(this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null ? 1 : 0) << 32 ^ var7) & -1L << 32;
      float var6 = (float)var3 * 1.8181818E-9F;
      this.IlIIIiilll = (int)(var7 >>> 32) != 0 ? Math.min(1.0F, this.IlIIIiilll + var6) : Math.max(0.0F, this.IlIIIiilll - var6);
      return IIllllIlll(this.IlIIIiilll);
   }

   public boolean liilliiill(GpuTextureView target, int size) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && target != null && size > 0) {
         long var3 = System.nanoTime();
         this.Iillllilll(var3, size, size, true);
         this.lIilliIill(target, var3, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   private float lllllillll(long now) {
      String var3 = this.Iiliililll.Iilllilliill();
      if (this.IIIIIiilll == null) {
         this.IIIIIiilll = var3;
      }

      if (!var3.equals(this.IIIIIiilll)) {
         this.lIIIIiilll = this.IIIIIiilll;
         this.IIIIIiilll = var3;
         this.iIIIIiilll = now;
      }

      if (this.lIIIIiilll == null) {
         return 1.0F;
      } else {
         float var4 = (float)(now - this.iIIIIiilll) / 6.5E8F;
         if (var4 >= 1.0F) {
            this.lIIIIiilll = null;
            return 1.0F;
         } else {
            return IIllllIlll(Math.max(0.0F, var4));
         }
      }
   }

   @Override
   public void Illillliilli() {
      this.llIIIiilll = System.nanoTime();
   }

   public void Ilillllill(float fade) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !(fade <= 0.0F)) {
         GpuTextureView var2 = Iiiilllliiilll.method_1522().method_71639();
         if (var2 != null) {
            long var3 = System.nanoTime();
            this.Iillllilll(var3, Iiiilllliiilll.method_22683().method_4489(), Iiiilllliiilll.method_22683().method_4506(), false);
            this.lIilliIill(var2, var3, (float)this.lIiiililll.Iilllilliill() * fade);
         }
      }
   }

   static {
      String[] var10000 = new String[-1760515852 - 55 ^ 17 ^ -1760515925];
      var10000[0] = IliIlllilIi<"IliIlllilIi","pRHi5oycmCxjz384gHHSm03Ilfe+QeV1vWf4e4kGVPQV">();
      var10000[1] = IliIlllilIi<"IliIlllilIi","QvbF0voFIxt77tTxefeuz3+YSFX7wPBu+iXGRejglxk04A==">();
      var10000[2] = IliIlllilIi<"IliIlllilIi","//NMeuF2C1nl63jy/zW1wRnUYR6IHup5UTsFm7uz43usLA==">();
      var10000[3] = IliIlllilIi<"IliIlllilIi","JlvuiaxcB6F9T6c0Bxak6sKVqPAcTQZNSc0ShtzcL1ih">();
      var10000[4] = IliIlllilIi<"IliIlllilIi","eTY0NAmE+pB3XfT2MB/iP5aSc9X2o2Tbdivktbb5ra7lEg==">();
      var10000[5] = IliIlllilIi<"IliIlllilIi","fxYfRjMiv5aLRm587nrihtIMnhYSHvTnQg/bRX7Fem0Ctiy4Yb1kU62jbw==">();
      var10000[-549142971 * -57 * 1059797125 ^ -1824643415] = IliIlllilIi<"IliIlllilIi","5P95SZ/zID3fy3Vl2tDW5A9Y1BLRxesi40R2psPLKHjl1eZ6h2M=">();
      Illiililll = var10000;
   }

   private float iIlllIllll(long now) {
      if (this.iiiiililll < (6114779675756264733L ^ 6114779675756264733L)) {
         this.iiiiililll = now;
      }

      return (float)(
         (double)(now - this.iiiiililll)
            / Double.longBitsToDouble(6965283864163526122L ^ 2406159840188179946L)
            % Double.longBitsToDouble(-4923786713211057223L ^ -353794175708935239L)
      );
   }

   private void lIilliIill(GpuTextureView now, long baseAlpha, float target) {
      float var5 = this.lllllillll(baseAlpha);
      if (this.lIIIIiilll != null) {
         this.iilllIIill(now, this.lIIIIiilll, target);
      }

      this.iilllIIill(now, this.IIIIIiilll, target * var5);
   }

   public float IlIllllIll() {
      this.ilIIIiilll = this.lIIlliIIll();
      return this.ilIIIiilll;
   }

   public void ilillIiill() {
      this.Ilillllill(1.0F);
   }

   private boolean iilllIIill(GpuTextureView target, String which, float layerAlpha) {
      RenderPipeline var4 = IiIliiliIlii.IliIlllilIi(which);
      if (!this.Iiiiililll.liiiIIllIl(var4)) {
         var4 = IiIliiliIlii.IliIlllilIi(IliIlllilIi<"IliIlllilIi","JlvuiaxcB6F9T6c0Bxak6sKVqPAcTQZNSc0ShtzcL1ih">());
      }

      if (!this.Iiiiililll.liiiIIllIl(var4)) {
         return false;
      } else {
         this.liiiililll.iililiIIil = layerAlpha;

         try {
            this.Iiiiililll.IilliliilIIi(target, var4, this.liiiililll);
            return true;
         } catch (Throwable var6) {
            this.Iiiiililll.iIlIlllllill(var4);
            return false;
         }
      }
   }

   private void Iillllilll(long height, int width, int hemisphere, boolean now) {
      class_4184 var6 = Iiiilllliiilll.field_1773.method_19418();
      this.liiiililll.IIliliIIil = (float)width;
      this.liiiililll.lIliliIIil = (float)hemisphere;
      this.liiiililll.iIliliIIil = (float)Math.toRadians((double)(-var6.method_19330()));
      this.liiiililll.IlliliIIil = (float)Math.toRadians((double)var6.method_19329());
      this.liiiililll.IliIlllilIi(this.iIiiililll.Iilllilliill() & ((--1896691920 >>> 11 | --1896691920 << 21) ^ 452058712));
      this.liiiililll.lililiIIil = this.iIlllIllll(height);
      this.liiiililll.IIiiliIIil = (float)this.liliililll.Iilllilliill();
      this.liiiililll.lIiiliIIil = (float)this.iiliililll.Iilllilliill();
      this.liiiililll.iIiiliIIil = (float)this.IIiiililll.Iilllilliill();
      this.liiiililll.IliiliIIil = IiilIIiliilIIi.liiiIIllIl();
      this.liiiililll.lliiliIIil = (float)this.Iliiililll.Iilllilliill();
      this.liiiililll.iliiliIIil = (float)this.lliiililll.Iilllilliill();
      this.liiiililll.IiiiliIIil = (float)this.iliiililll.Iilllilliill();
      this.liiiililll.liiiliIIil = now;
      this.liiiililll.iiiiliIIil = !now && iIIiliIiIlIiliIi.lIiiIiIlilli(iliIliIlIiiIliIl.lIiIIiiIll, var6.method_23767(), this.liiiililll.IIIIiiIIil);
   }

   public float ilIllIiIll() {
      return this.ilIIIiilll;
   }

   public boolean liIlliiIll() {
      return this.IliIlllilIi() || this.IlIIIiilll > 0.5F;
   }

   public IiIliIllliIliIll() {
      super(IliIlllilIi<"IliIlllilIi","ozwB6KDgOmVfbex6ElAmYLRtgUlfof8jo4WvRG1E6s52lCdqCqg=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.Iiliililll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","ptozhDHwhN/biUAnlE9ysFnxNkNtB6uA4m3w6r79VBY=">(),
         IliIlllilIi<"IliIlllilIi","MtBv5Le22r4SCJlQic9B3lmgKiyZpKoO+SXOUzmqdigz1Qv3vNihe9B89EA=">(),
         IliIlllilIi<"IliIlllilIi","pRHi5oycmCxjz384gHHSm03Ilfe+QeV1vWf4e4kGVPQV">(),
         Illiililll
      );
      this.liliililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","9nIaZqTuB/vFvdsZ3bkNWuwPrWpxAt281sI1KqMhQCPo">(),
         IliIlllilIi<"IliIlllilIi","WKuly3OIyO7EEPjoTtMeE+yqfzjxbEEywqkjXHBd3RX/GR2NhCDJcLTB5A==">(),
         1.0,
         0.1,
         5.0,
         0.1
      );
      this.iiliililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","s4V9jkmmA1/QOwbIS6l4VkH1r2aqtfq0t77i2Eq3DH/U">(),
         IliIlllilIi<"IliIlllilIi","canC/4ZLPvf4z3QyvPMxEvEfNwHzMTCBuv+GOg99koSIB/iJvG0WniuKqtW4SGegT9xvsmfcRccf9DzWdJ+B54w66d5cePoplnRiUwgwigKmDm6DfrDE8q+YLQbw8Q==">(),
         5.0,
         1.0,
         20.0,
         0.5
      );
      this.IIiiililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","skkEgFQtZVcllwz+moRnhXfJ/nanH8VRjP4K92MbVnJgN7lyaw==">(),
         IliIlllilIi<"IliIlllilIi","NtPDsWqYqjn+i5cbwtZcJKvrqZk2ASIog1a1WGMBN2RoFnnJKgQ/hVuy1+M=">(),
         0.01,
         0.001,
         0.05,
         0.001
      );
      this.lIiiililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","MzHl20Fo6GT/U/Prxezk0yyqdubLKc8tjBwDbc6N42Qz">(),
         IliIlllilIi<"IliIlllilIi","sXCbNuE1xEkZKLQBSy56TKrolv6XD+2S76LzuWSSxrTXc8A=">(),
         1.0,
         0.3,
         1.0,
         0.05
      );
      this.iIiiililll = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","RUfQSP2xFy1LzXgltsaqnwlbQ2aONK2YuKsvAY5HVipM">(),
         IliIlllilIi<"IliIlllilIi","dQjXl4RE4cwkQ3azCSA/joidg7vXXfA0y0l3a66Qgg5ePUO4Uj05+nDLvA==">(),
         -16738561
      );
      this.Iliiililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","vAodQfrmtL2VcXNMMuiR4RB5z/PWKdrXJeuJC69+8rzeXQjDbW+3">(),
         IliIlllilIi<"IliIlllilIi","OHPX7ztbqdHKPgCuv4BWoyo9nlNROnI8uU+oO7WyKF2DFXl+WNTYwz+yji0zsDCUsN7y2Z/3BMwDmp4+6A==">(),
         1.0,
         0.4,
         2.5,
         0.05
      );
      this.lliiililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","SqRjyDyiOGPGJzawrk2sMA7auDKon+nJJATfK/wypoRflncfMw==">(),
         IliIlllilIi<"IliIlllilIi","4oDGlJgdQEl1iK3N5JFtvoh3hgZ+cgDbMW4fh7zFPiSLLhX6Q2ScH55YTW7tHRSwN5pM2OFWMrHMbmrZOr5NsgFDAAh/K10WlHmDXm8VsQA0mA==">(),
         0.3,
         0.0,
         1.0,
         0.05
      );
      this.iliiililll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","r1/6UQEKghz74DXTq1Cxfvt4rbCh9z40c+DFn0NgJ13r5u2lalRelYn7gjc=">(),
         IliIlllilIi<"IliIlllilIi","zI3EaPLTW92Nd9vQytelJJ/1zhL5v+SKMy8iNn/hS23gZkZvV+zuyjm+4kOwAlmdNsKqZnByfcEJG7i2mOn5Fe9jimemhJZgf4U=">(),
         1.0,
         0.0,
         2.0,
         0.05
      );
      this.Iiiiililll = new IiIliiliIlii();
      this.liiiililll = new lIIIlIiliIIIlIil();
      this.iiiiililll = -1L;
      this.llIIIiilll = -1L;
      this.Iliiililll.iIlIlllllill(IliIlllilIi<"IliIlllilIi","eTY0NAmE+pB3XfT2MB/iP5aSc9X2o2Tbdivktbb5ra7lEg==">());
      this.lliiililll.iIlIlllllill(IliIlllilIi<"IliIlllilIi","eTY0NAmE+pB3XfT2MB/iP5aSc9X2o2Tbdivktbb5ra7lEg==">());
      this.iliiililll.iIlIlllllill(IliIlllilIi<"IliIlllilIi","eTY0NAmE+pB3XfT2MB/iP5aSc9X2o2Tbdivktbb5ra7lEg==">());
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.Iiliililll,
            this.liliililll,
            this.iiliililll,
            this.IIiiililll,
            this.lIiiililll,
            this.iIiiililll,
            this.Iliiililll,
            this.lliiililll,
            this.iliiililll
         }
      );
   }

   public static IiIliIllliIliIll iiiIlIIIll() {
      return (IiIliIllliIliIll)llilIllililIll.iliIiiliiiii(IiIliIllliIliIll.class);
   }

   @Override
   public void Iilililiiili() {
      this.llIIIiilll = System.nanoTime();
   }

   private static float IIllllIlll(float x) {
      return x * x * (3.0F - 2.0F * x);
   }
}
