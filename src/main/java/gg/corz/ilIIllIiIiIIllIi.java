package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;

public record ilIIllIiIiIIllIi(
   class_2338 forcedBase,
   class_2338 forcedObsidianCell,
   class_2350 clickFace,
   boolean hold,
   boolean breakNow,
   boolean trustObsidian,
   iIIlIIiIlIlIIi targetAt,
   class_2338 support,
   class_2350 supportFace
) {
   private final boolean lliIilIIIi;
   private final class_2350 liiIilIIIi;
   private final class_2338 IiiIilIIIi;
   private final class_2350 lIiIilIIIi;
   private final boolean IliIilIIIi;
   private final iIIlIIiIlIlIIi iliIilIIIi;
   private final boolean iIiIilIIIi;
   private final class_2338 IIiIilIIIi;
   private final class_2338 iilIilIIIi;

   public class_2350 IiIlliIliiIl() {
      return this.liiIilIIIi;
   }

   public class_2350 iIlIlllllill() {
      return this.lIiIilIIIi;
   }

   public class_2338 liiiIIllIl() {
      return this.IIiIilIIIi;
   }

   public ilIIllIiIiIIllIi(
      class_2338 forcedBase,
      class_2338 forcedObsidianCell,
      class_2350 clickFace,
      boolean hold,
      boolean breakNow,
      boolean trustObsidian,
      iIIlIIiIlIlIIi targetAt,
      class_2338 support,
      class_2350 supportFace
   ) {
      this.iilIilIIIi = forcedBase;
      this.IIiIilIIIi = forcedObsidianCell;
      this.lIiIilIIIi = clickFace;
      this.iIiIilIIIi = hold;
      this.IliIilIIIi = breakNow;
      this.lliIilIIIi = trustObsidian;
      this.iliIilIIIi = targetAt;
      this.IiiIilIIIi = support;
      this.liiIilIIIi = supportFace;
   }

   public boolean lIiiIiIlilli() {
      return this.IliIilIIIi;
   }

   public iIIlIIiIlIlIIi IIIllIIliIIl() {
      return this.iliIilIIIi;
   }

   public class_2338 IliIlllilIi() {
      return this.iilIilIIIi;
   }

   public class_2338 IlIlllIlilIl() {
      return this.IiiIilIIIi;
   }

   public ilIIllIiIiIIllIi(
      class_2338 targetAt,
      class_2338 trustObsidian,
      class_2350 hold,
      boolean breakNow,
      boolean clickFace,
      boolean forcedObsidianCell,
      iIIlIIiIlIlIIi forcedBase
   ) {
      this(targetAt, trustObsidian, hold, breakNow, clickFace, forcedObsidianCell, forcedBase, null, null);
   }

   public boolean IilliliilIIi() {
      return this.iIiIilIIIi;
   }

   public boolean iliIiiliiiii() {
      return this.lliIilIIIi;
   }
}
