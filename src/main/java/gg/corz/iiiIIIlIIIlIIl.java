package gg.corz;

import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;

public class iiiIIIlIIIlIIl {
   private static boolean illlIliIlIillIliIl = false;
   private static long IlllIliIlllllIliIl = 0L;

   public static void lIiiIiIlilli() {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         try {
            Iiiilliiil.IliIlllilIi(IliIlllilIi(), llilIllililIll.IilliliilIIi());
            IlllIliIlllllIliIl = System.currentTimeMillis();
         } catch (Exception var1) {
            System.err.println(IIIllIIliIIl<"IIIllIIliIIl","60Rsq7JGD0LyXqq/H8ZvZgFP+UeBVQmi3lCTHPG/">() + var1.getMessage());
         }
      }
   }

   private static Path IliIlllilIi() {
      try {
         return FabricLoader.getInstance().getConfigDir().resolve(IIIllIIliIIl<"IIIllIIliIIl","M6y9ykk+t7eIFi/H9fdTwrhAEFgN8Eti0LLSqXkZJhNvsw3VQaI=">());
      } catch (Throwable var1) {
         return Path.of(
            System.getProperty(IIIllIIliIIl<"IIIllIIliIIl","HLFpRPhN90xx2I932PS2Ot7Mhizd/ebHjSmdYRyBxRbuu9eN">()),
            IIIllIIliIIl<"IIIllIIliIIl","VSUJ0BQwYKwQGu0LesT/Iy6kzJNT68KXRtw4P1+vJF7TTQ==">(),
            IIIllIIliIIl<"IIIllIIliIIl","M6y9ykk+t7eIFi/H9fdTwrhAEFgN8Eti0LLSqXkZJhNvsw3VQaI=">()
         );
      }
   }

   public static void IilliliilIIi() {
      lIiiIiIlilli();
      illlIliIlIillIliIl = false;
   }

   public static void iliIiiliiiii() {
      Iiiilliiil.iIlIlllllill(IliIlllilIi(), llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   public static void liiiIIllIl() {
      illlIliIlIillIliIl = true;
   }

   public static void iIlIlllllill() {
      if (illlIliIlIillIliIl && System.currentTimeMillis() - IlllIliIlllllIliIl > 500L) {
         lIiiIiIlilli();
         illlIliIlIillIliIl = false;
      }
   }
}
