package gg.corz;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class iiIliIIlli {
   private IlillIIillillIIi IIiIiIIllIiIiIIl;
   public static final String iliilIIlIiiilIIl = "CAME ";
   public static final String liiilIIliiiilIIl = " \u00b7 ";
   public static final float iiIIiIIlIIlIiIIl = 6.0F;
   public static final String IliilIIllliilIIl = "SENT ";
   public static final float lIlIiIIliIlIiIIl = 24.0F;
   private boolean lilIiIIliilIiIIl;
   public static final String IililIIllililIIl = "TGT ";
   public static final String lllilIIlillilIIl = "ONLINE";
   public static final String IIlilIIllIlilIIl = "SOON";
   private String IiiIiIIlliiIiIIl;
   private String iiiIiIIlIIIliIIl;
   public static final String llIIiIIlilIIiIIl = "...";
   public static final String iIlilIIlIllilIIl = "OFFLINE";
   public static final String lIiilIIliIiilIIl = "TAKEN ";
   public static final float IiIIiIIlliIIiIIl = 64.0F;
   public static final String iililIIlIIiilIIl = "POPS ";
   private String iIiIiIIlIliIiIIl = "";
   private boolean illIiIIlIilIiIIl;
   private static final List<String> iIIIiIIlIlIIiIIl = List.of(
      IIIilIIiiIIi<"IIIilIIiiIIi","bxlXHWTbZsJ4XV1va/dwYiMogsz75ZRtrixK2sZIL0Ak">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","Wue5xRHDA3512uWDexJKKrqO//YWFozNRechNZufZ+NHNA==">()
   );
   private String lliIiIIliliIiIIl = "";
   private liIlIliiIlIl IllIiIIllllIiIIl;
   private static final Map<String, List<String>> IIIIiIIllIIIiIIl = Map.of(
      IIIilIIiiIIi<"IIIilIIiiIIi","A1v6CNngIOf9rWV1XQ60mPdml1zwajzEx5mDj3ZB+thvXAsMVVZk">(),
      List.of(
         IIIilIIiiIIi<"IIIilIIiiIIi","j4M+jGRYlOiUU5dtGD9CG7nLh0NVy5szBKas0BqyPAnq">(),
         IIIilIIiiIIi<"IIIilIIiiIIi","l2Mr5W5cRfx4hSKN0TzRly+/Rqt61Qd8Ebv5iiuaMX9p">()
      )
   );

   public static float Ililllililil(float popsW, float row, float lead) {
      return Math.max(0.0F, popsW - row - 6.0F - lead);
   }

   public static List<String> Illlllllilll(liIlIliiIlIl look) {
      return look == null ? iIIIiIIlIlIIiIIl : IIIIiIIllIIIiIIl.getOrDefault(look.Iiilliiliiil(), iIIIiIIlIlIIiIIl);
   }

   public static float IIillIiliIil(float lead, float row) {
      return Math.max(0.0F, lead - row - 6.0F - 24.0F);
   }

   public void liiiIIllIl() {
      this.lilIiIIliilIiIIl = false;
      this.IllIiIIllllIiIIl = null;
      this.IIiIiIIllIiIiIIl = null;
   }

   public static String IIlllIlliIll(liIlIliiIlIl enabled, boolean look, IlillIIillillIIi snap) {
      if (Iilllilliill(enabled, look, snap) && snap.IliIlllilIi()) {
         List var3 = Illlllllilll(enabled);
         String var4 = (String)var3.get(0) + snap.lIiiIiIlilli();
         return snap.iliIiiliiiii() > 0
            ? var4 + IIIilIIiiIIi<"IIIilIIiiIIi","xeW81L30Z9ixix5Vh46LajjWaIf5SG1xZUALQuMM8go=">() + (String)var3.get(1) + snap.iliIiiliiiii()
            : var4;
      } else {
         return "";
      }
   }

   public static String IiIlliIliiIl(liIlIliiIlIl look, boolean enabled, IlillIIillillIIi snap) {
      return Iilllilliill(look, enabled, snap) && snap.IliIlllilIi() && snap.IilliliilIIi() != null
         ? IIIilIIiiIIi<"IIIilIIiiIIi","x0WANVgrGgGzYtKYEuVj7rIV/MIYVsVoys7NzFVYTak=">() + snap.IilliliilIIi()
         : "";
   }

   public boolean IIIllIIliIIl() {
      return !this.IiiIiIIlliiIiIIl.isEmpty() || !this.iiiIiIIlIIIliIIl.isEmpty();
   }

   public String iliIiiliiiii() {
      return this.iiiIiIIlIIIliIIl;
   }

   public static String IlIlllIlilIl(liIlIliiIlIl enabled, boolean look, IlillIIillillIIi snap) {
      if (enabled == null) {
         return "";
      } else if (enabled.iiIIlIIlIl()) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","i8zpkNtKW0cJ/V5YW5aUYd6wANDUiJ2aGujZqGeBNEA=">();
      } else if (!look) {
         return IIIilIIiiIIi<"IIIilIIiiIIi","xPfNtJ+scH4CO7wBBGvX1mJdVaIrC9SXGKhu18LZSw7fDvU=">();
      } else {
         return snap != null ? snap.iIlIlllllill().toUpperCase(Locale.ROOT) : IIIilIIiiIIi<"IIIilIIiiIIi","Pep5ZxozFU/l8TRp2m+M6ecldK+MAWfCHT3fpmQwtw7jsw==">();
      }
   }

   public String iIlIlllllill() {
      return this.iIiIiIIlIliIiIIl;
   }

   public iiIliIIlli() {
      this.IiiIiIIlliiIiIIl = "";
      this.iiiIiIIlIIIliIIl = "";
   }

   public String IilliliilIIi() {
      return this.lliIiIIliliIiIIl;
   }

   public static String Iiilliiliiil(String m, float text, ililIilIiilIil maxW) {
      if (m != null && !m.isEmpty()) {
         if (maxW.width(m) <= text) {
            return m;
         } else {
            String var3 = m;

            while (var3.length() > 1 && maxW.width(var3 + IIIilIIiiIIi<"IIIilIIiiIIi","jSwotP1x8h1PC2mrWnd3x5mLn0XFNwMAMYkw68iozA==">()) > text) {
               var3 = var3.substring(0, var3.length() - 1);
            }

            return var3.stripTrailing() + IIIilIIiiIIi<"IIIilIIiiIIi","jSwotP1x8h1PC2mrWnd3x5mLn0XFNwMAMYkw68iozA==">();
         }
      } else {
         return "";
      }
   }

   public String lIiiIiIlilli() {
      return this.IiiIiIIlliiIiIIl;
   }

   public boolean IliIlllilIi(liIlIliiIlIl snap, boolean enabled, IlillIIillillIIi look) {
      if (this.lilIiIIliilIiIIl && snap == this.IllIiIIllllIiIIl && enabled == this.illIiIIlIilIiIIl && Objects.equals(look, this.IIiIiIIllIiIiIIl)) {
         return false;
      } else {
         this.IllIiIIllllIiIIl = snap;
         this.illIiIIlIilIiIIl = enabled;
         this.IIiIiIIllIiIiIIl = look;
         this.lilIiIIliilIiIIl = true;
         this.iIiIiIIlIliIiIIl = snap == null ? "" : snap.IiIiliIiiiIi();
         this.lliIiIIliliIiIIl = IlIlllIlilIl(snap, enabled, look);
         this.IiiIiIIlliiIiIIl = IiIlliIliiIl(snap, enabled, look);
         this.iiiIiIIlIIIliIIl = IIlllIlliIll(snap, enabled, look);
         return true;
      }
   }

   private static boolean Iilllilliill(liIlIliiIlIl look, boolean snap, IlillIIillillIIi enabled) {
      return look != null && !look.iiIIlIIlIl() && snap && enabled != null;
   }
}
