package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_332;
import org.lwjgl.glfw.GLFW;

public class illiIlllIiliIlll {
   private static final float ilIlIlIill = 7.0F;
   private static final int lillIlIill = 66;
   private static final int IillIlIill = 44;
   private static final int IlllIlIill = 88;
   private static final float iiIlIlIill = 0.5F;
   private final String[] liilIlIill;
   private static final int iillIlIill = 24;
   private final iIliililIlliilil llIiIlIill;
   private IIIIlilllIIIlill IIliIlIill;
   private double IlliIlIill;
   private static final int llllIlIill = 16;
   private final int[] iiilIlIill;
   private static final int llIlIlIill = 36;
   private final iiiiilIiIIIIIiIi lIIiIlIill;
   private static final int iIIlIlIill = 3;
   private int iIliIlIill;
   private final IliiIIIilliiIIIi IlilIlIill;
   private static final int IlIlIlIill = 2;
   private static final int IIIlIlIill = 1;
   private int lIliIlIill;
   private int IiIiIlIill;
   private final IIllIIIllIllIIIl IlIiIlIill;
   private final List<IlIiillIii> IiilIlIill;
   private final iIIliiIiIlIliiIi ilIiIlIill;
   private static final int illlIlIill = 8;
   private static final int IIilIlIill = 16;
   private int IIIiIlIill;
   private static final String IIllIlIill = "pill:bind";
   private boolean llliIlIill;
   private static int iIilIlIill = -1;
   private int iiIiIlIill;
   private final List<List<IlIiillIii>> ililIlIill;
   private static final int iiiIIlIill = 0;
   private boolean iIIiIlIill;
   private static final int lIIlIlIill = 2;
   private int illiIlIill;
   private static final int lIllIlIill = 130;
   private static final int lIilIlIill = 6;
   private static final float IiIlIlIill = 18.0F;
   private static final String[] liiIIlIill = new String[]{
      IllIllllIl<"IllIllllIl","3eUayu+GVzPVWNIRoa38vHTG2itA4hTJPBdeKavo11fHNdagIg==">(),
      IllIllllIl<"IllIllllIl","6M6Tlc76xxFiQFLMvjRt8DvLWNJvRMnVQu1ShJfUkIveYw==">(),
      IllIllllIl<"IllIllllIl","BkcNEN55SvThjE109+bTUnxGjMNco6WnaonN75DnOLg/aQ0=">(),
      IllIllllIl<"IllIllllIl","yObKP98ih8VSaUMLRpZV3k7yLqh4TnYTInemrGvYrukh/g==">()
   };
   private final llIilIiilIilIi llilIlIill;
   private static final int iIllIlIill = 56;
   private int liIiIlIill;
   private static final float liIlIlIill = 11.0F;

   private void Illlllllilll(int index) {
      this.IIIiIlIill = index;
      iIilIlIill = this.iiilIlIill[index];
      this.lIIiIlIill.IiIiliIiiiIi("");
   }

   public int lIiiIiIlilli() {
      return this.illiIlIill;
   }

   private void IlIillIiilIi() {
      this.lIIiIlIill.lIiiIiIlilli();
      this.llliIlIill = true;
   }

   public boolean IIlilIliiIli(double mx, double btn, int my) {
      long var7 = -8233581648129643630L;
      var7 ^= ((long)(this.iIIiIlIill && this.lIIiIlIill.Illillliilli(mx, btn) ? 1 : 0) << 32 ^ var7) & -1L << 32;
      this.lIIiIlIill.IiIlliIliiIl(mx, btn, my);
      if (!this.iIIiIlIill) {
         this.lIIiIlIill.lIiiIiIlilli();
      }

      if ((int)(var7 >>> 32) != 0) {
         return true;
      } else if (my != 0) {
         return false;
      } else {
         this.IlliIlIill = mx;
         return this.IlIiIlIill.IilliliilIIi(mx, btn);
      }
   }

   private void IIillIiliIil(class_332 ctx, IlIiillIii x, int mx, int y, int w, int r, int my) {
      long var19 = 8497561512175532093L;
      iIIliiIiIlIliiIi var8 = this.ilIiIlIill.lIiiIiIlilli(this.iiIiIlIill++);
      if (!var8.iliIiiliiiii()) {
         float var9 = var8.IiilIIIlIi;
         float var10 = var8.liilIIIlIi;
         IIllIIIllIllIIIl var11 = var8.lIIiIIIlIi ? this.IlIiIlIill : IIllIIIllIllIIIl.ililiiIlIl;
         var19 ^= ((long)(var8.IIIiIIIlIi ? r : mx - 4000) << 32 ^ var19) & -1L << 32;
         String var13 = IllIllllIl<"IllIllllIl","LxWvUz1cGvE5MErLUIEBkx82d5vejWM5D2xiLL9QnaQf">() + x.IliIlllilIi();
         var19 ^= (
               (long)llilliilililliil.IlIlllIlilIl(
                     ctx, (float)mx + (float)w / 2.0F, (float)y + 18.0F, var8.iiilIIIlIi * this.llIiIlIill.IilliliilIIi(var13, 0.025F)
                  )
                  ^ var19
            )
            & -1L >>> 32;

         try {
            if (var9 > 0.004F) {
               float var15 = IliiIilliiIi.IilliliilIIi(var9);

               try {
                  llilliilililliil.illilIilil(ctx, (float)mx, (float)y, (float)w, 36.0F, 0.0F, 0.0F, 0.0F);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var15);
               }
            }

            if (var10 > 0.002F) {
               float var33 = IliiIilliiIi.IilliliilIIi(var10);

               try {
                  this.Ililllililil(ctx, x, var13, var11, mx, y, w, (int)(var19 >>> 32), my);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var33);
               }
            }
         } finally {
            llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)var19));
         }
      }
   }

   public boolean IIIllIIliIIl() {
      return this.llliIlIill;
   }

   private static <T extends IilliIllilliIl> T iIlIlllllill(ilIllIiIll m, Class<T> type) {
      if (m == null) {
         return null;
      } else {
         for (IilliIllilliIl var3 : m.IiIlliIliiIl()) {
            if (type.isInstance(var3)) {
               return (T)type.cast(var3);
            }
         }

         return null;
      }
   }

   public void iIIIlIlIIl(int glfwButton) {
      if (this.IlilIlIill != null) {
         this.IlilIlIill.IlIillIiilIi(IlIiliIlllIiliIl.iIlIlllllill(glfwButton));
      }

      this.llliIlIill = false;
      this.llIiIlIill.iIlIlllllill(IllIllllIl<"IllIllllIl","8+WdFqKWgo/N5l2KhwikrwbTT94vbSV5ya56prgOd2Xiehhgiw==">());
   }

   private String IiIiliIiiiIi() {
      long var4 = -6405698681326764196L;
      var4 ^= ((long)(this.IlilIlIill != null ? this.IlilIlIill.IIIilIIiiIIi() : 344) << 32 ^ var4) & -1L << 32;
      String var2 = IlIiliIlllIiliIl.IlIlllIlilIl((int)(var4 >>> 32));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = GLFW.glfwGetKeyName((int)(var4 >>> 32), 0);
         return var3 != null ? var3.toUpperCase() : IlIiliIlllIiliIl.IIIllIIliIIl((int)(var4 >>> 32));
      }
   }

   public void IIIIllIIIl(int key) {
      if (this.IlilIlIill != null) {
         this.IlilIlIill.IlIillIiilIi(IlIiliIlllIiliIl.IilliliilIIi(key) ? -1 : key);
      }

      this.llliIlIill = false;
      this.llIiIlIill.iIlIlllllill(IllIllllIl<"IllIllllIl","8+WdFqKWgo/N5l2KhwikrwbTT94vbSV5ya56prgOd2Xiehhgiw==">());
   }

   public illiIlllIiliIlll() {
      long var9 = -3931194483865016423L;
      long var11 = -7437297627688784634L;
      super();
      this.ililIlIill = new ArrayList<>();
      this.IiilIlIill = new ArrayList<>();
      this.lIIiIlIill = new iiiiilIiIIIIIiIi(0, 0, 0, 0);
      this.iIIiIlIill = false;
      this.IlIiIlIill = new IIllIIIllIllIIIl();
      this.llIiIlIill = new iIliililIlliilil();
      this.ilIiIlIill = new iIIliiIiIlIliiIi();
      this.IiIiIlIill = 0;
      this.liIiIlIill = -1;
      this.iiIiIlIill = 0;
      this.IIliIlIill = null;
      this.llliIlIill = false;
      this.illiIlIill = 200;
      this.IlilIlIill = (IliiIIIilliiIIIi)llilIllililIll.iliIiiliiiii(IliiIIIilliiIIIi.class);
      this.llilIlIill = (llIilIiilIilIi)llilIllililIll.iliIiiliiiii(llIilIiilIilIi.class);
      ililliIiIiilliIi var1 = iIlIlllllill(llilIllililIll.iliIiiliiiii(ilIIiiIiIiIIiiIi.class), ililliIiIiilliIi.class);
      ililliIiIiilliIi var2 = iIlIlllllill(llilIllililIll.iliIiiliiiii(lilllIliiilllIli.class), ililliIiIiilliIi.class);
      ililliIiIiilliIi var3 = iIlIlllllill(llilIllililIll.iliIiiliiiii(lIllliiliIllliil.class), ililliIiIiilliIi.class);
      ilIllIiIll var4 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      ilIllIiIll var5 = llilIllililIll.iliIiiliiiii(IliiliIllliiliIl.class);

      for (var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < liiIIlIill.length; var9 += 4294967296L) {
         this.ililIlIill.add(new ArrayList<>());
      }

      this.liiiIIllIl(
         0,
         lillIIlliillIIll.lIIIlIllll,
         IllIllllIl<"IllIllllIl","4LitBNJIwkXtzouKXMzwdm/gINwM9HvEsgxkqGuZ8XY=">(),
         IllIllllIl<"IllIllllIl","7qGHzZAZ0gRj+6+YwdVrWxQEFVjjBpLO9sziJuCAgkobS+OFCQ==">(),
         IllIllllIl<"IllIllllIl","AMofDvyygXvqb5s/u1udXK4zOgfSeRtSoTD0PN329m6nZtRbLPBkE7QT1zXXunm5xVkIjA==">(),
         null
      );
      this.IliIlllilIi(
         0,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","sJI5tgFt9SNIDHUyV130dnqjeAxpYmBiCV/ANMzOPvJL">(),
         (iiIiiilIIliiil)IilliliilIIi(this.IlilIlIill, IllIllllIl<"IllIllllIl","/Df0/ECEQImGY3kDTQuMaE8sQjH6QhJAWTxa96qa2wzjHw==">())
      );
      if (this.llilIlIill != null) {
         this.liiiIIllIl(
            0,
            lillIIlliillIIll.iIIIlIllll,
            IllIllllIl<"IllIllllIl","AB332onYX0gZxv6Q4qFHdOpjbvkR/WBbnjii3329s14Ppw==">(),
            this.llilIlIill.IilliliilIIi(),
            IllIllllIl<"IllIllllIl","CE32RTUk5ZFmshBTY0fp5ZiVMry9f+udIUFZbRs5v5NT/T9vj5Ur++CKRlGA2wfxr50tYjbwvoFj6YFyTLwNEKoZdOg+aHsE2ExH">(),
            null
         );
      }

      this.IliIlllilIi(
         0,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","oAp5fKgeUJ1HVohLmx7MAMvrawmbjSFUcpU0SofZQW9irA==">(),
         (iiIiiilIIliiil)IilliliilIIi(var5, IllIllllIl<"IllIllllIl","go57unkR2cyNHB3dqtFBlws+1uFXviJCNOKGkSsShkGUxycZMabqsq9elW40vFM=">())
      );
      this.IliIlllilIi(
         0,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","RhxDrBAnwpLJRlpdzCUAL0Vj3yQMUwOQvmpaC6sC/9T9UMFyE5k=">(),
         (iiIiiilIIliiil)IilliliilIIi(var5, IllIllllIl<"IllIllllIl","UCxbm8jfmQCCx4L+yzcBNHzne/l9T7y4xP2hMUd+j2kU7EtVmSqtRFj/uMv5rife">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","iv/BywkMMpG2O0I7/jEgs8zaP+qFRhO1Yo8JP6Mdfhfvfg==">(),
         (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","slDM6Tu4zAYrkYjNegfJrZ9f94+j914xfbzpc2c4QcQFXc66AAG8sA==">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","XKWucw6/DcGf7LFjVNOkn+4k3fCUakE1Q1N+rgeLPw2MOw==">(),
         (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","TxcRYCZyIBx9Kx+HQHSfkFqdcGa//Ou34oH7EV04Yj1Kwss6tHnc">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","gTFz6tQPYxiU/w5QNYOFav7yqlX3UMw+LViCtz0oc6yxZw==">(),
         (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","ae0rSWZ8mC0ZDWmxLN5/aPJV70QlHl40Ot11M5wqx+9oUQjQts3IEUqZWqHTzl3r">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.iIIIlIllll,
         IllIllllIl<"IllIllllIl","GqkfY5rOGqjCVwgu48tvjeAOc6R5Lp+JpXTCjUwRPL3d2FE=">(),
         (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","szw9NzZncj6GGJf2IDVU9KoUIjNLn/Y1ZvvoXHxxAyB7izY3LqIzVObUlcqw">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.IlIIlIllll,
         IllIllllIl<"IllIllllIl","0HnPiyBhPVUk2lH/pp9MuPBJ4ZKGBIFWeSwdbIAWxHkD2f8=">(),
         (lliliIIiililiIIi)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","GxEorAMI3WrGxmfdOD42HTmcaxamtDfm2YcL15XPfNimbJTu10I=">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.IlIIlIllll,
         IllIllllIl<"IllIllllIl","NRYuZfnBVprMNuvC4paa4UipLPMQVqkJkm9AULGgGwXNz/l2tQ==">(),
         (lliliIIiililiIIi)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","TzturPNRGZTdlGBZKdNrebW2Umwx+DazLhGe7usPLYToX2iHSBW+">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.llIIlIllll,
         IllIllllIl<"IllIllllIl","1bJnBMztPNsFtBUc/6xhFVbIwIaP4LZ9kYMk25JaXBPfeQ==">(),
         (IIIIlilllIIIlill)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","mf3/vrIhhKz2CN0TEa9Hz0wZrLTZP4/Jx8U23Xu6p/4FPg==">())
      );
      this.IliIlllilIi(
         1,
         lillIIlliillIIll.llIIlIllll,
         IllIllllIl<"IllIllllIl","ArgQ6HZt+R9Qmr5pjn+Mg/U/bE7Doa9eJPFsjveOc4BWXGU=">(),
         (IIIIlilllIIIlill)IilliliilIIi(var4, IllIllllIl<"IllIllllIl","GGXTAm+o3frWqmmZ/roD9LcKAOYFFqYG1dmCukzLo2Kp/wOt5Hh/pA==">())
      );
      if (var1 != null) {
         this.liiiIIllIl(
            2,
            lillIIlliillIIll.ilIIlIllll,
            IllIllllIl<"IllIllllIl","RUrmHp0dBo69taCoM37PAQ0ZeFmw5FFVotxjiyg1HQ==">(),
            IllIllllIl<"IllIllllIl","BkcNEN55SvThjE109+bTUnxGjMNco6WnaonN75DnOLg/aQ0=">(),
            null,
            var1
         );
      }

      if (var2 != null) {
         this.liiiIIllIl(
            3,
            lillIIlliillIIll.IiIIlIllll,
            IllIllllIl<"IllIllllIl","AM0jfl0b9KZBo+kxsjzMMg/F85chOXYaB9aVtGoFRYv0">(),
            IllIllllIl<"IllIllllIl","D9KYpvyRCwNpksF2IPKjRQ/5pl1JmMU9rL74jTIfE1jz">(),
            var2.IliIlllilIi(),
            var2
         );
      }

      if (var3 != null) {
         this.liiiIIllIl(
            3,
            lillIIlliillIIll.IiIIlIllll,
            IllIllllIl<"IllIllllIl","TqI3Zi3+Vb25myCsPdnvr5B0f63gVD5AyXRWZOqvZ4g8Tu/B">(),
            var3.IliIlllilIi(),
            IllIllllIl<"IllIllllIl","6ixFlkOmIhjl+MPBQXJmiHfM9O1oFYXyZdrMIiNBfajX3xqh3Sh68EbugI93wQKDwSEVjIsMRId9xgAHKA==">(),
            var3
         );
      }

      var9 ^= (0L ^ var9) & -1L << 32;

      for (List var8 : this.ililIlIill) {
         if (!var8.isEmpty()) {
            var9 += 4294967296L;
         }
      }

      this.liilIlIill = new String[(int)(var9 >>> 32) + 1];
      this.iiilIlIill = new int[(int)(var9 >>> 32) + 1];
      this.liilIlIill[0] = IllIllllIl<"IllIllllIl","uVh7Xh8XtKdUxohqO2LERhQPLD4gXrVaSTJmDDUbKw==">();
      this.iiilIlIill[0] = -1;
      var9 ^= (1L ^ var9) & -1L >>> 32;

      for (long var16 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var16 >>> 32) < liiIIlIill.length; var16 += 4294967296L) {
         if (!this.ililIlIill.get((int)(var16 >>> 32)).isEmpty()) {
            this.liilIlIill[(int)var9] = liiIIlIill[(int)(var16 >>> 32)];
            this.iiilIlIill[(int)var9] = (int)(var16 >>> 32);
            if ((int)(var16 >>> 32) == iIilIlIill) {
               this.IIIiIlIill = (int)var9;
            }

            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
         }
      }

      this.lIIiIlIill.liiiIIllIl(IllIllllIl<"IllIllllIl","yOMSjJPVJQ6n4HNd7E8E923zHcCtNnH+5cs57ghlyOMT/aqnROPh7JWPwTiEww==">());
      this.lIIiIlIill.iIlIlllllill(false);
      this.lIIiIlIill.IilliliilIIi(6);
   }

   public void llIIlilIIl() {
      this.llliIlIill = false;
   }

   public boolean Iliilliiilii(char chr, int mod) {
      if (!this.lIIiIlIill.IIlilIliiIli()) {
         return false;
      } else {
         this.lIIiIlIill.Illlllllilll(chr, mod);
         return true;
      }
   }

   private static IilliIllilliIl IilliliilIIi(ilIllIiIll name, String m) {
      if (name == null) {
         return null;
      } else {
         for (IilliIllilliIl var3 : name.IiIlliIliiIl()) {
            if (var3.IliIlllilIi().equalsIgnoreCase(m)) {
               return var3;
            }
         }

         return null;
      }
   }

   public void IiIlliIliiIl(class_332 ctx, int w, int my, int mx, int top, int x) {
      long var22 = 149693314717177515L;
      long var24 = -94981605339721830L;
      long var26 = -5561417498144468051L;
      long var28 = 4781020204729809393L;
      long var30 = -8293561920886221177L;
      this.IlIiIlIill.IliIlllilIi();
      var22 ^= ((long)this.ilIiIlIill.iIlIlllllill() << 32 ^ var22) & -1L << 32;
      String var8 = this.lIIiIlIill.IlIillIiilIi().trim().toLowerCase(Locale.ROOT);
      var22 ^= ((long)(!var8.isEmpty() ? 1 : 0) ^ var22) & -1L >>> 32;
      var24 ^= ((long)(-1 - this.IIIiIlIill) << 32 ^ var24) & -1L << 32;
      var24 ^= ~var24 & -1L >>> 32;
      if ((int)var22 != 0) {
         this.IiilIlIill.clear();
         var24 ^= (4294967296L ^ var24) & -1L << 32;

         for (List var13 : this.ililIlIill) {
            for (IlIiillIii var15 : var13) {
               if (var15.iliIiiliiiii().contains(var8)) {
                  this.IiilIlIill.add(var15);
                  var24 ^= ((long)((int)(var24 >>> 32) * 31 + var15.IliIlllilIi().hashCode()) << 32 ^ var24) & -1L << 32;
               }
            }
         }

         var24 ^= ((long)this.IiilIlIill.size() ^ var24) & -1L >>> 32;
         if ((int)(var24 >>> 32) < 0) {
            var24 ^= ((long)(~((int)(var24 >>> 32))) << 32 ^ var24) & -1L << 32;
         }
      }

      if ((int)(var22 >>> 32) != 0) {
         this.ilIiIlIill.IliIlllilIi();
      } else if ((int)(var24 >>> 32) != this.IiIiIlIill) {
         if ((int)var24 > 0 && this.liIiIlIill > 0 && (int)var24 <= this.liIiIlIill) {
            this.ilIiIlIill.liiiIIllIl();
         } else {
            this.ilIiIlIill.IliIlllilIi();
         }
      }

      this.IiIiIlIill = (int)(var24 >>> 32);
      this.liIiIlIill = (int)var24;
      this.iiIiIlIill = 0;
      float var34 = llilliilililliil.IiiIlliiIl(ctx, IllIllllIl<"IllIllllIl","RWyN5+6Q9kNT0Vh7Trriipa8LXWXt3Xb6WzQYnmxSwLCmAXw">(), (float)w, (float)my, 22.0F);
      float var35 = llilliilililliil.iiiIlIIIll(
         ctx,
         this.IlIiIlIill,
         this.llIiIlIill,
         IllIllllIl<"IllIllllIl","w33UhRaOziCWiK1R1Lx/cLbHRlpXSNWvULm8wZiAY2w=">(),
         this.liilIlIill,
         (int)var22 != 0 ? 0 : this.IIIiIlIill,
         var34 + 10.0F,
         (float)my,
         22.0F,
         top,
         x,
         this::Illlllllilll
      );
      var26 ^= ((long)((int)Math.ceil((double)(var35 + 8.0F))) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)Math.min(130, w + mx - (int)(var26 >>> 32)) ^ var26) & -1L >>> 32;
      this.iIIiIlIill = (int)var26 >= 56;
      if (this.iIIiIlIill) {
         this.lIIiIlIill.IliIlllilIi((int)(var26 >>> 32), my + 2, (int)var26, 18);
         this.lIIiIlIill.iliIiiliiiii(ctx, top, x, 0.0F);
      } else {
         this.lIIiIlIill.lIiiIiIlilli();
      }

      var28 ^= ((long)(my + 22 + 6) << 32 ^ var28) & -1L << 32;
      if ((int)var22 != 0) {
         if (this.IiilIlIill.isEmpty()) {
            llilliilililliil.IilIililIi(
               ctx,
               this.IlIiIlIill,
               this.llIiIlIill,
               IllIllllIl<"IllIllllIl","MCKEkUWO6uLhQbVFWztXoQ+MB9eCbGPPeUFkZF0+XT0=">(),
               (float)w,
               (float)((int)(var28 >>> 32)),
               (float)mx,
               88.0F,
               lIlIIiliIlIIil.IIIIllIIIl(IllIllllIl<"IllIllllIl","xUVS5HbLtRGSSM8n87i+Q3GBIJIXtZ3bXuBhROYCQMw10Q==">()),
               IllIllllIl<"IllIllllIl","c3TGNKVl7lXzyRIGwJh5r6DVT/iHAMhPC73CEcTXy/TSyGRL1llmnNyFlvB0">(),
               IllIllllIl<"IllIllllIl","cyCFvEm9sSW6UVNA7qoKI+Gze2sqn70/LTqL+GdmidVJIe+8/8VMxSqB4nLQH/cNeQ==">(),
               null,
               top,
               x,
               null
            );
            var28 += 377957122048L;
         } else {
            var28 ^= ((long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, this.IiilIlIill, w, (int)(var28 >>> 32), mx, top, x)) << 32 ^ var28) & -1L << 32;
         }
      } else if (this.iiilIlIill[this.IIIiIlIill] < 0) {
         var28 ^= (1L ^ var28) & -1L >>> 32;

         for (long var47 = var30 ^ (0L ^ var30) & -1L << 32; (int)(var47 >>> 32) < liiIIlIill.length; var47 += 4294967296L) {
            List var19 = this.ililIlIill.get((int)(var47 >>> 32));
            if (!var19.isEmpty()) {
               if ((int)var28 == 0) {
                  var28 += 38654705664L;
               }

               var28 ^= (0L ^ var28) & -1L >>> 32;
               float var20 = IliiIilliiIi.IilliliilIIi(this.ilIiIlIill.IIIllIIliIIl(this.iiIiIlIill));

               try {
                  llilliilililliil.lllIiillIi(ctx, liiIIlIill[(int)(var47 >>> 32)], (float)w, (float)((int)(var28 >>> 32)), (float)mx);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var20);
               }

               var28 += 51539607552L;
               var28 ^= ((long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, var19, w, (int)(var28 >>> 32), mx, top, x)) << 32 ^ var28) & -1L << 32;
            }
         }
      } else {
         var28 ^= (
               (long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, this.ililIlIill.get(this.iiilIlIill[this.IIIiIlIill]), w, (int)(var28 >>> 32), mx, top, x))
                     << 32
                  ^ var28
            )
            & -1L << 32;
      }

      this.illiIlIill = (int)(var28 >>> 32) - my;
   }

   public boolean iliIiiliiiii() {
      return false;
   }

   public void IIlllIlliIll(class_332 ctx) {
   }

   public boolean IlIlllIlilIl() {
      return this.lIIiIlIill.IIlilIliiIli();
   }

   private void IIIilIIiiIIi(double mx) {
      if (this.IIliIlIill != null && this.iIliIlIill > 0) {
         double var3 = Math.max(0.0, Math.min(1.0, (mx - (double)this.lIliIlIill) / (double)this.iIliIlIill));
         double var5 = this.IIliIlIill.Ililllililil() + var3 * (this.IIliIlIill.Iiilliiliiil() - this.IIliIlIill.Ililllililil());
         double var7 = this.IIliIlIill.IlIillIiilIi();
         if (var7 > 0.0) {
            var5 = (double)Math.round(var5 / var7) * var7;
         }

         this.IIliIlIill.IIillIiliIil(var5);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void Illillliilli(double mx, double btn, int my) {
      if (this.IIliIlIill != null) {
         this.IIIilIIiiIIi(mx);
      }
   }

   private float Iiilliiliiil(class_332 w, IIllIIIllIllIIIl x, IIIIlilllIIIlill hits, String labelY, int key, int mx, int s, float y, int ctx, int my) {
      long var24 = -7495756229397814940L;
      long var26 = -6135994276458642105L;
      long var28 = 4635942562984307664L;
      var24 ^= ((long)(key + 8) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)(s - 16) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)(var24 >>> 32) - 6) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)(mx + 16) ^ var26) & -1L >>> 32;
      var28 ^= ((long)((int)var24 + 12) << 32 ^ var28) & -1L << 32;
      var28 ^= (20L ^ var28) & -1L >>> 32;
      float var17 = this.llIiIlIill
         .IIIllIIliIIl(
            IllIllllIl<"IllIllllIl","fn2a/IOHad5zFh59AQxH1f1kRCTfP3HzdJPTXoOE6QpKbw==">() + labelY,
            this.IIliIlIill == hits
               || llilliilililliil.Iliilliiilii(
                  (double)ctx, (double)my, (float)((int)(var26 >>> 32)), (float)((int)var26), (float)((int)(var28 >>> 32)), (float)((int)var28)
               )
         );
      double var18 = hits.Iiilliiliiil() - hits.Ililllililil();
      float var20 = this.llIiIlIill
         .iliIiiliiiii(IllIllllIl<"IllIllllIl","ewPzD4k2ExurLSp60hgwe3RRtwsJ5hqKBXugSyBdLb8=">() + labelY, (float)hits.Iilllilliill(), 12.0F);
      float var21 = var18 <= 0.0 ? 0.0F : (float)(((double)var20 - hits.Ililllililil()) / var18);
      llilliilililliil.ilIllIiIll(w, (float)((int)(var24 >>> 32)), (float)(mx + 24), (float)((int)var24), var21, var17);
      String var22 = Math.round(var20 * 100.0F) + IllIllllIl<"IllIllllIl","v5ehppCfDDDpjArgeoqjGyDVvN5Znp6g6ApVas8=">();
      float var23 = (float)(key + s - 8) - llilliilililliil.llIIlilIIl(var22);
      llilliilililliil.iiIIlIIlIl(var22, var23, y, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var17));
      x.liiiIIllIl((float)((int)(var26 >>> 32)), (float)((int)var26), (float)((int)(var28 >>> 32)), (float)((int)var28), () -> {
         this.IIliIlIill = hits;
         this.lIliIlIill = trackW;
         this.iIliIlIill = trackX;
         this.IIIilIIiiIIi(this.IlliIlIill);
      });
      return var23;
   }

   private void liiiIIllIl(int desc, lillIIlliillIIll section, String label, String key, String kind, IilliIllilliIl s) {
      StringBuilder var7 = new StringBuilder(key).append(' ').append(liiIIlIill[desc]);
      if (kind != null) {
         var7.append(' ').append(kind);
      }

      if (s != null && s.liiiIIllIl() != null) {
         var7.append(' ').append(s.liiiIIllIl());
      }

      if (s instanceof ililliIiIiilliIi var8) {
         var7.append(' ').append(var8.Iilllilliill());
      }

      if (section == lillIIlliillIIll.lIIIlIllll) {
         var7.append(IllIllllIl<"IllIllllIl","PZjy33Cfk1Vg9xRpSLndMYzTo2Cz4ZypTVjqPGW4H7xdNnEyF15NSl9dW/DXf80WPW5PbDyYjepFHHgFwg==">());
      }

      this.ililIlIill.get(desc).add(new IlIiillIii(label, section, key, kind, s, var7.toString().toLowerCase(Locale.ROOT)));
   }

   public boolean IIiilIiiiIii(int mod, int key, int scan) {
      if (!this.lIIiIlIill.IIlilIliiIli()) {
         return false;
      } else {
         this.lIIiIlIill.IIlllIlliIll(mod, key, scan);
         return true;
      }
   }

   public void Iiiiliiiiiii() {
      this.llliIlIill = false;
      this.lIIiIlIill.lIiiIiIlilli();
      this.iIIiIlIill = false;
      this.IlIiIlIill.IliIlllilIi();
   }

   private void Ililllililil(class_332 w, IlIiillIii hits, String id, IIllIIIllIllIIIl ctx, int x, int mx, int r, int y, int my) {
      long var22 = 6701869481982159589L;
      IIliiIlllIliiIll var10 = llilliilililliil.IIiilIiiiIii();
      String var11 = hits.IliIlllilIi();
      float var12 = this.llIiIlIill.IIIllIIliIIl(id, llilliilililliil.Iliilliiilii((double)y, (double)my, (float)x, (float)mx, (float)r, 36.0F));
      float var13 = (float)(x + r - 8);
      float var14 = (float)mx + 10.0F;
      float var15 = (float)(x + 8);
      float var16 = llilliilililliil.IllIllllIl((float)mx + 7.0F, 11.0F, 1.0F);

      float var17 = switch (hits.liiiIIllIl()) {
         case IiIIlIllll -> {
            float var25 = this.llIiIlIill
               .iliIiiliiiii(IllIllllIl<"IllIllllIl","RZ7euDWG48V+nFdRqsxruY4RvBJGVLUWLlT9t6sfkkOdKA==">(), this.llliIlIill ? 1.0F : 0.0F, 16.0F);
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, var25);
            yield llilliilililliil.iIIilIlIil(
               w,
               ctx,
               this.llIiIlIill,
               IllIllllIl<"IllIllllIl","8+WdFqKWgo/N5l2KhwikrwbTT94vbSV5ya56prgOd2Xiehhgiw==">(),
               this.llliIlIill ? IllIllllIl<"IllIllllIl","QMOsyhDUkgAV/0RGZpr+ljg1AGgurH3JpriXhsAkIHGWcl3unHPNWf9D">() : this.IiIiliIiiiIi(),
               var13,
               var14,
               16.0F,
               44.0F,
               y,
               my,
               var25,
               this::IlIillIiilIi
            );
         }
         case IlIIlIllll -> {
            var22 ^= ((long)(hits.lIiiIiIlilli() instanceof iiIiiilIIliiil var19 ? var19.Iilllilliill() : this.llilIlIill.IliIlllilIi()) << 32 ^ var22)
               & -1L << 32;
            Runnable var27;
            Runnable var35 = var27 = hits.lIiiIiIlilli() instanceof iiIiiilIIliiil var29 ? var29::Ililllililil : this.llilIlIill::Ililllililil;
            float var30 = this.llIiIlIill
               .iliIiiliiiii(IllIllllIl<"IllIllllIl","+0wy4gTV4XKWBwIbCz8cBoTSDbHl6JdTe5sN3sYziA==">() + var11, (int)(var22 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F);
            String var32 = IllIllllIl<"IllIllllIl","odkysVOKklbRw9ZsopzzmkFDm8b4URjuRDlRnbMiAATLyg==">() + var11;
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12, this.llIiIlIill.iliIiiliiiii(var32, 0.0F, 10.0F), var30);
            iIiIIlIiIliIIlIi.iliIiiliiiii(w, x + r, mx, 36, 8, (double)var30, (double)var12);
            ctx.iIlIlllllill((float)x, (float)mx, (float)r, 36.0F, () -> {
               this.llIiIlIill.IiIlliIliiIl(var32, 1.0F);
               var27.run();
            }, this.llIiIlIill, id);
            yield var13 - 22.0F;
         }
         case ilIIlIllll -> {
            lliliIIiililiIIi var24 = (lliliIIiililiIIi)hits.lIiiIiIlilli();
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            yield llilliilililliil.IIIillIIil(
               w,
               ctx,
               this.llIiIlIill,
               IllIllllIl<"IllIllllIl","XTtk1ABlzmTaujLBke2b5b7gJAmB01qWKdBpqa+y0xiW">() + var11,
               var24.Iilllilliill(),
               lIlIIiliIlIIil.IIlilIliiIli(),
               var13,
               var14,
               16.0F,
               66.0F,
               y,
               my,
               0.0F,
               () -> {
                  long var2 = -4932697488435700124L;
                  var2 ^= ((long)var24.IiIiliIiiiIi().size() << 32 ^ var2) & -1L << 32;
                  if ((int)(var2 >>> 32) > 0) {
                     var24.Iiilliiliiil((var24.Ililllililil() + 1) % (int)(var2 >>> 32));
                  }
               }
            );
         }
         case iIIIlIllll -> {
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            yield this.Iiilliiliiil(w, ctx, (IIIIlilllIIIlill)hits.lIiiIiIlilli(), var11, x, mx, r, var16, y, my);
         }
         case lIIIlIllll, llIIlIllll -> {
            ililliIiIiilliIi var18 = (ililliIiIiilliIi)hits.lIiiIiIlilli();
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            yield llilliilililliil.lIilliIill(
               w,
               ctx,
               this.llIiIlIill,
               IllIllllIl<"IllIllllIl","kkNVe9syCPKLV0svzAxOlgjsxAXomlZLdy2XQr89pWo=">() + var11,
               var18.Iilllilliill(),
               var13,
               var14,
               16.0F,
               y,
               my,
               var18.Iiilliiliiil(),
               var18::IIlilIliiIli
            );
         }
      };
      float var26 = var17 - 8.0F - var15;
      llilliilililliil.iiIIlIIlIl(var10.Iiilliiliiil(hits.iIlIlllllill(), var26), var15, var16, -920587);
      float var28 = llilliilililliil.IllIllllIl((float)mx + 18.0F, 11.0F, 0.82F);
      if (hits.liiiIIllIl() == lillIIlliillIIll.ilIIlIllll) {
         ililliIiIiilliIi var31 = (ililliIiIiilliIi)hits.lIiiIiIlilli();
         llilliilililliil.IlIIillIIi(w, IIIIIllllIIIIlll.IIIilIIiiIIi(), var10.Iiilliiliiil(var31.IlIillIiilIi(), (var26 - 8.0F) / 0.82F), var15, var28);
      } else if (hits.liiiIIllIl() != lillIIlliillIIll.llIIlIllll && hits.IilliliilIIi() != null) {
         llilliilililliil.lIlIliIlIl(var10.Iiilliiliiil(hits.IilliliilIIi(), var26 / 0.82F), var15, var28, 0.82F, -7630437);
      }
   }

   public void Iilililiiili(double btn, double mx, int my) {
      this.IIliIlIill = null;
   }

   private int Iilllilliill(class_332 ctx, List<IlIiillIii> my, int y, int list, int mx, int x, int w) {
      long var10 = -3857808000032377825L;
      if (my.size() == 1 && ((IlIiillIii)my.get(0)).liiiIIllIl() == lillIIlliillIIll.ilIIlIllll) {
         this.IIillIiliIil(ctx, (IlIiillIii)my.get(0), y, list, mx, x, w);
         return 36;
      } else {
         var10 ^= (0L ^ var10) & -1L << 32;

         while ((int)(var10 >>> 32) < my.size()) {
            var10 ^= ((long)((int)(var10 >>> 32) % 2) ^ var10) & -1L >>> 32;
            this.IIillIiliIil(
               ctx,
               (IlIiillIii)my.get((int)(var10 >>> 32)),
               llilliilililliil.iIiIlIliIl(y, mx, 2, 4, (int)var10),
               list + (int)(var10 >>> 32) / 2 * 40,
               llilliilililliil.lliIliliIl(y, mx, 2, 4, (int)var10),
               x,
               w
            );
            var10 += 4294967296L;
         }

         var10 ^= ((long)((my.size() + 2 - 1) / 2) << 32 ^ var10) & -1L << 32;
         return (int)(var10 >>> 32) == 0 ? 0 : (int)(var10 >>> 32) * 40 - 4;
      }
   }

   private void IliIlllilIi(int section, lillIIlliillIIll s, String kind, IilliIllilliIl key) {
      if (key != null) {
         this.liiiIIllIl(section, s, kind, key.IliIlllilIi(), key.liiiIIllIl(), key);
      }
   }
}
