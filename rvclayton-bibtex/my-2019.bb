.so bibtex.header

@string{asplos87 = sigplan # " (" # pot # "Second International Conference on " # asplos # ", ASPLOS II)"}
@string{asplos89 = sigplan # " (" # pot # "Third International Conference on " # asplos # ", ASPLOS III)"}
@string{icfp02 = sigplan # " (" # pot # "Seventh ACM SIGPLAN International Conference on Functional Programming, ICFP '02)" }
@string{osdi96 = osr # " (" # pot # "Second USENIX Symposium on Operating Systems Design and Implementation, OSDI '96)"}
@string{ppeals88 = sigplan # " (" # pot # "ACM\slash SIGPLAN Conference on Parallel Programming: Experience with Applications, Languages and Systems, PPEALS '88)"}
@string{sosp89    = osr # " (" # pot # "Twelfth" # sosp # ", SOSP '89)"}
@string{sosp91    = osr # " (" # pot # "Thirteenth" # sosp # ", SOSP '91)"}
@string{sosp93    = osr # " (" # pot # "Fourteenth" # sosp # ", SOSP '932)"}
@string{usenixs89 = pot # "Summer 1989 USENIX Conference"}
@string{usenixs92 = pot # "Summer 1992 USENIX Technical Conference"}
@string{usenixs93 = pot # "Summer 1993 USENIX Technical Conference"}
@string{usenixw89 = pot # "Winter 1989 USENIX Conference"}
@string{usenixw90 = pot # "Winter 1990 USENIX Conference"}
@string{usenixw91 = pot # "Winter 1991 USENIX Conference"}
@string{usenixw93 = pot # "Winter 1993 USENIX Conference"}
		  
		  
@InProceedings{ehs,
  author       = "Brian~D. Markey",
  title        = "Emerging Hypermedia Standards",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "59--74",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "standards, hypermedia, sgml, mheg, hytime, oda"
}

@InProceedings{mpshwtaam,
  author       = "Kazutoshi Fujikawa and Shinji Shimojo and Toshio Matsuura and Shojiro Nishio and Hideo Miyahara",
  title        = "Multimedia Presentation System ``{Harmony}'' with Temporal and Active Media",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "75--93",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "hypermedia, object-oriented systems, active links,
    event-based scheduling",
  abstract     = "This paper proposes a multimedia presentation system Harmony
    which can deal with temporal and active media such as motion video,
    computer animation, and music sounds.  Harmony is based on the notion of a
    hyperobject which integrates a hypertext system with an object-oriented
    framework.  Each object is considered a node as is usual in hypertext
    systems, and the relations between objects are represented as links between
    nodes.  Harmony extends the ordinary notion of a link.  A link in Harmony
    consists of three components: objects connected by the link, conditions
    specifying when the link is navigated, and messages sent to the target
    object.  In addition to such an extension, each object can include internal
    objects called subobjects which specify parts of an object and can become a
    source/destination of a link.  Furthermore, the notion of a group object is
    introduced to represent a synchronization of parallel displayed media
    information.  Through these extended notions of a hypertext model, temporal
    and active media can be easily handled through the description of temporal
    relations from the media in hypermedia documents.  Based on the design of
    Harmony, we have implemented a prototype multimedia presentation system
    which deals with text, music, graphics, motion video, and computer
    animation as objects.  Harmony consists of three subsystems: link manager
    subsystem (Harmony/LM), user interface subsystem (Harmony/UI), and
    object-oriented database (Harmony/DB), where a commercial object-oriented
    database was employed as the Harmony/DB.  Scenario viewer was developed for
    displaying the structure of scenario in a tree graph which can reduce a
    cognitive overhead in a hypermedia document.  The whole system was
    constructed based on C++ Language." 
}

@InProceedings{sefhpp,
  author       = "Seiki Inoue and Masahiro Shibata",
  title        = "Spatiotemporal Editing for {HDTV} Program Production",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "95--104",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "video editing, image processing, image synthesis",
  abstract     = {We have been developing a component image database for scene
    synthesis.  This report describes a new scene generation method using that
    image database and a multilayered image synthesizer.  In this method,
    several components images transferred from the database are arranged on
    multiple layers in spatiotemporal domain and combined to a scene or a whole
    program itself.  We call this method spatiotemporal editing.  An
    experimental HDTV (Hi-Vision) system was also developed and usefulness of
    this method was confirmed through actual Hi-Vision program productions.} 
}

@InProceedings{nofcstcs,
  author       = "Matthew Witten and Robert~E. Wyatt",
  title        = "Neural Orchestration:  From Cortical Simulation to Cortical Symphony",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "107--124",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "neural simulation, neural orchestration, biosymphonics,
    visualization, symphonics, realization, representation, actualization,
    cognitive descriptor, visualization descriptor",
  abstract     = "The signal flow in a vertical slab of neural tissue in cat
    area 17 has been computationally modeled.  The modeled slab covers 500x500
    mu^2 of cortical surface and extends vertically though the full cortex
    depth.  Data visualization complexity requires both visual and audio
    representation.  This paper presents the unique issues of and the complex 
    orchestral visualization of cortical simulation.  This leads to the
    concepts and formalizations necessary for a general theory of
    visualization."
}

@InProceedings{maempsdwaoot,
  author       = "Richard~L. Phillips",
  title        = "{MediaView}:  An Editable Multimedia Publishing System Developed with an Object-Oriented Toolkit",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "125--136",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "media editing, wysiwyg editing, nextstep, user-interface
    toolkits, object-oriented components, objective c",
  abstract     = "MediaView is an editable multimedia publication system, a
    feature that sets it apart from any system currently or previously
    available.  It achieves power, flexibility, and ease of use through the
    familiar cut, copy , and past exemplar normally applied only to text in
    WYSIWYG word processors.  In MediaView all components are manipulated this
    way.  MediaView was developed on a NeXT computer using the object-oriented
    development system called NeXTstep.  The powerful base classes defined
    there, coupled with Objective-C features like dynamic binding, enabled
    MediaView to be developed in a short time but with a rich feature set.  Two
    key subclasses of NeXTstep objects give MediaView its strengths.  Through
    them, arbitrarily complex multimedia components can be installed in a
    document and then copied and pasted, just as if they were words.  MediaView
    has two document formats --- one for compactness and speed and one for
    interchange with other applications and other computers.  The latter format
    s based on a hierarchical file system, which is well suited to UNIX but
    also to other systems, like that found on a Macintosh." 
}

@InProceedings{asftdmd,
  author       = "Dick C.~A. Bulterman and Guido {van Rossum} and Robert {van Liere}",
  title        = "{A} Structure for Transportable, Dynamic Multimedia Documents",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "137--155",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "dynamic multimedia document, multimedia document structure,
    portability, event descriptor, attribute descriptor, cwi multimedia
    interchange format, structural relationships, layered description,
    synchronization channel, synchronization arc",
  abstract     = "This paper presents a document structure for describing
    transportable, dynamic multimedia documents.  Multimedia documents consist
    of a set of discrete data components that are joined together in time and
    space to present a user (or reader) with a single coordinated whole.
    Transportable documents are those in which the document structure can be
    accessed across system environments independently of individual component
    input or output dependencies; dynamic documents are those in which the
    synchronization of document components are not staticly defined as an
    integral part of the data definition but are dynamicly defined as
    attributes of the general document structure.  The focus of this paper is
    the presentation of the basic building blocks of the CWI Multimedia
    Interchange Format (CMIF).  CMIF is used to describe the temporal and
    structural relationships that exist in multimedia documents.  In order to
    put our work in a concrete context, we start our discussion with a brief
    description of the portability requirements for documents used within the
    CWI/Multimedia Pipeline.  We then provide a layered description of our
    document structure format; this format provides a means for expressing a
    document in terms of synchronization channels, event descriptors, data
    descriptors, data blocks and synchronization arcs, each element of which
    contains a set of appropriate descriptive attributes.  The paper describes
    each of these concepts abstractly as well as in the context of a uniform
    example.  The paper concludes with a discussion of our intended future
    direction in using the various attribute descriptors to control a broad
    range of activities within the CWI/Multimedia Pipeline.", 
  location     = "http://homepages.cwi.nl/~dcab/PDF/usenix.doc.pdf"
}

@InProceedings{adattdoepp,
  author       = "Ying Liu and Ambuj~K. Singh and Rajive Bagrodia",
  title        = "{A} Decompositional Approach to the Design of Efficient Parallel Programs",
  booktitle    = pot # "4th International PARLE Conference on Parallel Architectures and Languages Europe",
  year         = 1992,
  editor       = "Etiemble, D. and Syre, J.~C.",
  pages        = "21--36",
  publisher    = sv,
  series       = lncs,
  volume       = 605,
  address      = "Paris, France",
  month        = "15--18 " # jun,
  keywords     = "unity",
  abstract     = "A methodology for the derivation of efficient parallel
    implementations from program specifications is developed.  The goal of the
    methodology is to decompose a program specification into a collection of
    module specifications, such that each module may be implemented by a
    subprogram.  The correctness of the whole program is then deduced from the
    correctness of the property refinement procedure and the correctness of the
    individual subprograms.  The refinement strategy is based on identifying
    frequently occurring control structures such as sequential composition and
    iteration.  The methodology is developed in the context of the UNITY logic
    and the UC programming language, and illustrated through the solution of
    diffusion aggregation in fluid flow simulations.", 
  location     = "ISBN:3-540-55599-4", 
  location     = "https://doi.org/10.1007/3-540-55599-4_78"
}

@InProceedings{pmic,
  author       = "Thomas G.~Aguierre Smith and Natalio Pincever",
  title        = "Parsing Movies in Context",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "157--168",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "media production, segmentation, stratification, video
    database, annotations, logging, audio cues",
  abstract     = "Traditional approaches in Multimedia systems force the user
    to segment video material into simple descriptions, which usually include
    endpoints and a brief text description in the form of keywords.  We propose
    to segment contextual information into chunks rather than segmenting
    contiguous frames.  The computer can help us organize sets of descriptions
    that are related to the recorded moving image: it can help us remember what
    we have shot.  Such descriptions can overlap, be contained in, and even
    encompass a multitude of other descriptions.  Parsing moving image
    sequences is reduced to simply parsing the contextual information which
    forms the description.  Our approach, Stratification, also has important
    ramifications in terms of an elastic representation of moving images.
    Ambient sound can provide us with important contextual clues as to what is
    going on within the frames.  Using audio to find patterns of content is an
    important step towards the eventual automatization of the logging
    process.", 
  location     = "http://mf.media.mit.edu/pubs/journal/ParsingContext.pdf"
}

@InProceedings{dmhctndrbs,
  author       = "Michael Pasieka and Paul~G. Crumley and Ann Marks and Ann Infortuna",
  title        = "Distributed Multimedia:  How Can the Necessary Data Rates be Supported?",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "169--182",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "token right, protocol development, performance measurement,
    multimedia transport, direct memory access",
  abstract     = "At the Information Technology Center at Carnegie Mellon
    University, we have been developing a system in which it is possible to
    deliver data to a presentation machine from a remote machine across a
    public network at a sustained high rate.  We have called this system a
    Continuous Time Media System (CTMS).  We have found that the UNIX 2 model
    used for transfer of data between two devices, the network transport
    protocols, and the ability of adapters to transfer data between themselves
    are insufficient to do this.  We have made modifications to each of these
    system in order to create a prototype system that we can measure to help
    define a CTMS protocol.  We present the results of this work in this
    paper.", 
  location     = "http://reports-archive.adm.cs.cmu.edu/anon/itc/CMU-ITC-107.pdf"
}

@InProceedings{msreftmos,
  author       = "Jun Nakajima and Masatomo Yazaki and Hitoshi Matsumoto",
  title        = "Multimedia\slash Realtime Extensions for the {Mach} Operating System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "183--198",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "scheduling, event handling, interrupt handling, realtime
    threads, asynchrony, multimedia application constraints, memory management,
    user-mode device drivers",
  abstract     = "We have extended the Mach operating system to support
    multimedia applications.  Our extensions for Mach provide the system
    designers and the developers with a reliable and flexible multimedia
    processing environment.  This paper focuses on realtime issues while
    supporting multimedia applications, asynchronous event notification which
    follows the POSIX P1003.4 proposal, preemptive deadline scheduling, and
    device drivers which run in user mode.  Preemptive deadline scheduling
    preempts asynchronous event notification for continuous media that requires
    each event handler to execute as soon as possible and schedules other event
    handlers to meet their time constraints as well.  The system designers must
    develop device divers for a wide variety of multimedia devices.  New
    devices will appear as multimedia technology progresses.  User-mode device
    drivers will help develop device drivers efficiently and provide a flexible
    environment.  The rationale, design, implementation and performance are
    presented." 
}

@InProceedings{atfmdvaas,
  author       = "P.~Venkat Rangan and Walter~A. Burkhard and
    Robert~W. Bowdidge and Harrick~M. Vin and John~W. Lindwall and Kashun Chan
    and Ingvar~A. Aaberg and Linda~M. Yamanoto and Ian~G. Harris",
  title        = "A Testbed for Managing Digital Video and Audio Storage",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "199--208",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "ropes, strands, media storage, media abstractions",
  abstract     = "We have developed a testbed for studying multimedia storage
    systems. We are using the testbed to experiment with media storage issues
    such as synchronization, continuous recording and retrieval, and
    manipulation of large files.  We define strand and rope abstractions that
    provide a paradigm for accessing multiple media.  Our system software
    architecture consists of two layers: the device-independent rope server,
    and the device-specific storage manager.  We have implemented a prototype
    within a Sun and PC environment.  We present our experiences and discuss
    system performance." 
}

@InProceedings{fssah,
  author       = "Hume, Andrew and Sunday, Daniel",
  title        = "Fast String Searching",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "221--233",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "string search, boyer moore, metaprogramming, performance",
  abstract     = "Despite substantial theoretical progress, there has been
    little improvement in practical string searching since the Boyer-Moore
    algorithm in 1977.  And even Boyer-Moore took several years to infiltrate
    the UNIX community.  We describe a new framework for understanding a class
    of algorithms based on the skip loop variant of Boyer-Moore and describe
    various components that can be used in this framework.  This leads to new
    algorithms that are substantially faster than the algorithms in current
    use.  Furthermore, new algorithms can be synthesised automatically from the
    names of component pieces.  The code for the algorithms is publicly
    available.", 
  location     = "https://doi.org/10.1002/spe.4380211105"
}

@InProceedings{taotimw,
  author       = "Eric Lindemann and Miller Puckette and Eric Viara and Maurizio {De Cecco} and Francois Dechelle and Bennett Smith",
  title        = "The Architecture of the {IRCAM} Musical Workstation",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "209--220",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "signal processing, real-time operating systems, software tools",
  location     = "https://www.jstor.org/stable/3680764"
}

@InProceedings{812tp9ws,
  author       = "Rob Pike",
  title        = "$8\,1/2$, the {Plan} 9 Window System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "257--265",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "window systems, file systems, plan 9",
  abstract     = "The Plan 9 window system, 8½, is a modest-sized program of
    novel design.  It provides textual I/O and bitmap graphic services to both
    local and remote client programs by offering a multiplexed file service to
    those clients.  It serves traditional UNIX files like /dev/tty as well as
    more unusual ones that provide access to the mouse and the raw screen.
    Bitmap graphics operations are provided by serving a file called
    /dev/bitblt that interprets client messages to perform raster operations.
    The file service that 8½ offers its clients is identical to that it uses
    for its own implementation, so it is fundamentally no more than a
    multiplexer.  This architecture has some rewarding symmetries and can be
    implemented compactly.", 
  location     = "https://9p.io/sys/doc/8%C2%BD/8%C2%BD.html"
}

@InProceedings{sssfssfi,
  author       = "David~G. Korn and Kiem-Phong Vo",
  title        = "{SFIO}:  Safe\slash Fast String\slash File {IO}",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "257--265",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "i-o, streams, unix, stdio",
  abstract     = "This paper describes Sfio, a new input/output library, that
    can be used as a replacement for Stdio, the C language standard I/O
    library.  Sfio is more complete, consistent, and efficient than Stdio.  New
    facilities are provided for convenient, safe and efficient manipulation of
    data streams.  An Sfio stream may be entirely memory resident or it may
    correspond to some actual file.  Alternative I/O disciplines can be applied
    to a stream to customize its behavior with respect to data transformation
    and exception handling.  Stream pools can be maintained to guarantee stream
    synchronization when switching streams for I/O operations.  Separate
    streams can be stacked on one another to make new virtual streams.  Both
    source and binary compatibility packages are provided allowing Stdio-based
    programs to benefit from the new library without recoding.  Sfio has been
    used successfully in a number of applications including many rewritten
    standard system utilities.  Sfio Benchmark timings show that performs very
    well against Stdio and standard utilities can gain substantial performance
    improvement when based completely on Sfio.", 
  location     = "https://www.cs.princeton.edu/courses/archive/fall97/cs595/sfio.ps"
}

@InProceedings{amgui,
  author       = "Rob Pike",
  title        = "{A} Minimalist Global User Interface",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "267--280",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "windows, user interfaces, minimalism",
  abstract     = "Help is a combination of editor, window system, shell, and
    user interface that provides a novel environment for the construction of
    textual applications such as browsers, debuggers, mailers, and so on.  It
    combines an extremely lean user interface with some automatic heuristics
    and defaults to achieve significant effects with minimal mouse and keyboard
    activity.  The user interface is driven by a file-oriented programming
    interface that may be controlled from programs or even shell scripts.  By
    taking care of user interface issues in a central utility, help simplifies
    the job of programming applications that make use of a bitmap display and
    mouse.", 
  location     = "http://doc.cat-v.org/plan_9/1st_edition/help/"
}

@InProceedings{igradm,
  author       = "Dean Rubine",
  title        = "Integrating Gesture Recognition and Direct Manipulation",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "281--298",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "gesture-based interfaces, statistical classification, user
    interfaces",
  abstract     = "A gesture-based interface is one in which the user specifies
    commands by simple drawings, typically made with a mouse or stylus.  A
    single intuitive gesture can simultaneously specify objects, an operation,
    and additional parameters, making gestures more powerful than the clicks
    and drags of traditional direct-manipulation interfaces.  However, a
    problem with most gesture-based systems is that an entire gesture must be
    entered and the interaction completed before the system responds.  Such a
    system makes it awkward to use gestures for operations that require
    continuous feedback.  GRANDMA, a tool for building gesture-based
    applications, overcomes this shortcoming through two methods of integrating
    gesturing and direct manipulation.  First, GRANDMA allows views that
    respond to gesture and views that respond to clicks and drags (e.g.
    widgets) to coexist in the same interface.  More interestingly, GRANDMA
    supports a new two-phase interaction technique, in which a gesture
    collection phase is immediately followed by a manipulation phase.  In its
    simplest form, the phase transition is indicated by keeping the mouse still
    while continuing to hold the button down.  Alternatively, the phase
    transition can occur once enough of the gesture has been seen to recognize
    it unambiguously.  The latter method, called eager recognition, results in
    a smooth and natural interaction.  In addition to describing how GRANDMA
    supports the integration of gesture and direct manipulation, this paper
    presents an algorithm for creating eager recognizers from example
    gestures.", 
  location     = "http://ra.adm.cs.cmu.edu/anon/itc/CMU-ITC-100.pdf"
}

@InProceedings{asycrbycth,
  author       = "Sanjay Manandhar",
  title        = "{Activity Server}: You can run but you can't hide",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "299--312",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "location awareness, the panopticon, finger",
  abstract     = "The activity server is a software utility that provides
    high-level information on what a user or a number of users are doing by
    combining data inputs from various sources.  These sources are: 1)
    thejinger server, 2) the phone server, and 3) the location server.  The
    finger server provides information on users' activities or lack thereof on
    hosts within a local network; the phone server abstracts information from
    call progress of users' digital phones whereas the location server
    abstracts information from active badge sightings.  Responses from all
    these unobtrusive data gathering sources are put together to form a
    composite model of the activities of users.  Information may be collected
    only from or on behalf of participating users; each user within the user
    community can determine how much of his own information the activity server
    may receive.  The main attributes of the activity server are: 1) it
    maintains history of all the participating users, 2) it synchronizes among
    the many, possibly conflicting, pieces of information from three sources,
    3) it distinguishes interdependence of activities among users, and 4) it
    provides a high-level abstraction about users' activities.", 
  location     = "https://www.media.mit.edu/publications/activity-server-you-can-run-but-you-cant-hide/"
}

@InProceedings{dcfjvasaiauwe,
  author       = "Bernard~I. Szabo and Gregory~K. Wallace",
  title        = "Design Considerations for {JPEG} Video and Synchronized Audio in a " # unix # " Workstation Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "353--368",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "jpeg, mpeg, video coding, video compression, jpeg video,
    multiplexing, audio encoding, synchronization",
  abstract     = {This article describes design considerations for use of the
    draft ISO JPEG standard as a digital video compression technique, to record
    and play back option images with synchronized compressed audio in a
    Unix-based workstation.  Background discussion is provided on JPEG and why
    it is a strong candidate to become a de facto standard for interactive
    digital video, even though MPEG is the ISO standard primarily intended for
    this purpose.  Examples are given of the data rates and typical
    frame-to-frame variations of JPEG data streams which must be supported by
    real-time software.  A simple audio coding algorithm is described, along
    with a video/audio multiplexed encoding scheme, which was designed both as
    a practical starting format for JPEG video, and as a vehicle for initial
    investigation of the more complex MPEG systems multiplexed encoding format.
    A description of the hardware testbed designed for our experimental work is
    given, and this leads to a discussion of how the task of keeping video and
    audio streams relatively synchronized during playback can be managed with
    minimum burden on the operating system.  Finally, the real-time software
    design which runs on the host Unix workstation is summarized, and key
    issues for system resource management are highlighted.} 
}

@InProceedings{madmae,
  author       = "George~D. Drapeau and Howard Greenfield",
  title        = "{MAEstro} --- {A} Distributed Multimedia Authoring Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "315--328",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "multimedia editing, multimedia documents, system design,
    courseware, loosely-coupled systems, ",
  abstract     = "Current multimedia authoring environments are typically
    designed as self-contained systems; one application is completely
    responsible for the creation of multimedia documents.  The number of media
    supported by such systems is usually small, and accommodating new media
    typically requires rewriting the authoring system.  Meanwhile, workstation
    vendors are adding multimedia support to distinguish their products from
    those of their competitors.  As a result, new media are being introduced on
    the workstation platform so quickly that monolithic authoring systems
    incorporating today’s state-of-the-art media are often obsolete within a
    year.  MAEstro was designed for extensibility.  The key to MAEstro is its
    inter-application messaging system, similar to NeXT’s Speaker-Listener
    protocol [1].  Through the messaging system, an authoring application
    controls a number of “mediaeditors” (applications responsible for the
    manipulation of a particular medium or source of information).  When
    creating a multimedia document, the authoring application asks the media
    editors for information about their current selections; during playback,
    the authoring application sends messages to the media editors telling them
    to perform media selections.  At present, MAEstro consists of a suite of
    applications on Sun and NeXT workstations.  Media editors on the Sun
    support text, CD audio, videodiscs, and a text search engine.  The NeXT
    runs a MIDI music editor.  The authoring application is a timeline editor
    running on the Sun that allows authors to create multimedia documents using
    any combination of media on both workstations.  For example, an author can
    create a multimedia document that synchronizes NeXT-controlled MIDI
    synthesizers with video controlled by the Sun.", 
  location     = "http://www.transcode.com/sites/default/files/ProductInfo/IntroPaper.ps.gz"
}

@InProceedings{nmmapc,
  author       = "Walter Bender and H{\aa}kon Wium Lie and Jonathan Orwant and Laura Teodosio and Nathan Abramson",
  title        = "Newspace:  Mass Media and Personal Computing",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "329--348",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "digital media, news delivery, personalization, news gathering",
  abstract     = {This study describes the implementation of a display
    application, Newspace, that offers a broadsheet-sized electronic news
    presentation to the reader.  The use of paper-quality displays coupled with
    personal computing gives us a range of new possibilities in content
    selection, imagery, typography, and human interaction.  A computational
    intermediary, acting in concert and on behalf of the reader makes possible
    new publishing styles and forms.  Newspace invites instant updates and
    spontaneous interaction, while retaining the notion of the edition, with a
    front page, headlines, simultaneous presentations and juxtapositions.  The
    application is not limited to traditional news retrieval.  The news is
    augmented with information from local and remote databases, including
    electronic mail.  This compilation of data is presented in the style of
    news media, complementing rather than supplanting it.  The combination and
    juxtaposition of multiple forms of media is being explored.  Salient
    features of news stories, such as the non-lexical cues in audio and video
    news, are abstracted and stored in a database.  The information is used in
    augmentation and linking to stories in remote databases, to translate
    information across media types, and to display the news in styles amenable
    to individual users.  Further personalizing is accomplished by maintaining
    dynamic user models.  These models include information such as the user's
    schedule and topics of interest.  The system monitors user actions to
    bolster both precision and accuracy of the model over time.} 
}

@InProceedings{svuu,
  author       = "Paul~G. Milazzo",
  title        = "Shared Video under " # unix,
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "369--383",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "interactive video, video hardware, video applications,
    network video servers",
  abstract     = "The BBN Video Information Server, constructed by the
    Multimedia System Group, serves several video workstations in nearby
    offices.  The server and workstations are both based on a combination of
    Unix workstations and Amiga personal computers, and communicate using a
    special video-request protocol layered atop SUNRPC.  The server supports a
    wide variety of video applications, including interactive video browsers
    and editors, programs that use moving images as user-interface objects, and
    programs that automatically index video that has closed captions.  Our
    experience suggests improvements both in Unix and in workstation hardware.
    Native support for bandwidth-reservation protocols and multicasting, and
    synchronization primitives for character I/O devices would be invaluable,
    as would better clocks." 
}

@InProceedings{ewacutxwsuati,
  author       = "Robert Terek and Joseph Pasquale",
  title        = "Experiences with Audio Conferencing Using the {X Window System}, " # unix # ", and {TCP/IP}",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "405--418",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "audio conferencing, x window system, delay, performance
    measurement",
  abstract     = "We present a voice-quality audio conferencing system built
    using standard system software, specifically the SunOS 4.0 version of UNIX,
    X11, and TCP/IP on an Ethernet.  Since this software does not provide real
    time guarantees, we describe a simple strategy for recovering from missed
    deadlines by discarding late audio data.  Using this strategy, conferences
    proceed without delay entering into conversations.  To simplify application
    programming, a key part of the conferencing system is an X11 server
    modified to accept audio requests.  This not only provides network
    transparent access to audio devices, but also has implications for
    synchronizing audio with graphics or any other media that an enhanced X11
    server may process.  In this study, we describe the structure of the
    conferencing application and X11 server and then characterize the
    performance of this system." 
}

@InProceedings{ceaeits,
  author       = "Mark Taunton",
  title        = "Compressed Executables:  an Exercise in Thinking Small",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "385--403",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "data compression, code compression",
  abstract     = "In the project described in this paper, a large body of
    software --- including a port of 4.3 BSD, Sun NFS and the X Window System
    --- has been made to fit onto small personal computers with comparatively
    tiny discs and an unusual memory management architecture.  The problem of
    space is exacerbated by the relatively low code density of the RISC
    processor used, and an enormous hardware-imposed page size might well be
    expected to make matter worse.  Part of the solution is an implementation
    of shared libraries.  In addition, considerable savings, of both disk space
    and other resources, are obtained by applying a specialized data
    compression technique to demand-paged executable files.  This is done in
    such a way that the compressed programs are still runnable.  In the process
    the huge page size is turned to advantage by utilizing a standard feature
    of the UNIX file system.  Some additions to the kernel, a few extra
    utilities, and some minor changes in the standard toolkit support the
    scheme.  We briefly explain the background to this work, and outline the
    shared library mechanism.  The remainder of the paper focuses on the
    concept of compressing executable code, examining its advantages and its
    limitations.  We suggest possibilities for further improvement of the
    current implementation, and also some ways in which the technique might be
    exploited in a broader context." 
}

@InProceedings{iaatiadwe,
  author       = "Susan Angebranndt and Richard~L. Hyde and Daphne Huetu Luong and Nagendra Siravara and Chris Schmandt",
  title        = "Integrating Audio and Telephony in a Distributed Workstation Environment",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "419--435",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "audio servers, audio device management",
  abstract     = "More and more vendors are adding audio, and occasionally
    telephony, to their workstations.  At the same time, with the growing
    popularity of window systems and mice, workstation applications are
    becoming more interactive and graphical.  Audio provides a new dimension of
    interaction for the user, and the possibility of a powerful new data type
    for multi-media applications.  This paper describes our architecture for
    the integration of audio and telephony into a graphics workstation
    environment.  Our framework is a client-server model; at the heart is an
    audio server that allows shared access to audio hardware, provides
    synchronization primitives to be used with other media and presents a
    device-independent abstraction to the application programmer.", 
  location     = "https://www.media.mit.edu/speech/papers/1991/angebranndt_USENIX91_integrating_audio.pdf"
}

@InProceedings{pefmd,
  author       = "Matthew~E. Hodges and Russell~M. Sasnett",
  title        = "Plastic Editors for Multimedia Documents",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "463--473",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "multimedia documents, multimedia editors, configurable
    editors, active documents",
  abstract     = {This paper describes our research with plastic editors in the
    Visual Computing Group of MIT's Project Athena.  The idea of plastic
    editors is to break down the distinction between editor (program) and
    document (data), to enable the manufacture of editors which can be molded
    and shaped to meet many different needs.  The Athena Muse authoring system
    allows us to experiment with the idea of building editing tools out of the
    components provided in the authoring system itself.  In this paper we
    describe the importance of mutable editors in an application environment,
    the basic dimensions of plasticity in editors, and some examples of how we
    built and modified the Muse editing tools.}
}

@InProceedings{awbmmefbt,
  author       = "Keishi Kandori",
  title        = "{A} Workstation-based Multi-media Environment for Broadcast Television",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "455--461",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "modeling, sports, video processing, visualization, data acquisition",
  abstract     = "This presentation will describe two applications which
    illustrate expanding workstation power in the real broadcasting world.  One
    is a sophisticated application of virtual reality in which we simulated the
    environment of the green of the 18th whole in a real time during a real
    professional golf tournament for a broadcast TV program.  The other is
    professional baseball information management system for TV program
    production in which we incorporated distributed computing, mixed
    networking, database managing, and computer graphics." 
}

@InProceedings{abootddcs,
  author       = "Newman-Wolfe, R.~E. and Ramirez, C.~L. and Pelimuhandiram, H. and Montes, M. and Webb, M. and Wilson, D.~L.",
  title        = "{A} Brief Overview of the {DCS} Distributed Conferencing System",
  booktitle    = usenixs91,
  year         = 1991,
  pages        = "437--461",
  address      = nate,
  month        = "10--14 " # jun,
  keywords     = "groupware, conference management, application managers",
  abstract     = "The Distributed Conferencing System (DCS) at the University
    of Florida is a distributed package providing real-time support for
    cooperative work.  In this system, a set of mechanisms for conference
    management supports a wide range of floor control paradigms.  The small,
    flexible message-passing interface to the conferencing management processes
    permits shared applications to be installed easily in DCS.  Currently, DCS
    has applications that support concurrent development of text and graphic
    documents; remote demonstration, testing and debugging of programs; and
    automatic creation of transcripts of meetings including motions made and
    voting results." 
}

@InProceedings{awblbsfkma,
  author       = "T.~Paul Lee and R.~E. Barkley",
  title        = "{A} Watermark-based Lazy Buddy System for Kernel Memory Allocation",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "1--13",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "storage management, buddy allocation, lazy allocation, streams",
  abstract     = "In this paper we describe a watermark-based lazy control
    policy of the buddy system for managing unix kernel memory space.  This
    policy achieves low operational costs by capitalizing on the steady-state
    behavior of memory demands.  The lazy control policy maintains watermark
    indices to track the use of buffers for each size.  Depending on these
    indices, the policy can be in lazy mode, reclaiming mode, or accelerated
    mode when dealing with buffer coalescing.  We incorporate a damping
    mechanism in the coalescing process by anticipating that the buffer will
    soon be re-used, and an acceleration mechanism that lets the policy detect
    and react to shifting memory demands.  The controls to these mechanisms are
    distributed over each class of buffer size; such distributed controls are
    particularly attractive when the costs of maintaining global information
    and control are prohibitive.  We present results and comparisons of
    experiments conducted on a prototype lazy buddy system used to manage unix
    system streams buffers.  The costs of buffer operations under the lazy
    control policy are consistently lower than those under the standard buddy
    system with only a slight increase in blocking probability." 
}

@InProceedings{oobcis,
  author       = "Stephen Rago",
  title        = "Out-Of-Band Communication in {STREAMS}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "29--37",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "out-of-band signaling, streams, backward compatibility",
  abstract     = "The STREAMS mechanism in UNIX System V is a flexible
    networking software development framework.  However, STREAMS makes little
    provision for the out-of-band communication facilities found in many
    contemporary protocols.  This paper describes enhancements to STREAMS that
    provide the underlying support for out-of-band communication.  The reader
    is assumed familiar with STREAMS." 
}

@InProceedings{aewnsl,
  author       = "Vaidy~S. Sunderam",
  title        = "An Experiment with Network Shared Libraries",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "39--49",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "shared libraries, x window system, rpc",
  abstract     = "Library routines, ranging from isolated formatters to
    complete software packages are used by virtually every program.  Under
    several circumstances, it is beneficial and even desirable for a 'library
    server' on a remote machine to provide such functions to multiple clients
    that share this service.  This paper describes the design, implementation
    and experience gained in the deployment of such a server on a local network
    of independent workstations.  While the network shared library is premised
    on the basic RPC concept, extensions have been needed to support the
    preservation of state across calls, client and server failures, and server
    multiplexing.  A network shared library for the X Window System has been
    implemented and tested; with the server on a fast processor, multiple
    clients have been observed to run at higher speeds with the added benefits
    of reduced memory and processing overheads on the client machines." 
}

@InProceedings{dpilcums,
  author       = "F. Bonomi and P.~J. Fleming and P.~D. Steinberg",
  title        = "Distributing Processes in Loosely-Coupled " # unix # " Multiprocessor Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "61--72",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "process scheduling, multiprocessors, load balancing",
  abstract     = "We describe a method for distributing processes in a
    loosely-coupled Unix computing environment.  Focusing on the exec() system
    call in the AT&T 3b4000 Computer System running the UNIX System V Release
    3.1.5 Operating System, we discuss design and implementation techniques for
    process migration, the role of stub processes, as well as a novel
    load-balancing process assignment algorithm.  We explain the stages of the
    exec() system call and show the method for migrating a process by
    constructing its new image on a different processor with the cooperation of
    all other processors comprising the extended process.  Selection of the
    recipient processor is critical to load-balancing, so we discuss an
    algorithm that is an adaptive version of the Join-the-Biased-Queue policy.
    The algorithm utilizes a combination of the available instantaneous
    information about the number of processes on each processor and
    periodically collected average CPU run-queue length information as indices
    of load to make the assignment decision.  A performance comparisons of
    three different process assignment algorithms is included to demonstrate
    the efficiency of our approach." 
}

@InProceedings{aodmbacg,
  author       = "Denise Ondishko",
  title        = "Administration  of Department Machines by a Central Group",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "73--82",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system administration, contractarians, unix",
  abstract     = "Like most other universities, the University of Rochester has
    seen a rapid growth in departmentally owned machines running a version of
    the Unix operating system.  Each department typically has a special task
    required of its machine.  In addition, each department desires control over
    its own resources.  By providing a centrally trained group of system
    programmers a university can avoid duplication of effort and education on
    the part of many departmental system programmers.  However, tie needs of
    the central programmer and the departmental programmer conflict: it would
    be easiest for the departmental programmer to make any changes at any time
    and it would be easiest for the central programmer if all of the machines
    looked identical and did not change unpredictably.  The University of
    Rochester Computing Center has developed a method of resolving these
    differences through a contract of services and responsibilities which
    specify areas of the operating system which must only be modified by the
    central system programmers and areas of the system which are the exclusive
    responsibility of the department programmer.  The department programmer
    must conform the system usage somewhat to a central norm in order to get
    the benefits of central administration.  However, unlike most centrally
    administered sights, system changes are initiated by the department
    administrator rather than by the central group.  This paper will describe
    the keys to the success of the support contracts." 
}

@InProceedings{oaolcsfu,
  author       = "Thomas~J. Coppeto and Beth~L. Anderson and Daniel~E. {Geer, Jr} and G.~Winfield Treese",
  title        = "{OLC}:  An On-Line Consulting System for " # unix,
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "83--94",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "help systems, project athena",
  abstract     = "Helping users learn the intricacies of UNIX1, particularly in
    a custom environment, is always a challenge.  Helping thousands of users in
    an environment that is distributed both geographically and computationally
    is especially difficult.  Project Athena has developed an “On-Line
    Consulting” system (OLC) that enables users to ask questions of consultants
    located “somewhere on the network.” OLC allows a staff on the order of
    twenty students to handle the questions and problems of over 8000 users on
    a network of more than 900 workstations.  This paper describes the motives
    and design goals for OLC, its implementation, and some of the results of
    its three years of operation.", 
  location     = "http://dx.doi.org/10.1145/73760.73814"
}

@InProceedings{adrafus,
  author       = "Griffith~G. {Smith, Jr.}",
  title        = "{A} Distributed Resource Allocator for " # unix # " Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "95--108",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "resource allocation, deadlock avoidance, system management",
  abstract     = "Unix System users have had to tolerate insecure access to
    nonsharable resources such as cartridge units, tape drives and printers.
    As commercial applications for Unix System software become common, more
    security will be a critical requirement.  Software vendors price or
    restrict the number of concurrent users of their licensed software.  These
    license terms are often difficult to enforce.  A resource allocate can
    address both problems.  This paper describes a working prototype of a
    distributed resource allocate suitable for systems connected by a network.
    Its design is unusual in that there is no single place where a resource a
    resource allocation database is maintained.  Instead, servers keep
    information that is of local interest.  Clients set up a network
    connections to groups of servers and then negotiate among the servers for
    the right to allocate resources.  The servers dynamically configure
    themselves into negotiation groups; allocation requests within a group are
    queued, requests to unrelated groups can be processed in parallel.  For a
    single system, a robust resource allocate is simple to implement, but a
    design of an allocate for a cluster of systems connected by a network is
    difficult; there are many opportunities for partial failure and incorrect
    behavior.  The allocate achieves a significant level of fault tolerance by
    exploiting the redundancy of the information stored on multiple servers ad
    by avoiding architecture that is vulnerable to faults.  Negotiation
    protocols combine the distributed information and ensure that a 'correct'
    decision will be made even when some of the servers fail or have
    inconsistent status." 
}

@InProceedings{aupifcbagws,
  author       = "Marc~J. Rochkind",
  title        = "{A} Unified Programming Interface for Character-Based and Graphical Window Systems",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "109--117",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "curses, ui, graphics portability, character-based io",
  abstract     = "Must Unix programmers today sit at character-based terminals,
    and most of the user interfaces they develop, even for brand-new
    applications, are character-based.  Yet, almost everyone agrees that future
    user interfaces will be graphical.  Unfortunately, few character-based
    applications will migrate easily to graphical window systems (such as X)
    because the graphical systems use even-driven programming models that are
    quite different from traditional character-based models, and because
    graphical systems use an entirely different application program interface.
    The solution is to use a character-based window system that follows the
    programming model used by the graphical systems and that has the same
    programming interface.  The Extensible Virtual Toolkit (XVT) interface is a
    good choice, because it already permits portability to several popular
    graphical window systems.  This paper reviews the evolution of Unix user
    interfaces and explains why most developers can't use graphical interfaces
    today.  Then it surveys the XVT programming interface and indicates the
    degree to which it can be mapped into a character-based model.  Finally,
    the construction of the character-based system is briefly described." 
}

@InProceedings{ahwxsnw,
  author       = "Mark Opperman",
  title        = "At Home With {X11}\slash {NeWS} Windows",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "119--131",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "window systems, serial-line protocols, compression",
  abstract     = "The X11/NeWS server has been modified to support X11 and NeWS
    clients across a serial interface providing remote access to window-based
    applications.  The Unix system services required by the X11/NeWS server
    have been isolated into a helper process that runs on the host to which the
    window serve connects.  A reliable, full-duplex, channel-based protocol
    provides the link between the window server and the helper process.
    Pre-allocated channels are used tor system services (e.g., open, close,
    spawn) and dynamically allocated channels are used to multiplex data
    streams from the different window client applications.  Data transmitted
    between the window server and the helper process are compressed using the
    adaptive Limpel-Ziv technique.  Prototype versions of the server run on an
    ATARI ST and on Sun workstations with surprisingly good performance for
    both NeWS and X11 clients at baud rates as low as 2400." 
}

@InProceedings{iusaidisd,
  author       = "Ehrlich, Kate and Stanley, Barbara and Shea, Tim",
  title        = "Incorporating Usability Studies and Interface Design into Software Development",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "133--145",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "prototyping, user-interface studies, design feedback, user experience",
  abstract     = "The new graphical file manager on the Sn386i, Sun Organizer,
    was designed to provide easy access to file system and network operations
    for people unfamiliar with the Unix operating system.  The graphical
    interface to Organizer supported a direct manipulation style of
    interaction, a clean graphic design and plenty of user feedback.  In order
    to verify that Organizer was easy to use by the target audience, we
    conducted a study in which a representative group of users followed a
    self-administered tutorial.  This introduced them to basic operations such
    as changing directories, selecting files, deleting and adding files and
    moving/copying files between directories.  Although these users were
    enthusiastic about Organizer and completed the tutorial successfully, there
    were several instances where the behavior of the application did not match
    the user's expectations.  Many of these mismatches were corrected in the
    final product resulting in a smoother, more efficient interface.  Users
    also appreciated the emphasis on active learning.  For novice users
    especially, being given an explicit set of procedures to follow can help
    overcome limits in the rate of assimilating hew information.", 
  location     = "https://doi.org/10.1145/108844.109008"
}

@InProceedings{t3dfs,
  author       = "David~G. Korn and Eduardo Krell",
  title        = "The 3-{D} File System",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "147--156",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "file systems, file versioning, virtual paths",
  abstract     = "Traditional version control mechanisms in the Unix System
    have serious drawbacks.  They work only on ASCII files and are encapsulated
    systems which do not fit nicely with the rest of the tools in the Unix
    systems.  Sharing of file is not possible, as programmers have to make
    their own private copies when they want to work on different versions of a
    file.  The memorandum describes a powerful versioning mechanism which
    allows users to view different versions of files in a Unix file system and
    allows multiple programmers to work on different versions of the software
    simultaneously, without having to make private copies of the files
    involved.  This capability, now in prototype form, extends the concept of
    versioning to systems rather than files and to files with arbitrary format
    (e.g.  object files and libraries) rather than only line oriented ASCII
    files (e.g.  source code).  We have extended the concept of viewpathing in
    a way that is transparent to all programs without requiring any changes.
    The current implementation is a user-level library which can be used to
    relink any program or command which is to understand versions and
    viewpathing.  No changes need to be made to the user programs." 
}

@InProceedings{aefhw,
  author       = "Glenn~S. Fowler and David~G. Korn and K.-Phong Vo",
  title        = "An Efficient File Hierarchy Walker",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "173--188",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system utility, file system, tree walking",
  abstract     = "This paper presents an interface specification and an
    efficient implementation of a general purpose library routine, ftwalk, to
    traverse a UNIX* file system hierarchy.  A number of standard file system
    utilities, e.g., find, ls, rm, and others have been reimplemented using
    ftwalk.  The total source code size is 30% smaller and the efficiency of
    all commands improves.  More importantly, these commands now handle the
    file system search in a uniform, robust, and secure manner.  New tools have
    been built with ftwalk.  A file system perusing tool, tw, will be
    described.  tw subsumes the functionality ofﬁfind and xargs.  Further, it
    provides a powerful expression language with a syntax similar to C.  For
    typical applications in which commands are executed on generated file
    names, tw is 5 to 10 times faster than find.  The combination of a powerful
    language and performance efficiency in tw should reduce the practice of
    adding directory recursion to commands.", 
  location     = "http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.119.7085&rep=rep1&type=pdf"
}

@InProceedings{soti9hcrfsihu,
  author       = "Ping-Hui Kao and Bill Gates and Bruce Thompson and Dale McCluskey",
  title        = "Support of the {ISO}-9660/{HSG} {CD}-{ROM} File System in {HP}-{UX}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "189--202",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "file systems, vnodes, cd-roms",
  abstract     = "The ISO-9660 standard and High Sierra Group (HSG) working
    paper describe file system formats for publication and distribution of
    information on CD-ROM (Compact Disk Read Only Memory) media.  This paper
    describes Hewlett-Packard's design and implementation of support for the
    ISO-9660/HSG CD-ROM file system (CDFS) in the HP-UX kernel.  After mounting
    a CD-ROM which adheres to the standard, files on the CD-ROM are accessible
    through the normal system calls and commands allowing users and application
    programs to take advantage of the high capacity and low duplication cost of
    this medium without the need for any special programmatic interface.  The
    first sections a brief overview of CD-ROM history and the ISO-9660/HSG file
    system format.  The design goals, design philosophy, and testing strategy
    will then be presented followed by some examples of how this new feature
    will be used in HP-UX systems.  The paper will conclude with a discussion
    of the results of the project and possible enhancements to the design." 
}

@InProceedings{safdacfubg,
  author       = "Jeffrey~C. Mogul",
  title        = "Simple and Flexible Datagram Access Controls for Unix-based Gateways",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "203--221",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "user-space filtering, application gateways, system calls",
  abstract     = "Internetworks that connect multiple organizations create
    potential security problems that cannot be solved simply by internal
    administrative procedures.  Organizations would like to restrict
    inter-organization access to specific restricted hosts and applications, in
    order to limit the potential for damage and to reduce the number of systems
    that must be secured against attack.  One way to restrict access is to
    prevent certain packets from entering or leaving an organization through
    its gateways.  This paper describes simple, flexible, and moderately
    efficient mechanisms for screening the packets that flow through a
    Unix-based gateway.", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/WRL-89-4.pdf"
}

@InProceedings{nmbd,
  author       = "Goldszmidt, German and Yemini, Yechiam and Yemini, Shaula",
  title        = "Network Management by Delegation",
  booktitle    = pot # "1991 Conference of the Centre for Advanced Studies on Collaborative Research, CASCON '91",
  year         = 1991,
  editor       = "Ann Gawam and Jan~K. Pachl and Jacob Slonim and Anne Stilman",
  pages        = "347--361",
  publisher    = "IBM Press",
  address      = "Toronto, Ontario, Canada",
  month        = "28--30 " # oct,
  keywords     = "cmip, protocol expressiveness, remote delegation, scripting,
    coordination, agent architecture", 
  abstract     = "Network management systems built on a client/server model
    centralize responsibilities in client manager processes, with server agents
    playing restrictive support roles.  As a result, managers must micro-manage
    agents through primitive steps, resulting in ineffective distribution of
    management responsibilities, failure-prone management bottlenecks, and
    limitations for real time responsiveness.  We present a more flexible
    paradigm, the Manager-Agent Delegation (MAD) framework.  It supports the
    ability to extend the functionality of servers (agents) at execution time,
    allowing flexible distribution of management responsibilities in a
    distributed environment.  MAD can store and instantiate delegated scripts,
    and provides a concurrent runtime environment, where they can execute
    asynchronously without requiring the manager's intervention.  A delegation
    protocol allows a manager to transfer programs, create process instances,
    and control their execution.  We describe the delegation model, its
    application to network management, and the design of a prototype
    implementation." 
}

@InProceedings{stoascup,
  author       = "Janet~A. Cugini and Shau-Ping Lo and Matthew~S. Hecht and Radhakrishna Aditham and T.~John Wei",
  title        = "Security Testing of {AIX} System Calls Using {Prolog}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "223--237",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "security testing, orange book, operating systems, unix
    operating system, unix system calls, operating system security, computing
    security, prolog, logic programming",
  abstract     = "We wrote security test plans and, using Prolog, and automated
    security testing system for C2 security testing of AIX version 2.2.1 system
    calls.  AIX 2.2.1 is a version of the UNIX operating system that runs on
    the IBM rt PC hardware and that contains security features (for the base
    operating system and TCP/IP) designed to satisfy the C2 security
    requirements and the B3 trusted path requirement.  The notable design
    features of our work include: (1) it is based on the gray box security
    testing method; (2) the security test plans contain both converge analysis,
    which explains why the test conditions are sufficient and why the test data
    cover the test conditions, and system call test environment dependency
    analysis; (3) the security testing system is comprehensive in that it
    automates all aspects of security testing except for writing security test
    plans and adding, per system call, a set of facts and rules that cover
    system call syntax, text conditions, and expected outcomes; and (4) this
    work is also suitable for security testing of UNIX system calls for higher
    security issues.  We explain what motivated the Prolog security testing
    system approach, discuss how we write security test plans, sketch the
    structure of the security testing system, and provide qualitative
    experience with the approach to security testing.  From this experience and
    the Secure XENIX project experience, we conclude that comprehensive
    security testing of UNIX system calls with an automated security testing
    system in Prolog is preferable to writing and maintaining security test
    programs manually written in the C programming language." 
}

@InProceedings{faaptabltu,
  author       = "Jon~F. Spencer and Jackie McAlexander",
  title        = "Factors Affecting Application Portability to a {B1} Level Trusted " # unix,
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "239--255",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "portability, trusted computing base, performance",
  abstract     = "With the increasing use of operating systems which have been
    modified to meet multi-level security requirements comes an increasing need
    to port standard Unix applications to these platforms.  This paper
    discusses major changes made to target the B1 level of trustedness.  It
    shows that vendor implementations may may, and that these variations affect
    the portability and performance of existing applications.  The paper takes
    the Unix mail program and discusses several implementation methods on a B1
    system." 
}

@InProceedings{utdsc,
  author       = "Daniel~S. Conde and Felix~S. Hsu and Ursula Sinkewicz",
  title        = "{ULTRIX Threads}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "257--268",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "threads, unix, thread library",
  abstract     = "Two groups at Digital recently collaborated on a prototype
    implementation of threads in ULTRIX, Digital's Unix product.  Threads, or
    lightweight processes, provide a means for applications to control
    complexity and more efficiently utilize uniprocessors and multiprocessors.
    Uniprocessor benefits can be realized by using threads to overlap I/O
    operations with computation, and to cope with complex asynchronous run-time
    environments in a synchronous way.  Multiprocessors allow the additional
    benefit of executing an application's threads concurrently.  A wide variety
    of designs were considered for ULTRIX Threads, beginning with user-level
    threads, and evolving to kernel threads.  The trade-offs between
    lower-level threads and kernel threads are discussed and contrasted with
    other multi-thread systems, both Unix-based and non-Unix based.  Finally,
    the kernel, library, and dbx changes are described in some detail,
    highlighting the trade-offs and decisions made in our final design." 
}

@InProceedings{nanfspb,
  author       = "Barry Shein and Mike Callahan and Paul Woodbury",
  title        = "{NFSStone}:  {A} Network File Server Performance Benchmark",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "269--275",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "network performance, network file systems, nfs, benchmarking",
  abstract     = "Network file servers are becoming a critical facility in
    modern computing environments.  With the growth in their popularity and the
    emergence of multiple vendors providing software products which adhere to
    the same standards comes a need for relative performance measurement of
    different configurations.  We have designed a benchmark and report our
    experiences with it on different configurations of services and clients.
    The benchmark was designed to be portable between networked file system
    protocols and tunable to reflect different disk traffic patterns if
    desired.  The default parameters used were chosen to be similar to the
    traffic patterns of typical networked file system environments as earlier
    reported in [SANDBERG85]." 
}

@InProceedings{uairtpmfusv,
  author       = "Charles Ballance and Sean Fleming and Jay Goldberg and Nelly Karasik",
  title        = "{UFOS}: An Intelligent Real-Time Performance Monitor for " # unix # "{ System V}",
  booktitle    = usenixs89,
  year         = 1989,
  pages        = "277--286",
  address      = bama,
  month        = "12--16 " # jun,
  keywords     = "system management, system analysis, performance, monitoring, ui",
  abstract     = "The Unix Facility for the Observation of Systems, UFOS, is an
    intelligent real-time performance monitor for systems running Unix System
    V.  UFOS monitor system-wide activity and alerts the user to potential
    performance problems, indicating what may be wrong and where to look for
    further information.  UFOS is an interactive system designed to assist with
    the analysis of Unix System V performance.  The system can be customized to
    monitor the performance of a particular machine.", 
}

@InProceedings{adfsiaarp,
  author       = "Ronald~E. Barkley and T.~Paul Lee",
  title        = "{A} Dynamic File System Inode Allocation and Reclaim Policy",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "1--9",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "dynamic storage management, inodes, vnodes, virtual storage,
    file systems, caching",
  abstract     = "In this paper we describe a policy for dynamically allocating
    and reclaiming inodes and present some experimental results obtained on a
    System V prototype.  Traditionally, in-core inodes are allocated from a
    statically reconfigured table, and free slots in this table are reused
    based on a LRU reallocation policy.  With a dynamic policy, inodes are
    allocated on demand and cached after use.  We limit the number of inodes by
    reclaiming them when they no longer have any memory pages associated with
    them.  This policy improves the efficiency of the memory subsystem and,
    thus, improves overall system performance.  Dynamically allocating inodes
    also offers the advantage of automatic tuning; we do not need any special
    understanding of the workload to determine the best number of inodes to
    configure." 
}

@InProceedings{iivpsnfp,
  author       = "Danny Chen, Ronald~E. Barkley, T.~Paul Lee",
  title        = "Insuring Improved {VM} Performance:  Some No-Fault Policies",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "11--22",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "virtual memory, page management, process creation, performance",
  abstract     = "",
  location     = ""
}

@InProceedings{iamdfma,
  author       = "Caswell, Deborah and Black, David",
  title        = "Implementing a {Mach} Debugger for Multithreaded Applications",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "25--39",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "debuggers, multi-threaded programming, unix, system calls",
  abstract     = "Multiple threads of control add new challenges to the task of
    application debugging, and require the development of new debuggers to meet
    these challenges.  This paper describes the design and implementation of
    modifications to an existing debugger (gdb) for debugging multithreaded
    applications under the Mach operating system.  It also describes the
    operating system facilities that support it.  Although certain
    implementation details are specific to Mach, the underlying design
    principles are applicable to other systems that support threads in a Unix
    compatible environment." 
}

@InProceedings{panosd,
  author       = "Paul Maybee",
  title        = "pdb: {A} Network Oriented Symbolic Debugger",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "41--52",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network debugging, portability",
  abstract     = "pdb is a symbolic debugger designed to support program
    debugging needs on a network of workstations.  pdb runs under the X Window
    System, reads object files and symbol tables generated by existing (Sun)
    compilers, debugs both local and remote processes, ad works on multiple
    hardware types.  pdb was constructed using object oriented programming
    techniques to improve its portability to new machine types, languages, and
    symbol table formats.  pdb supports debugging at both the source and
    assembly level.  It is entirely mouse and menu driven, with no command
    language or syntax outside of that required to formulate expressions in the
    source language." 
}

@InProceedings{seast,
  author       = "Robert Bedichek",
  title        = "Some Efficient Architecture Simulation Techniques",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "53--63",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "software simulation, lazy allocation",
  abstract     = "An efficient simulator for the Motorola 88000 at the ISA
    (Instruction Set Architecture) level is described.  By translating
    instructions on the fly to a quick-to-execute form we achieve an average
    ratio of 20 simulator host instructions executed per simulated instruction.
    Lazy allocation of memory allows large memories to be modeled with low
    start-up time.  We describe our experience using the simulator to develop
    workstation software.  The simulator's speed and extensive I/O device
    modeling made it possible for us to interactively debug and test a unix
    kernel and diagnostic software well before the hardware was available.
    Extensions to closely model caches and multiprocessors are sketched.", 
  location     = "http://www.xsim.com/papers/bedichek90some.pdf"
}

@InProceedings{touml,
  author       = "Robert Berkley and Skip Gilbrech and Tim Hunt and Mark Luppi and Richard Plevin",
  title        = "Tickerplants on Unix",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "65--74",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "Software tickerplants have long existed in financial
    environments on mainframes and fault-tolerant machines.  Increasingly they
    are being implemented on Unix local area networks as well.  Briefly
    defined, a tickerplant is a software system that receives data from capital
    markets (stock exchanges, commodity exchanges, money market brokers, etc.)
    and distributes it to a user community in real time.  The community can
    include portfolio managers, brokers, traders, and financial analysts.  In a
    sense, one can vie tickerplants as descendants of the old tickertape
    machines, insofar as they are used to place real-time market data on
    financial user's desks.  The resemblance stops there, however.  A
    tickerplant is a composite entity that can be as complex as a commercial
    RDBMS.  The central component of the tickerplant resides on a network
    server machine, where it fills several roles, including: A communications
    handler that interfaces with one or more high-volume data feeds from
    external capital market sources such as stock exchanges.  A real-time
    database manager that stores current status for all market instruments, as
    well as tick-by-tick history for all market transactions.  (Even on
    high-performance machines, no commercial RDBMS can yet sustain market data
    rates).  An information bus manager that distributes data to end-user
    screens and processes that perform real-time analysis of capital markets
    active.  Tickerplants are central to the operation of many financial
    institutions, including funds managers, brokerages, stock exchanges, and
    commercial, clearing, and investment banks.  This paper discusses the
    tickerplant as a unique product that is appearing in Unix based financial
    application environments, after a long history on mainframes and
    fault-tolerant machines.  We focus on the technical constraints and
    solutions for implementing tickerplants on Unix local area networks, and
    highlight the problems i performance, reliability, and network distribution
    based on out experience in implementing our own tickerplant product."
}

@InProceedings{gxgpnnst,
  author       = "Matt Wilson and John Uhley and Upinder Bhalla and David Bilitch and Mark Nelson and James Bower",
  title        = "{GENESIS} \& {XODUS}, General Purpose Neural Network Simulation Tool",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "75--87",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "x system, neural networks, graphical user interface",
  abstract     = "The GENESIS package was created to provide a platform for the
    rapid development of new neural network simulations with geographical user
    interfaces.  Although targeted for the neural network community, the
    interpretive front-end and object-oriented structures present in the
    GENESIS platform illustrate a powerful technique which may be useful in the
    development and implementation of other interactive graphical
    applications." 
}

@InProceedings{kalaegefm,
  author       = "Tim Thompson",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "89--100",
  address      = wdc,
  month        = "22--26 " # jan,
  title        = "Keynote --- {A} Language and Extensible Graphic Editor for Music",
  keywords     = "dsl, music editing, MIDI, unix, little language",
  abstract     = {Keynote is a programming language for manipulating and
    generating music with MIDI-compatible equipment.  It was designed for and
    in the style of the Unix software system: an application-specific little
    language and interactive shell.  Most obviously used for algorithmic music
    composition, Keynote also serves as a more genera utility for real-time and
    non-real-time MIDI data manipulation.  By adding only a few built-in
    functions to the language, a graphic interface was recently added to
    Keynote.  This built-in graphic interface did not, however, build-in any
    particular user interface.  All of the nested pop-up menus and operations
    of a graphical music editor have been implemented in the Keynote language
    itself.  The result is an extensible tool, similar in spirit to the
    Lisp-based extensiblity of Emacs, and easily modified and enhanced by end
    users.} 
}

@InProceedings{iiathds,
  author       = "Joel~S. Emer and William~E. Weihl",
  title        = "Integrated Interactive Access to Heterogeneous Distributed Services",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "101--115",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "rpc, client-server architecture, configurable tooling,
    mercury, elisp",
  abstract     = "In this paper, we consider how to provide interactive users
    with uniform and integrated access to heterogeneous distributed services.
    Access to distributed services through a single interface has many
    advantages.  One is that it provides the user with an integrated interface
    environment that allows easy interaction between uses of distinct services.
    Another is that it simplifies creation of interfaces to new services by
    obviating the need to create a custom interface for that particular
    service.  As a particular instance of such an interface, we examine the use
    of editors as an interface to distributed services.  To date, the means
    provided within editors for accessing services has been relatively ad-hoc.
    In this paper, we examine the more general technique of using remote
    procedure call as the service access paradigm.  This technique is shown to
    have many advantages including: ease of integration of new services;
    allowing for more powerful services since thy can be written in languages
    and on hardware platforms appropriate to the service; and allowing access
    to remote data and access from multiple cites." 
}

@InProceedings{tusmlasr,
  author       = "Joel~D. Silverstein and Steven~E. Sommars and Yio-Chian Tao",
  title        = "The " # unix # " {System} Math Library, a Status Report",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "117--131",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "floating point operations, accuracy, ulp, math library",
  abstract     = "Changes have been made to the Unix System math library (libm)
    to improve accuracy and to conform to standards.  Several improvements were
    made for C/SVR4, most notably in the trigonometric functions, fmod(x, y),
    lgamma(x), pow(x, y), and erfc(x).  Significant improvements come from use
    of some 4.3BSD functions.  While additional algorithmic work is needed to
    improve accuracy and performance of some functions, a more important task
    is to standardize interfaces including exception handling." 
}

@InProceedings{taecl,
  author       = "John~K. Ousterhout",
  title        = "Tcl:  An Embeddable Command Language",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "133--146",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "command interpreters, tool development, scripting languages,
    ipc, extensibility",
  abstract     = "Tcl is an interpreter for a tool command language.  It
    consists of a library package that is embedded in tools (such as editors,
    debuggers, etc.) as the basic command interpreter.  Tcl provides (a) a
    parser for a simple textual command language, (b) a collection of built-in
    utility commands, and (c) a C interface that tools use to augment the
    built-in commands with tool-specific commands.  Tcl is particularly
    attractive when integrated with the widget library of a window system: it
    increases the programmability of the widgets by providing mechanisms for
    variables, procedures, expressions, etc; it allows users to program both
    the appearance and the actions of widgets; and it offers a simple but
    powerful communication mechanism between interactive programs." 
}

@InProceedings{aebfss,
  author       = "Raymond~B. Essick",
  title        = "An Event-based Fair Share Scheduler",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "147--161",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "scheduling, measurement, analysis",
  abstract     = "The PrismaOS scheduler is an event-driven scheduler with fair
    share features.  We implemented this scheduler to replace the standard
    SunOS scheduler for the Prisma P1 system, which is expected to accommodate
    thousands of processes.  Our goals and reasons for implementing a new
    scheduler in PrismaOS instead of using the standard SunOS scheduler
    included: improved interactive responsiveness, scaling to support thousands
    of processes efficiently, and fair share scheduling.  This paper describes
    the PrismaOS scheduler, a modification of the ESCHED scheduler.  It briefly
    covers the changes made to the basic ESCHED algorithms and then details the
    implementation of a far share scheduler on the ESCHED base.  The fair share
    discussion describes our early implementation and the tuning steps we went
    through to produce our final fair share scheduler for PrismaOS.  The new
    scheduler, in its various forms, has been running in production on
    approximately one dozen machines at Prisma since November 1988." 
}

@InProceedings{psampi,
  author       = "Arun Garg",
  title        = "Parallel {STREAMS}: a Multi-Processor Implementation",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "163--176",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "streams, i/o subsystems, multiprocessors, parallelism",
  abstract     = "This paper describes Parallel STREAMS, a multiprocessor
    implementation of STREAMS that has been developed at Sequent.  Parallel
    STREAMS is a key architectural component of the character I/O subsystem of
    the operating system.  Some of the important design issues are discussed.
    Parallelism in the STREAMS context is explored and the design of a parallel
    STREAMS scheduler is described.  Some of the utilities and guidelines that
    were added in Parallel STREAMS because of the multiprocessor environment
    are also described.  This paper assumes basic knowledge of STREAMS,
    although relevant aspects have been summarized briefly in an overview
    section." 
}

@InProceedings{ibsisvr4,
  author       = "Ian Vessey and Glenn Skinner",
  title        = "Implementing {Berkeley} {Sockets} in {System} {V} {Release} 4",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "177--193",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "sockets, streams, protocol apis",
  abstract     = "A major goal of the UNIX System V, Release 4 (SVR4)
    development effort has been to unify divergent lines of UNIX development
    into a single system offering the best features of its progenitors.  A
    closely related goal has been to augment the programming interface to
    capture applications written for other UNIX variants, by making the
    facilities they depend on available in the unified system.  The socket
    interface is a cornerstone of the 4BSD networking facilities, so its
    presence in SVR4 is an absolute necessity for application capture.  This
    paper describes the design of the SVR4 socket implementation, the
    implementation problems we encountered, and their solutions." 
}

@InProceedings{tnmt,
  author       = "Allan Leinwand and Jeff Okamoto",
  title        = "Two Network Management Tools",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "195--205",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network management, gui"
}

@InProceedings{tcotnnb,
  author       = "Steven~A. Heimlich",
  title        = "Traffic Characterization of the {NSFNET} National Backbone",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "207--227",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network traffic, traffic analysis, packet trains, network
    models, token rings",
  abstract     = {Traditionally, models of packet arrival in communication
    networks have assumed either Poisson or compound Poisson arrival patterns.
    A study of a token ring local area network (LAN) at MIT [5] found that
    packet arrival followed neither of these models.  Instead, traffic followed
    a more general model dubbed the "packet train" which describes network
    traffic as a collection of packet streams traveling between node pairs.  A
    packet train consists of a number of packets traveling between a particular
    node pair.  This study examines the existence of packet trains on NSFNET, a
    high speed national backbone network.  Train characteristics on NSFNET are
    not as striking as those found on the MIT local network; however, certain
    protocols exhibit quite strong train behavior given the great number of
    hosts communicating through the backbone.},
  location     = "https://doi.org/10.1145/98457.98774"
}

@InProceedings{pndavn,
  author       = "Steven~M. Bellovin",
  title        = "Pseudo-Network Drivers and Virtual Networks",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "229--244",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "network drivers, tcp/ip, sockets, streams, pseudo-drivers",
  abstract     = "Many operating systems have long had pseudo-teletypes,
    inter-process communication channels that provide terminal semantics on one
    end, and a smart server program on the other.  We describe an analogous
    concept, pseudo-network drivers.  One end of the driver appears to be a
    real network device, with the appropriate interface and semantics; data
    written to it goes to a program, however, rather than to a physical medium.
    Using this and some auxiliary mechanisms, we present a variety of
    applications, including system test, network monitoring, dial-up TCP/IP,
    and ways to both improve and subvert network security.  Most notably, we
    show how pseudo-network devices can be used to create virtual networks and
    to provide encrypted communications capability.  We describe two
    implementations, one using a conventional driver for socket-based systems,
    and one using stream pipes for System V.", 
  location     = "https://www.cs.columbia.edu/~smb/papers/pnet.ext.ps"
}

@InProceedings{sauie,
  author       = "Len Bass and Brian Clapper and Erik Hardy and Rick Kazman and Robert Seacord",
  title        = "Serpent:  {A} User Interface Environment",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "245--258",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "user-interface management systems, separation of concerns",
  abstract     = "Prototyping has been shown to simplify system specification
    and implementation, especially in the area of user interfaces.  Previous
    prototyping approaches do not allow for the evolution of the prototype into
    a production system and do not support maintenance after a system is put
    into use.  A set of goals for a modern user interface environment is
    presented.  Serpent, a prototype implementation which achieves these goals,
    is presented and is shown to have several advantages over other approaches
    to user interface development." 
}

@InProceedings{poouwmams,
  author       = "Masami Hagiya and Kouji Ohtani",
  title        = "Parallel Object-Oriented {UIMS} with Macro and Micro Stubs",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "259--274",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "uims, parallel object-oriented language",
  abstract     = "This paper describes a user-interface management system
    (UIMS) based on a parallel object-oriented model that supports a stub
    generator for connecting the user-interface part of an application running
    in side the UIMS and the application body implementing application-specific
    functions.  The parallel object-oriented model is implemented by a virtual
    machine in the window server, which lets user-interface code run in the
    server.  The UIMS supports two kinds of stub: macro and micro.  With a
    macro stub, an entire Unix process behaves as a parallel object in the UIMS
    parallel object-oriented model, while with a micro stub, each object
    implemented inside a Unix process corresponds to a parallel object in the
    model." 
}

@InProceedings{mastpdropcaw,
  author       = "Stephen~A. Uhler",
  title        = "{\sc Mtx} --- {A} Shell that Permits Dynamic Rearrangement of Process Connections and Windows",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "275--283",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "graphical shell, remote execution, inter-process communication",
  abstract     = "Mtx is a Unix shell, implemented as a single user process,
    with an expanded notion of pipes and i/o redirection.  Mtx supports
    creating and maintaining processes, connecting their inputs and outputs in 
    an arbitrary directed graph.  Each process can have as many windows or
    virtual terminals as required for user interaction.  Through a control
    window Mtx can dynamically manipulate the connections among ongoing
    processes.  In addition, Mtx can rendezvous and connect to Mtx servers on
    remote hosts, conveniently providing pipe connections across a network of
    computer.  This paper describes the use and implementation of Mtx on a
    network of Unix workstations." 
}

@InProceedings{uuaocoaldkfmfs,
  author       = "David Hitz and Guy Harris and James~K. Lau and and Allan~M. Schwartz",
  title        = "Using " # unix # " as One Component of a Lightweight Distributed Kernel for Multiprocessor File Servers",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "285--296",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "coprocessors, light-weight kernels, nfs",
  abstract     = "Auspex builds fast NFS file servers designed to satisfy the
    I/O demands of large networks and high-performance workstations.  The
    architecture handles NFS operations quickly and efficiently by completely
    eliminating Unix from the normal path of NFS service.  We designed a
    message passing kernel that allows a slightly modified Unix kernel to
    execute as a peer processor with Ethernet processors, filesystem
    processors, and disk storage processors.  These non-Unix processors respond
    efficiently to NFS requests and perform IP packet routing.  A separate host
    processor running SunOS4.0 provides full Unix compatibility by servicing
    less time critical and less frequent requests such as Yellow Pages.  Our
    message passing kernel is small (15 kbytes of object) and fast (10,000
    messages per second into a Motorola 68020) and provides source code
    debugging for all processors." 
}

@InProceedings{ahpmbvf,
  author       = "Alan Langerman and Joseph Boykin and Susan LoVerso and Shashi Mangalat",
  title        = "{A} Highly-Parallelized {Mach}-based Vnode Filesystem",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "297--312",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "mach, parallelism, concurrency control, nfs, file systems,
    multiprocessor operating systems, encore computers, performance, portability",
  abstract     = "This paper describes the parallelization of a vnode-based
    filesystem layered on the Mach operating system.  Encore parallelized
    portions of the Mach operating system's 4.3BSD compatibility code to
    increase performance.  Subsequently, Carnegie-Mellon University released a
    version of Mach with substantial modifications to the filesystem to provide
    NSF functionality.  Using the framework left in place from our original
    parallelization effort, we migrated to the new vnode filesystem code by
    modifying our original locking policies to accommodate the new filesystem
    organization.  Based upon performance analysis of our original version, the
    opportunity was also taken to revise the old locking policies to provide
    substantially increased parallelism.  Details of the new locking policies
    and performance analyses are provided.", 
  location     = "ftp://ftp.tuhs.org.ua/Documentation/AUUGN/AUUGN-V10.6.pdf"
}

@InProceedings{pffap,
  author       = "Steven~C. Johnson",
  title        = "Postloading for Fun and Profit",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "325--330",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "system tools, optimization, instrumenting",
  abstract     = "Postload processing, or postloading, is a technique of
    optimizing (or otherwise processing) an executable program after it has
    been linked with ld.  The executable program is read, altered, and
    rewritten with optimizations or other added features.  Postloading, to be
    done reliably, needs changes to the a.out format that increases its size by
    a few percent.  We have found over a dozen significant uses for
    postloading, including optimization, hardware workarounds, profiling and
    execution counting, simulation, 'code critics' (programs that examine, and
    repair, common compiler and assembly code problems), and migration to new
    hardware releases.", 
  location     = "https://www.cs.tufts.edu/comp/150FP/archive/stephen-johnson/postloading.pdf"
}

@InProceedings{dsrms,
  author       = "Margo Seltzer and Peter Chen and John Ousterhout",
  title        = "Disk Scheduling Revisited",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "313--324",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "optimization, disk arm scheduling, storage size, performance",
  abstract     = "Since the invention of the movable head disk, people have
    improved I/O performance by intelligent scheduling of disk accesses.  We
    have applied these techniques to systems with large memories and
    potentially long disk queues.  By viewing the entire buffer cache as a
    write buffer, we can improve disk bandwidth utilization by applying some
    traditional disk scheduling techniques.  We have analyzed these techniques,
    which attempt to optimize head movement and guarantee fairness in response
    time, in the presence of long disk queues.  We then propose two algorithms
    which take rotational latency into account, achieving disk bandwidth
    utilizations of nearly four times a simple first come first serve
    algorithm.  One of these two algorithms, a weighted shortest total time
    first, is particularly applicable to a file server environment because it
    guarantees that all requests get to disk within a specified time window.", 
  location     = "https://web.eecs.umich.edu/~pmchen/papers/seltzer90.pdf"
}

@InProceedings{mssr,
  author       = "Dodi Francisco and Lois~C. Price",
  title        = "Multiple Site Source Reconciliation",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "331--340",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "rcs, software management",
  abstract     = "This paper describes the generic methodology developed at TRW
    Financial Systems to control the integration of source modifications made
    at multiple sites into a single master source which is the basis for a new
    release.  The Multiple Site Source Reconciliation methodology has provided
    confidence that changes made between releases are not lost.  the
    methodology minimizes the manual effort required by configuration
    management engineers and development engineers.  Multiple Site Source
    Reconciliation has successfully supported several large projects." 
}

@InProceedings{aabus,
  author       = "Mitchell Gart",
  title        = "Ada and Binary " # unix # " Standards",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "353--361",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "portability, standards"
}

@InProceedings{cipsd,
  author       = "Brian Berliner",
  title        = "{CVS} {II}:  Parallelizing Software Development",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "341--352",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "source code control, configuration management",
  abstract     = "The program described in this paper fills a need in the UNIX
    community for a freely available tool to manage software revision and
    release control in a multi-developer,multi-directory,multi-group
    environment.  This tool also addresses the increasing need for tracking
    third-party vendor source distributions while trying to maintain local
    modifications to earlier releases."
}

@InProceedings{tptaep,
  author       = "Martha R. Szczur and Karl~R. Wolf",
  title        = "{TAE Plus: Transportable Applications Environment Plus}",
  booktitle    = usenixw90,
  year         = 1990,
  pages        = "363--374",
  address      = wdc,
  month        = "22--26 " # jan,
  keywords     = "ui development, portability",
  abstract     = "The Transportable Applications Environment Plus (TAE Plus) is
    a NASA-developed user interface development environment (UIDE) for the
    rapid prototyping, evaluation, implementation, and management of user
    interfaces.  TAE Plus provides an intuitive What You See Is What You Get
    (WYSIWYG) WorkBench for designing an application's user interface.  The
    WorkBench supports the creation and sequencing of displays, including
    real-time, data-driven display objects.  Users can define context-sensitive
    help for a target application.  They can rehearse the user interface and
    also generate code automatically.  In addition TAE Plus contains
    application services for the runtime manipulation and management of the
    user interface.  Based on Motif and the MIT X Window System, TAE Plus runs
    on a variety of Unix- or VMS-based workstations.  TAE Plus is an evolving
    system.  User-defined requirements and new technology guide the development
    of each new version.  Advances in virtual operating systems, human factors,
    computer graphics, command language design, standardization, and software
    portability are monitored and incorporated as they become available." 
}

@InProceedings{ewpbm,
  author       = "Bruce Martin and Charles Bergan and Walter Burkhard and Jehan-Fran{\c c}ois P{\^ a}ris",
  title        = "Experience with {PARPC}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "1--12",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "remote procedure calls, distributed system support, ipc,
    heterogeneous network systems",
  abstract     = "PARPC provides an interprocess communication mechanism based
    on the semantics of a procedure call.  PARPC programs always execute a
    single logical thread of control but may execute multiple physical threads
    of control.  PARPC provides users with a well defined, high level network
    process model of execution and a familiar program development model
    supporting heterogeneous non-uniform environments.  The administrative
    overhead of PARPC is minimal because users administer their own distributed
    programs and existing Unix mechanisms for access control and resource
    accounting are utilized.  Our experiences indicate that PARPC has been an
    effective system for the development and administration of distributed
    programs." 
}

@InProceedings{dslallpfrliase,
  author       = "Peter Gloor and Rudolf Marty",
  title        = "{Dynamically Synchronized Locking} --- A Lightweight Locking Protocol for Resource Locking in a Stateless Environment",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "13--27",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "file locking, network file systems, stateless servers,
    distributed locking protocol",
  abstract     = "File and record locking is one of the dominant problems for a
    stateless file server.  By definition, a stateless server does not maintain
    any information about its clients.  Therefore, it is not allowed to lock
    any resources for them by storing lock information on behalf of its
    clients.  This is the reason why file systems with locking capabilities are
    frequently implemented following the stateful approach.  We introduce a new
    locking method for resource locking in a stateless environment.  Our method
    combines the advantages of the stateless server (easy crash recovery) with
    the advantages of the stateful server (easy locking) without relinquishing
    the statelessness of the server.  DSL can be used to implement exclusive
    (e.g.  read/write) or shared (e.g.  read only) locks.  The algorithm we
    propose (called Dynamically Synchronized Locking, DSL) can be used e.g.  to
    implement locking facilities in a network of workstations loosely coupled
    by a high speed LAN.  It will be exemplified by the implementation of a
    lock library function for a distributed system which is comparable to the
    Unix lockf() system call." 
}

@InProceedings{iutsiados,
  author       = "Geoffrey~M. Lee",
  title        = "Integrating " # unix # " Terminal Services Into a Distributed Operating System",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "29--42",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "distributed operating systems, guest operating systems,
    capabilities, terminal services, inter-process communication, pseudo-ttys",
  abstract     = "One solution to the problem of integrating the terminal
    services of a UNIX host into a distributed operating system is to implement
    the distributed operating system as a guest layer in UNIX and then to add a
    software interface that runs on the host and translates between the
    terminal services of the host and the distributed operating system.  Such
    an interface was implemented at the Lawrence Livermore National Laboratory.
    Design issues and decisions that preceded software development are
    discussed, followed by details of software operation.  Development
    experiences that would be applicable to a similar effort are described.", 
  location     = "https://www.osti.gov/biblio/6812283-integrating-unix-terminal-services-distributed-operating-system"
}

@InProceedings{tabctl,
  author       = "Brent Callaghan and Tom Lyon",
  title        = "The {Automounter}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "43--51",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "network file system, local filesystems, unix pathname, remote
    file server, local file, automatic mounting, network software environment,
    automount map, mount hierarchy, yellow page domain", 
  abstract     = "This paper describes the automounter -- an automatic
    filesystem mounting service distributed with Sun Microsystems version of
    the Unix operating system (SunOs).  The automounter detects access to
    remote filesystems and mounts them on demand.  This action is transparent
    to users and programs.  Automounted filesystems are automatically unmounted
    after a period of inactivity.  The map files that control the automounter
    can specify multiple locations for filesystems replicated across a network
    and can describe mount hierarchies.  Automount maps can be administered on
    a single machine through local files or across a Yellow Pages domain." 
}

@InProceedings{itpacoans,
  author       = "Chet Juszczak",
  title        = "Improving the Performance and Correctness of an {NFS} Server",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "53--63",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "nfs performance, server-side caching, soft state, stateless
    protocols, impotency", 
  abstract     = "The Network File System (NFS) uses a stateless clients-server 
    protocol.  The major advantage of statelessness is simple crash recovery:
    an NFS client repeatedly sends a request until it gets a response from the
    server.  However, the client retry model has disadvantages: a server can
    receive a request many times.  Processing duplicate requests requires
    server effort better spent elsewhere.  Worse, duplicate requests can cause
    incorrect results.  This paper describes a work avoidance technique using a
    server cache to avoid processing duplicate client requests.  An
    implementation of this technique has resulted in a significant increase in
    server bandwidth.  A beneficial side effect is that it can help avoid the
    destructive re-application of non-idempotent operations.  It can be used in
    any NFS server implementation, requires no client modifications, and in no
    way violates the NFS crash recover design." 
}

@InProceedings{miaramubmsswarashfms,
  author       = "Robert~L. Henderson and Alan Poston",
  title        = "{MSS}-{II} and {RASH}: {A} Mainframe " # unix # " Based Mass Storage System with a Rapid Access Storage Hierarchy File Management System",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "65--84",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "mass storage systems, disk striping, raid",
  abstract     = "Unix on a large mainframe can provide hundreds of gigabytes
    of disk space.  However, in a computer center with several super-computers,
    even that is not sufficient to support the user community.  To support the
    users of the Numerical Aerodynamic Simulation facility, a national resource
    center, work is under way to develop a Unix based Mass Storage System which
    will support files on disk and multiple levels of removable media.
    Included in the Mass Storage System are a number of features to improve
    performance of the file and networking systems and new features for file
    hierarchy and volume management.  This paper will address the storage
    hierarchy manager and the striping file systems.  The high performance file
    system is a striped reliable file system that is optimized for large file
    sequential access without penalizing random access.  Unlike prior archival
    or migration systems which block the completion of the open system call
    until all of the data has been restored to disk; the rapid access archive
    and restore system provides for fast access to the data.  The open call is
    not blocked.  Instead, read or write access is blocked only when the data
    being accessed has not yet been restored to disk." 
}

@InProceedings{maotduk,
  author       = "Michael~H. Kelley",
  title        = "Multiprocessor Aspects of the {DG}/{UX} Kernel",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "85--99",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "multiprocessor operating system, symmetric multiprocessors,
    process scheduling, virtual processors, synchronization locks, I-O
    management, interrupt handling, virtual storage",
  abstract     = "This paper describes the multiprocessor aspects of the DG/UX
    4.00 kernel, a symmetric multiprocessor Unix kernel that runs on a Data
    General MV/family computers.  In revision 4.00, the DG/UX kernel has been
    completely rewritten to support multiprocessor hardware in a fully
    symmetric fashion and to provide a number of other functional and
    reliability enhancements.  The paper focuses on process management, device
    I-O, and virtual memory management because these ares of the kernel have
    specific multiprocessor components.  A virtual processor model is presented
    as a method of achieving multiprocessor operation while hiding the actual
    number of physical processors from the rest of the kernel.  The application
    of this model to process synchronization and scheduling is discussed in
    detail.  Multiprocessor device I-O issues are discussed next and a flexible
    device driver paradigm is sketched.  Finally, multiprocessor issues in
    virtual memory management are presented with the solutions used in the new
    DG/UX kernel." 
}

@InProceedings{maimu,
  author       = "Barak, Amnon and Wheeler, Richard",
  title        = "{MOSIX}:  An Integrated Multiprocessor " # unix,
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "101--112",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "distributed operating system, process migration, process
    scheduling", 
  abstract     = "MOSIX is a general-purpose Multicomputer Operating System
    with Integrates a cluster of loosely connected, independent computers
    (nodes) into a single-machine UNIX environment.  The main properties of
    MOSIX are its high degree of integration and the possibility of scaling the
    configuration to a large number of nodes.  Developed originally for a
    network of uniprocessor nodes, it has recently been enhanced to support
    nodes with multiple processors.  In this paper we present the hardware
    architecture of this multiprocessor workstation and the software
    architecture of the MOSIX kernel.  We then describe the main enhancements
    made in the multiple-processor version and give some performance
    measurements of the internal mechanisms of the system." 
}

@InProceedings{pa3detxw,
  author       = "Spencer~W. Thomas and Martin Friedmann",
  title        = "{PEX} --- {A} 3-{D} Extension to {X Windows}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "139--149",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "pex, x windows, extensions, 3-d graphics, color-table
    management, shading",
  abstract     = "PEX (PHIGS Extension to X) is a proposed 3-D extension to
    Version 11 of the X Windowing System.  It is intended to support the PHIGS
    and PHIGS+ graphics standards.  During the summer of 1988, a demonstration
    implementation of PEX was produced and shown at the SIGGRAPH '88 vendor
    exhibition.  The implementation is described, illustrating solutions to
    some problems induced by interoperability and portability requirements, and
    by the extreme potential variability in the data presented by the client
    program.  The demonstration was successful, and the results are available
    on the X V11R3 release tape." 
}

@InProceedings{vx11c,
  author       = "Lemke, David and Rosenthal, David S.~H.",
  title        = "Visualizing {X11} Clients",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "125--138",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "x windows, visuals, graphics pipeline, portability, displays,
    color-table management, color models",
  abstract     = "The X Window System version 11 color model exposes a number
    of aspects of the underlying display.  The concepts it uses to represent
    these device-dependencies is the Visual; there may be several Visuals
    available on a given display.  We present example programs to illustrate the
    techniques required if an X client is to operate correctly across the entire
    range of possible combinations of Visuals." 
}

@InProceedings{salltfasuiamuk,
  author       = "Joseph~A. Korty",
  title        = "Sema: {A} Lint-like Tool for Analyzing Semaphore Usage in a Multithreaded " # UNIX # " Kernel",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "113--123",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "semaphores, deadlock prevention, static analysis, concurrency
    control, call graphs",
  abstract     = "Sema is a tool that examines the use of semaphores in the
    source of a tightly coupled, multiprocessing Unix kernel.  It provides a
    window into the use of semaphores in general, and into cycles (potential
    deadlocks) between semaphores in particular.  This tool also ranks the
    semaphores so that new code can be added to a kernel in a deadlock free
    fashion.  This tools is not guaranteed to find all cycles.  It can also
    report cycles where none exist.  However, our experience at MODCOMP with
    the 3DU2 kernel shows that both the kernel source and this tool can be
    tuned to improve the accuracy of the tool.  The method of tuning is similar
    in spirit and practice to what is needed to make a program successfully
    pass lint." 
}

@InProceedings{xavtfpbws,
  author       = "Marc~J. Rochkind",
  title        = "{XVT}:  {A} Virtual Toolkit for Portability Between Window Systems",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "151--163",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "window systems, graphical toolkits, portability, x windows,
    macintosh systems",
  abstract     = "The Extensible Virtual Toolkit (XVT) is a high-level
    interface that allows graphical, interactive applications to be easily
    ported to various window systems, such as X-11, MS-Windows, OS/2
    Presentation Manager, and the Macintosh.  Behind the common interface there
    is a separate implementation in the form of a C object library for each
    host system.  This paper describes the design principles behind XVT and its
    key programming features.  It then reviews the main problems in creating an
    implementation for X and explains our short-term solutions.  Also discussed
    are plans for more thorough long-term solutions using industry-standard
    toolkits." 
}

@InProceedings{vaouss,
  author       = "Tom Duff",
  title        = "Viral Attacks on " # unix # " System Security",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "165--171",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "virus, shell, unix, networking",
  abstract     = "Executable files in the Ninth Edition of the Unix system
    contain small amounts of unused space, allowing small code sequences to be
    added to them without noticeably affecting their functionality.  A program
    fragment that looks for binaries and introduces copies of itself into their
    slack space will transitively spread like a virus.  Such a virus program
    could, like the Trojan Horse, harbor Greeks set to attack the system when
    run by sufficiently privileged users or from infected set-userid programs.
    The author wrote such a program (without the Greeks) and ran several
    informal experiments to test its characteristics.  In one experiment, the
    code was planted on one of Center 1127's computers and spread in a few days
    through the Datakit network to about forty machines.  The virus escaped
    during this test onto a machine running an experimental secure Unix system,
    with interesting (and frustrating for the system's developers)
    consequences.  Viruses of this sort must be tiny to fit in the small amount
    of space available, and consequently are very timid.  There are ways to
    construct similar viruses that are not space-constrained and can therefore
    spread more aggressively and harbor better-armed Greeks.  As an example, we
    exhibit a frightenly virulent portable virus that inhabits shell scripts.
    Viruses rely on users and system administrators being insufficiently
    vigilant to prevent them from infiltrating systems.  I outline a number of
    steps that people ought to make infiltration less likely.  Numerous recent
    papers have suggested modifications to the nix system kernel to interdict
    viral attacks.  Most of these are based on the notion of 'discretionary
    access controls.' These proposals cannot usually be made to work, either
    because they make unacceptable changes in the 'look and feel' of the Unix
    system's environment or they entail placing trust in code that is
    inherently untrustworthy.  In reply to these proposals, I suggest a small
    change to the Unix system permission scheme that may be able to effectively
    interdict viral attacks without serious effect on the Unix system's
    functioning and habitability.", 
  location     = "HTTP://plan9.bell-labs.com/who/dmr/tdvirus.pdf"
}

@InProceedings{afffbu,
  author       = "Eric Jon Bina and Perry~A Emrath",
  title        = "{A} Faster {\it fsck\/} for {BSD} " # unix,
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "173--185",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "fsck, disk performance, crash recovery",
  abstract     = "In the UNIX operating system, the kernel assumes that the
    file system is always maintained in known correct state.  Should the kernel
    ever detect a variation from that state, a system panic occurs, and the
    system 'crashes'.  For this reason it is important that the integrity of
    the file system be checked before bringing any UNIX system up in multi-user
    mode.  A file system check program called fsck is supplied with UNIX
    (unless otherwise specified UNIX refers to the BSD version family), and is
    designed to find any errors in the state of the file system and fix them,
    if possible, to prevent system panics.  Unfortunately, on a system with a
    relatively large amount of mounted disk storage, the time it takes to run
    fsck can become a very significant percentage of system boot time.  When
    working in a system development environment where the system will probably
    have to be booted frequently, the (highly desirable) use of fsck can begin
    to waste valuable work time.  In an attempt to solve this problem, fsck was
    studied in detail, and then modified to perform its tasks more efficiently.
    This paper first describes the function of the original fsck program to
    convey the basic goals it sets out to accomplish.  The next section points
    out inefficiencies that were found in the original algorithms, and
    describes how these inefficiencies were alleviated.  A number of timing
    measurements were taken to locate the original problems, and then later to
    show that the modifications did provide significant improvement.  Our new
    fsck was tested to ensure it retained all the diagnostic and corrective
    capabilities of the original.  It was also ported to a different machine to
    demonstrate its general usefulness in any BSD based UNIX environment.
    Compared to the version of fsck distributed with BSD 4.2 or 4.3, our fsck
    consistently runs 2 to 3 times faster, and reboot times (with file system
    checks) have been cut almost in half.  Real time measurements for our fsck
    on the three machines where it has been installed are given in the
    concluding section." 
}

@InProceedings{lotnoedp,
  author       = "Tim Bray",
  title        = "Lessons of the {New Oxford English Dictionary Project}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "187--199",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "text processing, unix, string searching",
  abstract     = "The Oxford English Dictionary is a cultural monument and one
    of the great achievements of human scholarship.  The computerization
    efforts at the University of Waterloo are just another chapter in this
    130-year continuing effort.  The work at Waterloo has resulted in several
    important achievements, including a general purpose system for transduction
    of text based on regular grammars, a flexible system for text search that
    may be the fastest existing today, an entirely new model for text
    databases, and an original user interface architecture.  Implementations of
    these ideas are now in use at several sites, and are playing an important
    role in the continuing work on the OED.  Also we have learned some valuable
    lessons about text management, user interfaces, and in particular the
    application of Unix to these problems." 
}

@InProceedings{ioduifus,
  author       = "Leo Lanzillo and Craig Partridge",
  title        = "Implementation of Dial-Up {IP} for " # unix # " Systems",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "201--207",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "ip, internet, dial-up, modems",
  abstract     = "CSNET has developed a software package to support the sending
    of Internet Protocol (IP) datagrams over dial-up phone lines.  This driver
    can automatically establish and disconnect phone calls as IP traffic
    dictates.  This code works in binary-only BSD systems." 
}

@InProceedings{lfitpotssta,
  author       = "Allison Mankin and Kevin Thompson",
  title        = "Limiting Factors in the Performance of the Slow-Start {TCP} Algorithm",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "219--228",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "slow-start, congestion control, router buffers, queueing,
    network performance, performance measurement, tcp",
  abstract     = "Jacobson and Karel's Slow-start TCP offers an effective
    approach to Internet congestion control.  Limiting factors for the
    Slow-start algorithms were explored y measuring the performance of the
    Berkeley 4.3+ Slow-start implementation in the presence of increasing
    gateway load.  Two network performance measurement tools, captures and
    NETMON/iptrace, were developed for this purpose, and are available in
    source-code from the authors.  The measurements of Slow-start TCP
    illustrate both the adaptive range of the algorithms, and also some
    limitations of the Slow-start technique of estimating gateway congestion." 
}

@InProceedings{tsms,
  author       = "Alessandro Forin and Joseph~S. Barrera and Richard Sanzi",
  title        = "The Shared Memory Server",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "229--243",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "storage management, user-space servers, distributed shared
    storage, ipc, heterogeneous systems, parallel performance",
  abstract     = "This paper describes the design and performance evaluation of
    a virtual shared memory server for the Mach operating system, providing an
    extension to Unix to support distributed shared memory.  In this respect,
    it subsumes standard facilities like the Unix system v shared memory
    facility.  The server runs in user-mode and provides sharing of read/write
    memory between processes, regardless of their machine location.  A number
    of memory coherency algorithms have been implemented and evaluated,
    including a new distributed algorithm that is shown to outperform
    centralized ones.  Some of the novel features of the server include support
    for machines with multiple pages sizes and for heterogeneous processors.
    Performance measurements of the server and some applications are presented,
    and the intrinsic costs evaluated." 
}

@InProceedings{auiotsnmp,
  author       = "Wengyik Yeong and Martin Lee Schoffstall and Mark~S. Fedor",
  title        = "{A} " # unix # " Implementation of the {Simple Network Management Protocol}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "209--217",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "snmp, asn.1, standards, network management, management
    information bases",
  abstract     = "The many choices in network products available today from a
    diversity of vendors clearly indicates the need for a single,
    non-proprietary solution to the problem of managing all the entries in the
    existing TCP/IP Internet.  The Simple Network Management Protocol (SNMP) is
    a solution to the network management needs of Local Area Networks, as well
    as the greater Internet.  This paper describes the design and
    implementation of software conforming to the SNMP for computer systems
    running Berkeley 4.2/4.3 and related operating systems.  The implementation
    described herein includes all software necessary for the management of
    machines running such operating systems: a network management station for
    Unix, and an SNMP agent (server) intended to run on similar systems." 
}

@InProceedings{scmwaood,
  author       = "Eric Black",
  title        = "Software Configuration Management with an Object-Oriented Database",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "257--272",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "configuration management, software development, configuration
    control, object-oriented databases, software backplane, type hierarchies,
    inheritance",
  abstract     = "Popular tools for software configuration management on Unix
    and VMS such as SCCS, RCS, and CMS do not adequately provide for the
    management and control of large software configurations, nor for
    cooperative development among large numbers of programmers.  Problems
    include awkward maintenance of multiple configurations, difficult
    enforcement of locally-imposed workflow rules, inability to coordinate and
    predict the impact of changes, and inconsistent follow-through on bug
    reports and change requests.  These problems only increase with the
    introduction of more development tools such as structured
    analysis/structured design aids, documentation generators, publishing
    tools, requirements tracking tools, language compilers, analyzers and
    debuggers, each with its own input and output data which must be managed.
    An object-oriented database can be used profitably to solve these
    deficiencies.  This paper describes the configuration management features
    of Software BackPlane, an Integrated Project Support Environment (IPSE).
    Examples of the problems which motivated the object-oriented configuration
    management model of Software BackPlane are given, showing how they are
    solved by that model, along with representative usage scenarios." 
}

@InProceedings{mpmciu,
  author       = "Mark~C. Holderbaugh and Scott~E. Preece",
  title        = "Minimalist Physical Memory Control in " # unix,
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "245--256",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "storage management, system-call interfaces, storage mapping",
  abstract     = "Computer systems often include areas of memory with special
    characteristics.  Memory-mapped devices, memory boards with differing
    access times, and inter-system shared memory are typical examples.  An
    operating system needs to provide (1) a mechanism for described to the
    system the special characteristics of its memory, (2) internal mechanisms
    for using and managing the user of memory, and (3) external mechanisms
    allowing applications to use special kinds of memory.  The Unix operating
    system does not provide such mechanisms; it assumes memory is a vector of
    homogeneous storage locations.  This paper describes extensions made to a
    Unix system to provide the facilitates described above through minimal
    changes to existing mechanisms inside the kernel and at the application
    interface.  The kernel maintains two new abstractions of memory objects: an
    extend is an area f physical memory with special properties defined by the
    hardware configuration; a region is an area within a specified extent,
    available to applications which need the special properties of the extent.
    The system configuration mechanism has been extended to provide a
    vocabulary for describing memory extents and their special characteristics.
    Regions may be defined either at system configuration time or dynamically
    and, depending on the definition of the containing extent, will be
    allocated wither as a contiguous area of memory or as a group of individual
    pages.  They are made available to applications as System V shared-memory
    objects which processes may map into their address spaces.  This paper
    includes a discussion of the needs of specific types of applications that
    deal with physical memory an description of the user interface, and an
    overview of the implementation." 
}

@InProceedings{soiacos,
  author       = "Prasun Dewan",
  title        = "Supporting Objects in a Conventional Operating System",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "273--285",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "object-oriented support, persistence",
  abstract     = "A simple approach is presented for introducing objects in a
    conventional operating system.  Objects are created as combinations of
    conventional processes and files.  Like processes, they are active agents
    capable of executing code and communicating with other objects.  Like
    files, they are persistent, have a protected name in the file system, and
    can be opened and closed for access.  Motivation for supporting objects in
    a conventional system is presented.  The basic elements of our approach are
    described together with the rationale for our decisions.  An implementation
    on Unix is discussed.  Object-based programming at the system level is
    contrasted with object-based programming at the language level and
    comparisons are made between our approach and related work.", 
  location     = "https://docs.lib.purdue.edu/cstech/654/"
}

@InProceedings{atotw,
  author       = "Donn Seeley",
  title        = "{A} Tour of the Worm",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "287--304",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "morris worm, buffer overflows, networking, security",
  abstract     = "On the evening of November 2, 1988, a self-replicating
    program was released upon the Internet (1) This program (a worm) invaded
    VAX and Sun-3 computers running versions of Berkeley UNIX, and used their
    resources to attack still more computers (2).  Within the space of hours
    this program had spread across the U.S., infecting hundreds or thousands of
    computers and making many of them unusable due to the burden of its
    activity.  This paper provides a chronology for the outbreak and presents a
    detailed description of the internals of the worm, based on a C version
    produced by decompiling." ,
  location     = "https://collections.lib.utah.edu/details?id=702918"
}

@InProceedings{acocuoisa,
  author       = "Daniel~V. Klein",
  title        = "{A} Comparison of Compiler Utilization of Instruction Set Architectures",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "313--329",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "risc, cisc, code generation",
  abstract     = "This paper compares the utilization of a number of different
    computer instruction sets by a collection of compilers.  Wherever possible,
    several compilers were used for each architecture.  this paper demonstrates
    that CISC instruction sets are underutilized by compilers, while RISC
    instruction sets are nearly completely utilized.  We observe that if an
    instruction exists on a computer, it should be usable by the compilers for
    that computer.  Because CISC computers have large numbers of instruction
    which are not effectively used by compilers, the instructions are
    superfluous.  By eliminating superfluous and redundant instructions from
    architectures, future systems can run more efficiently, and algorithms can
    be executed with greater celerity." 
}

@InProceedings{smoeacbi,
  author       = "Eugene~H. Spafford",
  title        = "Some Musings on Ethics and Computer Break-Ins",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "305--311",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "ethics, kant, security, black-hat hacking",
  abstract     = "In November and December, the computing community experienced
    the release of the Internet Worm, computer break-ins at Lawrence Livermore
    National Labs, and the temporary disconnection of the Milnet because of
    computer break-ins on a machine belonging to the Mitre Corporation.  These
    incidents have led to many discussions about responsibility and ethics.
    Many of these discussions, particularly in forums such as the Usenet, have
    become heated without leading to any commonly-accepted conclusions.  This
    paper addresses some of these points.  The intent is to summarize a few of
    the principal arguments supporting various positions and to argue some
    points of particular merit.  At the end, references are given to material
    that may help provide background material for readers seeking further
    information.  Included in this discussion are the questions of whether
    individuals breaking into our machines are doing us a favor, and whether
    those individuals should in any way be encouraged.  The paper concludes
    with some observations about the importance of the discussion, and the need
    to reach a consensus in the computer profession, if not in society as a
    whole." 
}

@InProceedings{aptttus,
  author       = "Geoff Collyer",
  title        = "{A} Partial Tour Through the " # unix # " Shell",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "343--353",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "shell, portability, storage management",
  abstract     = "We have recently completed protracted surgery on the UNIX
    command interpreter or shell to make use the standard UNIX memory allocator
    (malloc(3) and relatives) for its internal memory management instead of the
    original scheme (catching its own memory faults, using the sbrk(2) system
    call to grow memory allocation and restarting faulting instructions).  We
    also fixed some bugs, lint(1) complaints and suboptimal performance.  This
    paper describes the lessons learned about the internal workings of the
    shell.  Much of this information is oral folklore or is simply not
    generally known, and requires a determined effort to learn, yet is
    essential to correct understanding and maintenance of the shell.", 
  location     = "https://www.in-ulm.de/~mascheck/bourne/v7/sh.tour.ps"
}

@InProceedings{daecsfadce,
  author       = "Ken Raeburn and Jon Rochlis and William Sommerfeld and Stan Zanarotti",
  title        = "Discuss: An Electronic Conferencing System for a Distributed Computing Environment",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "331--342",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "conferencing systems, project athena, authentication",
  abstract     = "As computers and computer networks become commonplace,
    electronic communication is rising in importance and utility.  The
    challenge is to take a large, distributed computing environment and build a
    system which allows its users to communicate effectively and efficiently
    with each other.  This paper compares and contrasts several common types of
    electronic communication, focusing on electronic conferencing.  We describe
    the implementation of such a system, Discuss, for the computing environment
    found at MIT.  Issues covered include the basic model of an electronic
    meeting, the currently implemented user interfaces, separation of user
    interface from underlying operations, splitting the workload between client
    and server, communications issues created by the heterogeneous environment,
    authentication and authorization, notification, and unification of the
    numerous subordinate UNIX libraries into a coherent whole.  The paper
    next summarizes the Discuss system's current usage, then closes with a
    discussion of its possible future development." 
}

@InProceedings{smisvr4,
  author       = "Tim Williams",
  title        = "Session Management in {System V Release} 4",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "365--375",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "process groups, posix, sessions, job control, controlling terminal",
  abstract     = "This paper describes the new session architecture and
    controlling terminal architecture in the System V Release 4.0 kernel
    designed to provide job control support, enhanced login session security
    and controlling terminal reusability, as well as maintain backwards
    compatibility with previous releases of System V.  A subset of this work
    dealing with job control, has been incorporated into the POSIX 1003.1
    standard and stems from the cooperative and exhaustive efforts of a POSIX
    working group made up of representatives from Hewlett-Packard, Berkeley,
    MIT, Usenix and AT&T.  SVR4's session management model builds on that work." 
}

@InProceedings{japreiaubos,
  author       = "Brent~A. Kingsbury and John~T. Kline",
  title        = "Job and Process Recovery in a " # unix # "-Based Operating System",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "355--374",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "crash recovery, checkpointing, interruptable system calls",
  abstract     = "Many computationally-intense programs require more execution
    time than the underlying system can deliver in a single continuous time
    interval; yet preventative maintenance, reconfiguration, and new kernel
    development requirements sometimes force the need for scheduled downtime.
    Also, system crashes due to power failures and other causes result in
    additional downtime.  On generally available Unix systems (such as Berkeley
    and at&t system v), this downtime results in the loss of work in progress
    in the time of system shutdown.  To greatly reduce these losses and allow
    the execution of very long running programs, we have extended the kernel to
    directly support the checkpointing and restarting of processes and related
    collections of processes (jobs).  The kernel extensions in combination with
    a batch job daemon provide automatic and transparent recover of batch jobs
    after scheduled shutdowns and, in some cases, system crashes.  In addition,
    commands exist enabling users to interactively checkpoint and restart
    processes." 
}

@InProceedings{etusitsmp,
  author       = "Paul~R. McJones and Garret~F. Swart",
  title        = "Evolving the " # unix # " System Interface to Support Multithreaded Programs",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "393--404",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "topaz, multithreading, os interfaces, multiplexing, state
    management, process management, interrupts, signaling",
  abstract     = "Allowing multiple threads to execute within the same address
    space makes it easier to write programs that deal with related asynchronous
    activities and that execute faster on shared-memory multiprocessors.
    Supporting multiple threads places new constraints on the design of
    operating system interfaces.  We present several guidelines for designing
    or redesigning interfaces for multithreaded clients.  We show how 1 these
    guidelines were used to design an interface to UNIX-compatible file and
    process management facilities in the Topaz operating system.  Two
    implementations of this interface are in everyday use: a native one for the
    Firefly multiprocessor, and a layered one running within a UNIX process.", 
  location     = "http://www.mcjones.org/paul/evolving.pdf"
}

@InProceedings{tmk,
  author       = "Greg Snider and Jim Hays",
  title        = "The {Modix} Kernel",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "377--392",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "modularity, system structure, object-oriented design",
  abstract     = "The Unix kernel has evolved into a tightly-coupled, monolithic system that is expensive to maintain and difficult to configure.  The Modix project pulled together a number of software engineering principles into a strategy for developing a modular, portable, highly configurable parts catalog for generating Unix kernels.  A module hierarchy within the catalog was built using a dependency relation called uses.  Modules were constrainted to follow the object model, and cyclic use dependencies were not allowed; although adhering to the object model presented no problems in implementation, eliminating cyclic dependencies turned out to be surprisingly difficult.  These structural goals had the side-effect of making deadlock avoidance in multiprocessor and realtime configurations easier and more localized than in some other approaches, and has made it possible to do rigorous testing.  A prototype built to explore the ideas was partially completed."
}

@InProceedings{swsfu,
  author       = "Mark~E. Carson and Wen-Der Jiang and Jeremy~G. Liang and Gary~L. Luckenbaugh and Debra~H. Yakov",
  title        = "Secure Window Systems for " # unix,
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "441--455",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "secure systems, information labels, mac, covert channels",
  abstract     = "Multilevel window systems are a natural way to look at
    multilevel data.  This paper describes some of the functional and assurance
    aspects in the design of one such system, CMW Windows, which runs on the
    IBM PC at and PS/2.  The security functionality of CMW Windows is
    ambitious, including two parallel labeling systems, one with 
    down-to-character-level granularity.  The assurance work is no less
    ambitious, include some effort at addressing the difficult problems of
    covert channels inherent in multilevel window systems.  We then discuss our
    preliminary work on what should be done in window systems of more complex
    functionality, such as the X Window System."
}

@InProceedings{smlwiabcsuos,
  author       = "Barbara Smith-Thomas",
  title        = "Secure Multi-Level Windowing in a {B1} Certifiable Secure " # unix # " {Operating System}",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "429--439",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "terminal multiplexing, secure login, window labeling",
  location     = "Until now multi-level secure operating systems have been
    designed to be connected only to so-called dumb terminals because we have
    assumed that intelligent terminals are necessarily insecure.  An
    intelligent terminal does have considerable potential for compromising the
    security of the system; the more intelligent the terminal, the greater the
    hazard.  AT&T Federal Systems Division and AT&T Bell Laboratories are
    developing a B1 certifiable multi-level secure Unix operating system,
    called System V/MLS.  System V/MLS supports an intelligent terminal: the
    AT&T 630 Multi-Tasking Graphics terminal.  With the System V/MLS security
    enhancements, the 630 MTG terminal supports trusted labeling of windows,
    monitoring the cut and paste to insure compliance with the SV/MLS Mandatory
    Access Control Policy, a mouse-based, menu-driven user interface,
    controlled local processing, and terminal sanitization on logout.  By
    Designing and implementing appropriate controls we have achieved even more
    security for an intelligent terminal than is possible with a dumb
    terminal." 
}

@InProceedings{svmlampa,
  author       = "Charles~W. Flink II and Jonathan~D. Weiss",
  title        = "System {V/MLS} Labeling and Mandatory Policy Alternatives",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "413--427",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "label storage, label handling",
  abstract     = "System V/MLS is a product based on the UNIX® operating
    system, developed within AT&T Federal Systems Division to address National
    Computer Security Center (NCSC) requirements at the B level.  This paper
    describes the alternatives that were analyzed in designing and implementing
    labeling and mandatory access control features to provide security,
    flexibility, and ease of use within a UNIX System V‐compatible framework.",
  location     = "https://doi.org/10.1002/j.1538-7305.1988.tb00631.x"
}

@InProceedings{vwpwfsr,
  author       = "Ziya Aral and James Bloom and Thomas Doeppner and Ilya Gertner and Alan Langerman and Greg Schaffer",
  title        = "Variable Weight Processes with Flexible Shared Resources",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "405--412",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "process resource management, resource sharing, threads,
    lightweight processes",
  abstract     = "Traditional UNIX processes are inadequate for representing
    multiple threads of control in parallel programs.  They are inflexible in
    their resource allocation, unable to cleanly share system resources, and
    they carry a heavy overhead.  Some new operating systems, such as MACH,
    split the process into multiple light-weight threads of execution and a
    task which defines their resource set.  This paper addresses the same
    problem within the confines of UNIX process semantics.  It partitions the
    existing concept of a process into a new variable-weight process and
    several independent system resource descriptors.  Processes pay creation
    and maintenance costs only for resources they wish to keep private.
    Surprisingly few changes to the kernel are needed to achieve this effect.
    The design can properly be considered as a simple concurrency extension to
    Unix.  Variable-weight processes also enhance the effectiveness of the
    cooperating process paradigm and so are broadly applicable to both
    uniprocessor and multiprocessor Unix implementations.  A prototype kernel
    has been implemented on Multimax, a shared-memory multiprocessor.
    Preliminary experience indicates that relatively few changes to the process
    structure in Unix make this strategy incrementally applicable to a range of
    Unix variants.", 
  location     = "http://cs.brown.edu/research/pubs/pdfs/1989/Doeppner-1989-VWP.pdf"
}

@InProceedings{atnafas,
  author       = "Chii-Ren Tsai and Virgil~D. Gligor and Wilhelm Burger and Mark~E. Carlson and Pau-Chen Cheng and Janet~A. Cugini and Matthew~S. Hecht and Shau-Ping Lo and Sohail Malik and N.~Vasudevan",
  title        = "{A} Trusted Network Architecture for {AIX} Systems",
  booktitle    = usenixw89,
  year         = 1989,
  pages        = "457--471",
  address      = sdca,
  month        = "30 " # jan # "-" # "3 " # feb,
  keywords     = "trusted computing base, tcp/ip, security audits, secure networking",
  abstract     = "We built an experimental prototype of a trusted AIX' network
    based on the DDN (Defense Data Network) protocol suite and homogeneous
    experimental AIX Operating System designed to satisfy C2 security
    requirements.  AIX is a version of the Unix operating system on the IBM RT
    PC.  This network contains security features designed to satisfy both the
    C2 requirements of the TNI and the TCSEC, and additional security
    requirements of higher security classes such as a B3 trusted path for
    Telnet.  We define the Network Trusted Computing Base (NTCB) of the AIX
    network, present the architecture of network protocols and explain how this
    architecture satisfies the C2 security requirements." 
}

@InProceedings{dagl,
  author       = "Stephen~C. North and Kiem-Phong Vo",
  title        = "Dictionary and Graph Libraries",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "1--11",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "libraries, dictionaries, graphs, data structures",
  abstract     = "Searching and graph algorithms are pervasive in computer
    programs.  We describe libraries for dictionaries and graphs that offer
    efficient implementations with more flexibility and generality than
    hand-crafted algorithms.  libdict maintains ordered and unordered
    dictionaries, under a common interface.  libgraph supports operations on
    attributed graphs, including reading and writing graph files as a basis for
    creating graph processing tools.",
  location     = "http://web.mit.edu/spin_v4.2.5/man/man3/graph.3"
}

@InProceedings{hwrpkt,
  author       = "Rob Pike and Ken Thompson",
  title        = "Hello World",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "43--50",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "character sets, utf, unicode, plan 9",
  abstract     = "Plan 9 from Bell Labs has recently been converted from ASCII
    to an ASCII-compatible variant of the Unicode Standard, a 16-bit character
    set.  In this paper we explain the reasons for the change, describe the
    character set and representation we chose, and present the programming
    models and software changes that support the new text format.  Although we
    stopped short of full internationalization­for example, system error
    messages are in Unixese, not Japanese­we believe Plan 9 is the first system
    to treat the representation of all major languages on a uniform, equal
    footing throughout all its software.", 
  location     = "http://doc.cat-v.org/plan_9/4th_edition/papers/utf"
}

@InProceedings{alioptuu,
  author       = "Frank Mueller",
  title        = "{A} Library Implementation of {POSIX} Threads under " # unix,
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "29--42",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "libraries, posix threads, performance, context frame, unix
    environment, open systems, ieee standards, light-weight threads, thread
    extensions, pthreads standard, signal handlers", 
  abstract     = "Recently, there has been an effort to specify an IEEE
    standard for portable operating systems for open systems, called POSIX.
    One part of it, the POSIX 1003.4a threads extension (Pthreads for short)
    [12], describes the interface for light-weight threads that rely on shared
    memory and have a smaller context frame than processes.  This paper
    describes and evaluates the design and implementation of a library of
    Pthreads calls that is solely based on UNIX.  It shows that a library
    implementation is feasible and can result in good performance.  This work
    can also be used as a comparison of the performance of other
    implementations, or as a prototyping, testing, and debugging system in the
    regular UNIX environment.  Finally, some problems with the Pthreads
    standard are identified.", 
  location     = "http://ftp.lyx.org/ftp/pub/unix/threads/part/pthreads_usenix93.ps.Z"
}

@InProceedings{lss,
  author       = "W.~E. Garrett and Michael~L. Scott and Ricardo Bianchini and Leonidas~I. Kontothanassis and R.~A. McCallum and J.~A. Thomas and Robert~W. Wisniewski and S.~Luk",
  title        = "Linking Shared Segments",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "13--27",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "dynamic linking, libraries, shared state, searching",
  abstract     = "As an alternative to communication via messages or files,
    shared memory has the potential to be simpler, faster, and less wasteful of
    space.  Unfortunately, the mechanisms available for sharing in Unix are not
    easy to use.  As a result, shared memory tends to appear primarily in
    self-contained parallel applications, where library or compiler support can
    take care of the messy details We have developed a system, called Hemlock,
    for transparent sharing of variables and/or subroutines across application
    boundaries.  Our system is backward compatible with existing versions of
    Unix.  It employs dynamic linking in conjunction with the Unix mmap
    facility and a kernel-maintained correspondence between virtual addresses
    and files.  It introduces the notion of scoped linking to avoid naming
    conflicts in the face of extensive sharing.", 
  location     = "ftp://ftp.cs.rochester.edu/pub/papers/systems/93.USENIX.Linking_shared_segments.ps.Z"
}

@InProceedings{easwhof,
  author       = "Paul Haahr and Byron Rakitzis",
  title        = "Es:  {A} Shell with Higher-Order Functions",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "51--60",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "shell, unix, functional languages",
  abstract     = "In the fall of 1990, one of us (Rakitzis) re-implemented the
    Plan 9 command interpreter, rc, for use as a UNIX shell.  Experience with
    that shell led us to wonder whether a more general approach to the design
    of shells was possible, and this paper describes the result of that
    experimentation.  We applied concepts from modern functional programming
    languages, such as Scheme and ML, to shells, which typically are more
    concerned with UNIX features than language design.  Our shell is both
    simple and highly programmable.  By exposing many of the internals and
    adopting constructs from functional programming languages, we have created
    a shell which supports new paradigms for programmers.", 
  location     = "https://stuff.mit.edu/afs/sipb/user/yandros/doc/es-usenix-winter93.html"
}

@InProceedings{jaffpgip,
  author       = "James~S. Plank",
  title        = "Jgraph --- {A} Filter for Plotting Graphs in {PostScript}",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "61--66",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "graphics, plotting, postscript, tools",
  abstract     = "Jgraph is a non-interactive ﬁfilter for plotting
    two-dimensional scatter, line, and bar graphs in PostScript.  It has also
    been used as a general-purpose drawing utility.  Jgraph’s strengths lie in
    its portability, ﬂexibility, and integration into the UNIX environment.", 
  location     = "https://web.eecs.utk.edu/~plank/plank/papers/USENIX-93W.ps.Z"
}

@InProceedings{famts,
  author       = "Michael~T. Stolarchuk",
  title        = "Faster {AFS}",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "67--75",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "afs, fast-path optimization, caching",
  abstract     = "The AFS Cache Manager fetches files from the AFS file server,
    and caches them into a local file system.  Given this model, users expect
    reads of locally cached files to perform at local file system rates.
    However, read performance of the AFS cached files is half the read
    performance of the local file system.  This paper discusses the reasons for
    the large performance difference, and the modifications made to AFS so that
    reads of locally cached files perform within 10% of the performance of the
    local file system.", 
  location     = "https://deepblue.lib.umich.edu/handle/2027.42/107958"
}

@InProceedings{taafcwoatnl,
  author       = "Ronald~G.  Minnich",
  title        = "The {AutoCacher}:  {A} File Cache Which Operates at the {NFS} Level",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "77--83",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "file caching, nfs, disk utility",
  abstract     = "The AutoCacher is a caching file system.  Its most common use
    is to cache read-only files from remote NFS file systems to a local disk,
    although it can, in general, cache from any file system to any other.  It
    is intended to provide the same type of file caching provided by, e.g., the
    Andrew File System.  The autocacher operates as an NFS server, not as might
    be expected as a Virtual File System, as do other caching file systems such
    as TFSS or the system developed at CMU.  In so doing it demonstrates that
    activities such as file caching, which one might expect to be required to
    operate at the Virtual File System level, can operate effectively at the
    NFS level, despite being stateless." 
}

@InProceedings{pimssaowp,
  author       = "Sunil Saxena and J.~Kent Peacock and Fred Yang and Vijaya Verma and Mohan Krishnan",
  title        = "Pitfalls in Multithreading {SVR4} {STREAMS} and Other Weightless Processes",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "85--96",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "As part of the effort of creating a multiprocessor version of
    System V Release 4, the Intel Multiprocessor Consortium attempted to multithread the kernel STREAMS subsystem.  STREAMS are a System V facility which provides a message-based communications framework, primarily for use in providing pipe-like configurability for character devices.  Multithreading STREAMS required a significant amount of work and it was quite difficult to achieve a correct solution.  In fact, three different versions of the locking were necessary to solve a number of significant problems which were identified.  As such, this effort represents an interesting case study for the type of difficulties encountered in multithreading a complex subsystem.  In particular, a very find-grained multithreading strategy was tried first and found to have undesirable deadlock, performance and stability characteristics.  Subsequent versions allowed less apparent parallelism, but actually improved all of these properties.  The root cause of many of the problems encountered was the existence of weightless processes, that is, control threads which do not have their own processor stacks.  Examples include interrupts, timeouts and STREAMS processing.  The major drawback to weighless processes is their inability to suspend execution to wait for an event or resource, thus making them susceptible to deadlock.  A number of examples of weightless process deadlocks are explored to illustrate the disadvantages of this approach, particularly in a multiprocessor system."
}

@InProceedings{wasdrat,
  author       = "Nicholas Sterling",
  title        = "{WARLOCK} --- A Static Data Race Analysis Tool",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "97--106",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "static analysis, data races, concurrency synchronization,
    locking, annotations", 
  abstract     = "Concurrent programming is becoming available to the masses,
    bringing with it the potential for new types of errors such as deadlocks
    and data races.  this paper describes a static data race analysis tool less
    ambitious than most, written for use with SunSoft's Solaris operating
    system.  The basic algorithm is described, and a sample use of the tool is
    discussed.  Some complicating factors of real code are presented, along
    with the means chosen to deal with them.  The current status of the tool
    and some preliminary experiences are discussed." 
}

@InProceedings{davhldl,
  author       = "Golan, Michael and Hanson, David~R.",
  title        = "{DUEL} --- {A} Very High-Level Debugging Language",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "107--117",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "high-level languages, debuggers, generators, value sequences,
    interpreters",
  abstract     = "Most source-level debuggers accept expressions in the source
    language, e.g., C, and can print source-language values.  This approach is
    usually justified on grounds that programmers need to know only one
    language.  But the evaluation of source-language expressions or even
    statements is poorly suited for making non-trivial queries about the
    program state, e.g., ``which elements of array verb|x[100]| are positive?''
    Duel departs from the conventional wisdom: It is a very high-level language
    designed specifically for source-level debugging of C programs.  Duel
    expressions are a superset of C's and include ``generators,'' which are
    expressions that can produce zero or more values and are inspired by Icon,
    APL, and LISP.  For example, verb|x[..100] >? 0| displays the positive
    elements of x and their indices.  Duel is implemented on top of gdb and
    adds one new command to evaluate Duel expressions and display their
    results.  This paper describes Duel's semantics and syntax, gives examples
    of its use, and outlines its implementation.  Duel is freely available and
    could be interfaced to other debuggers.", 
  location     = "https://www.cs.princeton.edu/research/techreps/TR-399-92"
}

@InProceedings{pmttotvd,
  author       = "Stephen~A. Uhler",
  title        = "{PhoneStation}, Moving the Telephone onto the Virtual Desktop",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "131--140",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "tcl, phone services, event-driven programming",
  abstract     = "PhoneStation is a system that provides a Sun Microsystems
    SPARCstation with complete control over an ordinary telephone line.  It
    consists of a telephone line interface unit with loop control and touch
    tone detection, a suite of supporting software libraries that include
    digital signal processing for call progress monitoring, text-to-speech
    conversion, telephone line control, and PhoneScript, a high level
    procedural language that uses TCL for building interactive based
    application.", 
  location     = "https://www.usenix.org/conference/usenix-winter-1993-conference/phonestation-moving-telephone-virtual-desktop"
}

@InProceedings{tsdzamsts,
  author       = "Chris Peak",
  title        = "The {San Diego ``Zoo''}: A Multicomputer Stress Test Suite",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "119--130",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "stress testing, shell scripting, multicomputers, process
    migration", 
  abstract     = "This paper describes a suite of stress tests for the OSF/1 AD
    TNC operating system running in Intel's Paragon XP/S and iPSC/860 Hypercube
    multicomputers or on networked AT386 machines.  These tests were written to
    exercise the distributed process management features of this OS, but to do
    so using unsophisticated user-level programs as much as possible.  In
    particular, much use is made of Korn shell scripts supplemented by a
    minimal number of standard TNC user commands.  The zoomorphic behavior of
    these tests --- involving spontaneous movement, sleeping, eating (CPU time)
    --- suggested their animal names.  Coincidentally, the Locus office is
    located in San Diego, so the test suite became dubbed the San Diego Zoo and
    soon took on a life of its own.  And what could be more stressful than life
    itself? Note that despite the whimsical tone of this paper, the subject and
    approach outlined here are quite real and applicable to any distributed
    process environment with remote execution and process migration
    capabilities." 
}

@InProceedings{asotsfb,
  author       = "Joel McCormack and Bob McNamara",
  title        = "{A} Sketch of the Smart Frame Buffer",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "169--179",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "frame buffers, graphics, system design",
  abstract     = "Using a RISC processor to drive a simple frame buffer yields
    good 2D color graphics performance.  But processor, memory, and bus
    architectures can prevent processors from saturating video RAM bandwidth.
    The smart frame buffer is a small cheap gate array that makes full memory
    bandwidth available to the CPU by expanding 32 data bits into operations
    upon 32 pixels; pixels can be 8, 16, or 32 bits deep.  We avoid the cost
    and complexity of typical graphics accelerators by leaving high-level
    control to the CPU, yet achieve comparable performance.  This paper
    describes the architecture of the smart frame buffer chip, sketches several
    software algorithms for common X11 graphics operations, and compares
    performance against other popular graphics hardware." 
}

@InProceedings{usfmsacoasl,
  author       = "Bruno d'Ausbourg and Christel Calas",
  title        = unix # " Services for Multilevel STorage and Communications Over a Secure {LAN}",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "157--168",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "multilevel security, secure lan, information flow",
  abstract     = "In this paper we suggest a way to build very secure Unix
    systems and applications.  They are based on the architecture of a highly
    secure machine (M2S) and the design of highly secure communicating
    mechanisms over a LAN architecture.  The entire security is achieved and
    managed by a reduced Security SubSystem (SSS) operating in the hardware
    layer.  This security is formally defined and is directed at the protection
    of both confidentiality and integrity of data, processes, and
    communication.  The controls enforced by this SSS are founded on the rules
    of multilevel security.  The goal is to control casual dependencies inside
    the entire system by controlling all of the elementary flows of
    information.  This leads to a machine and to a basic system for
    communication without any possible disclosure or unauthorized modification
    of information.  In fact, no covert channel can be used in order to strike
    a blow at this system.  Upon such a machine, services and functions of a
    Unix operating system can be built.  And upon such a LAN, services and
    functions of a network system can also be built.  We demonstrate what kind
    of services may be offered to the users and how they can be used to develop
    applications with new security features." 
}

@InProceedings{gaulsbflcds,
  author       = "Paxson, Vern and Saltmarsh, Chris",
  title        = "{\it Glish\/}:  {A} User-Level Software Bus for Loosely-Coupled Distributed Systems",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "141--154",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "software backplane, inter-process communication,
    event-driven systems, interpreters",
  abstract     = "We describe Glish, an interpreted language for building
    distributed systems from modular, event-oriented programs.  These programs
    are written in conventional languages such as C, C++, or FORTRAN.  Glish
    scripts can create local and remote processes and control their
    communication.  Glish also provides a full, array-oriented programming
    language for manipulating binary data sent between the processes.  In
    general Glish uses a centralized communication model where interprocess
    communication passes through the Glish interpreter, allowing dynamic
    modification and rerouting of data values, but Glish also supports
    point-to-point links between processes when necessary for high performance.
    Glish is available via anonymous ftp.", 
  location     = "https://www.cv.nrao.edu/glish/papers/USENIX-93.ps.gz"
}

@InProceedings{waxtbffapivpl,
  author       = "Gustaf Neumann and Stefan Nusser",
  title        = "Wafe --- An {X Toolkit} Based Frontend for Application Programs in Various Programming Languages",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "181--192",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "interface generation, widget toolkits, tcl, scripting
    languages, domain-specific language",
  abstract     = "Wafe provides a ﬂexible and easy to use interface to the
    XToolkit (Xt) and the Athena widget set (Xaw) using the embeddable command
    language Tcl.  It allows access to Xt’s functionality from all compiler and
    interpreter languages, provided that they can communicate over stdout and
    stdin via unbuffered I/O.  Atypical Wafe application consists of a frontend
    process and an application program, which is executed as a child process of
    the frontend.  Wafe provides a relatively high level interface to the X
    Toolkit and widget programming, where the user interface can be
    interactively developed without any need to program in C.  Wafe can be used
    as a rapid prototyping tool and allows easier migration from existing ASCII
    based programs to X Window applications." 
}

@InProceedings{tdaiotifs,
  author       = "Michael~A. Olson",
  title        = "The Design and Implementation of the {Inversion} File System",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "205--217",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "file systems, data bases, transactions, device independence",
  abstract     = "This paper describes the design, implementation, and
    performance of the Inversion file system.  Inversion provides a rich set of
    services to file system users, and manages a large tertiary data store.
    Inversion is built on top of the POSTGRES database system, and takes
    advantage of low-level DBMS services to provide transaction protection,
    fine-grained time travel, and fast crash recovery for user files and file
    system metadata.  Inversion gets between 30% and 80% of the throughput of
    ULTRIX NFS backed by a non-volatile RAM cache.  In addition, Inversion
    allows users to provide code for execution directly in the file system
    manager, yielding performance as much as seven times better than that of
    ULTRIX NFS.", 
  location     = "http://xtf.lib.berkeley.edu/reports/TRWebData/accessPages/S2K-93-28.html"
}

@InProceedings{daioamtx,
  author       = "Carl Schmidtmann and Michael Tao and Steven Watt",
  title        = "Design and Implementation of a Multi-Threaded {Xlib}",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "193--203",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "library design, multi-threaded code, x window system",
  abstract     = "In the MIT X Window System's library Version 11 Release 5
    (Xlib) there is minimal support for multi-threaded applications.
    Programmers writing multi-threaded programs using Xlib are required to
    provide locking or designate a single thread to handle many of the calls to
    X functions in their programs.  In this paper we will describe the design
    and implementation of an upgraded version of Xlib that provides more
    support for multi-threaded applications.  Our goals were to make as few
    changes to the Application Programming Interface as possible, make the
    locking invisible to the programmer using the library, and maintain the
    current portability and performance of the library.  This library was
    implemented on Digital Equipment Corporation's version of OSF/1 using the
    Pthreads library and Xerox Corporation's Cedar environment." 
}

@InProceedings{ossfpfe,
  author       = "Neil Webber",
  title        = "Operating System Support for Portable Filesystem Extensions",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "219--228",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "file system shims, stackable file system, file system
    extensions, system call interceptions, portability",
  abstract     = "No standards, de facto or otherwise, exist for the
    programming environment found inside Unix kernels.  Yet designers hope that
    the VFS architecture, especially when combined with vnode stacking, will
    entice third parties into supplying new filesystem services such as
    compression or encryption.  Our experience suggests that few third parties
    are likely to do so because of the expense inherent in supporting
    non-portable kernel modules in heterogeneous network environments.  We have
    developed kernel extensions allowing user-space implementations of such
    services.  The extensions build on our experiences with hierarchical
    storage, backup, watchdogs, and vnode stacking.  Our model supports common
    interfaces among different kernels, thus allowing portable implementations
    of such services.  This paper examines the VFS portability issues that
    inspired this work.  It then discusses our solution, its relationship to
    other models, its relationship to vnode stacking, our implementation, and
    future directions."
}

@InProceedings{fsius,
  author       = "Paul~R. Eggert and D.~Scott Parker",
  title        = "File Systems in User Space",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "229--240",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "naming, intensionality, shell programming, file systems,
    extensible systems, ",
  abstract     = "Current methods for interfacing file systems to user programs
    suffer two major drawbacks: they require kernel modifications or root
    privileges, and they are too complicated to be given to ordinary users.  In
    this paper we show alternative methods are possible.  The recent rise of
    dynamic linking provides a new way for users to develop their own file
    systems: by interposing a layer of user code between a program and the
    system call interface, a user can alter or extend a file system's behavior.
    For greatest power and reliability, such changes to the file system
    behavior must be managed systematically.  We present two user-extensible
    file systems that are loosely modeled on intentional logic.  IFS0 is
    simple, and supports only extended pathname interpretation for files: it
    permits certain shell-like expressions as pathnames.  To this, IFS1 adds
    directly lookup and an escape mechanism for interpreting pathnames that can
    be modified by the user at any point.  These file systems operate by
    modifying the semantics of Unix system calls that take pathname arguments.
    With IFS1 a user can develop a wide range of useful file systems without
    writing a line of C code.  We have developed a variety of sample file
    systems with IFS1, including tar image navigation and a software
    development file system resembling 3DFS.  ifs1 can thus be thought of as a
    simple user-programmable file system toolkit." 
}

@InProceedings{uksfop,
  author       = "Hyuck Yoo and Tom Rogers",
  title        = "Unix Kernel Support for {OLTP} Performance",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "241--247",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "rdbms, oltp, virtual storage, shared page tables,
    asynchronous io",
  abstract     = "Unix machines are increasingly being used for online
    transaction processing (OLTP) in database applications.  There have been
    several mismatches between OLTP requirements and Unix kernel facilities
    necessary to implement them that have led to performance bottlenecks.  In
    this paper we describe two kernel features that improve OLTP performance on
    Unix.  We describe enhancements to the virtual memory system and i/o system
    in the Unix kernel, and evaluate the performance of the new kernels with a
    database benchmark.  The results show that the enhancements achieve
    significant improvement in OLTP performance." 
}

@InProceedings{maaiouitftd5,
  author       = "Jonathan Kay and  Joseph Pasquale",
  title        = "Measurement, Analysis, and Improvement of {UDP/IP} Throughput for the {DECstation} 5000",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "249--258",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "performance, checksumming, data copying, fddi",
  abstract     = "Networking software is a growing bottleneck in modern
    workstations, particularly for high throughput applications such as
    networked digital video.  We measure various components of the UDP/IP
    protocol stack in a DECstation 5000/200 running Ultrix 4.2a, and quantify
    the way in which checksumming and copying dominate the processing time for
    high throughput applications.  This paper describes network software
    measurements and substantial performance improvements which derive from a
    faster checksum implementation.",
  location     = "http://cseweb.ucsd.edu/~pasquale/Papers/usenix-jk93.pdf",
}

@InProceedings{tbpfanafulpc,
  author       = "Steven McCanne and Van Jacobson",
  title        = "The {BSD} Packet Filter:  {A} New Architecture for User-Level Packet Capture",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "259--269",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "packet filters, network monitoring, stack machines, register
    machines, performance, kernel-resident code, performance",
  abstract     = "Many versions of Unix provide facilities for user-level
    packet capture, making possible the use of general purpose workstations for
    network monitoring.  Because network monitors run as user-level processes,
    packets must be copied across the kernel/user-space protection boundary.
    This copying can be minimized by deploying a kernel agent called a packet
    filter, which discards unwanted packets as early as possible.  The original
    Unix packet filter was designed around a stack-based filter evaluator that
    performs sub-optimally on current RISC CPUs.  The BSD Packet Filter (BPF)
    uses a new, registerbased filter evaluator that is up to 20 times faster
    than the original design.  BPF also uses a straightforward buffering
    strategy that makes its overall performance up to 100 times faster than
    Sun's NIT running on the same hardware.", 
  location     = "https://www.tcpdump.org/papers/bpf-usenix93.pdf"
}

@InProceedings{toonip9,
  author       = "Dave Presotto and Phil Winterbottom",
  title        = "The Organization of Networks in {Plan} 9",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "271--280",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "network management, file systems, 9p, il, file system
    mounting, streams",
  abstract     = "In a distributed system networks are of paramount importance.
    This paper describes the implementation, design philosophy, and
    organization of network support in Plan 9.  Topics include network
    requirements for distributed systems, our kernel implementation, network
    naming, user interfaces, and performance.  We also observe that much of
    this organization is relevant to current systems.",
  location     = "http://doc.cat-v.org/plan_9/4th_edition/papers/net/"
}

@InProceedings{rmis,
  author       = "Howard Alt",
  title        = "Removable Media in {Solaris}",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "281--287",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "removable media, file systems, nfs servers",
  abstract     = "Since the dawn of time (or at least Jan 1, 1970) it has been
    difficult for the common user to take advantage of removable media under
    UNIX.  The traditional UNIX approach to dealing with removable media has
    been to let programs name the device containing the media, and to leave it
    to the operator (or user) to ensure that the right media is in the device
    named.  We have implemented the opposite approach: having the program
    specify the media and letting the OS take care of the device.  Media is
    referenced by a name in the file system and recognized when it is inserted
    into a device.  Administrators may specify actions to be taken when media
    is named, recognized, and removed." 
}

@InProceedings{aatcsfus,
  author       = "Christopher~J. Calabrese",
  title        = "An Advanced Tape Cataloging System for " # unix # " Systems",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "289--293",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "tape management, unix media management, data storage",
  abstract     = "The problem of tracking large numbers of computer tapes has
    been largely neglected in the Unix environment.  Commercial Unix tape
    cataloging systems are neither as powerful as those for proprietary
    mainframe and minicomputer operating systems, not do they fully embrace the
    Unix tool-building philosophy.  This paper describes the tape cataloging
    system now in use at the at&t Bell Laboratories Homer Computer Center,
    where Unix systems have been used for large-scale data processing since the
    mid 1980s.  This system provides the flexible tool-building environment and
    file-naming semantics that Unix is famous for, while also providing all the
    information needed to track thousands of tapes.  The need for user training
    has been minimized by making the tape-specific commands similar to standard
    Unix commands.  In addition to the user level interface, there is an
    interface for automated tape mounting services.  Major technical features
    of the system internals are a Unix-like file system inside a relational
    database, a Unix-like programming interface to this file system, with Unix
    utilities ported to it, and transparent networking." 
}

@InProceedings{eikdptiiotaca,
  author       = "Kevin Fall and Joseph Pasquale",
  title        = "Exploiting In-Kernel Data Paths to Improve {I}/{O} Throughput and {CPU} Availability",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "327--333",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "system calls, device-device io, os performance, sharing",
  abstract     = "We present the motivation, design, implementation, and
    performance evaluation of a UNIX kernel mechanism capable of establishing
    fast in-kernel data pathways between I/O objects.  A new system call,
    splice() moves data asynchronously and without user-process intervention to
    and from I/O objects specified by file descriptors.  Performance
    measurements indicate improved I/O throughput and increased CPU
    availability attributable to reduced context switch and data copying
    overhead.", 
  location     = "https://cseweb.ucsd.edu/~pasquale/Research/Papers/usenix93.pdf"
}

@InProceedings{aioalsfsfu,
  author       = "Seltzer, Margo and Bostic, Keith and McKusick, Marshall Kirk and Staelin, Carl",
  title        = "An Implementation of a Log-Structured File System for " # unix,
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "307--326",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "file systems, disk layout, recovery, file-system management,
    cleaning, performance, fast file system, extended file system",
  abstract     = "Research results suggest that a log-structured file system
    (LFS) offers the potential for dramatically improved write performance,
    faster recovery time, and faster file creation and deletion than
    traditional UNIX file systems.  This paper presents a redesign and
    implementation of the Sprite log-structured file system that is more robust
    and integrated into the vnode interface.  Measurements show its performance
    to be superior to the 4BSD Fast File System (FFS) in a variety of
    benchmarks and not significantly less than FFS in any test.  Unfortunately,
    an enhanced version of FFS (with read and write clustering) provides
    comparable and sometimes superior performance to our LFS.  However, LFS can
    be extended to provide additional functionality such as embedded
    transactions and versioning, not easily implemented in traditional file
    systems.", 
  location     = "https://www.eecs.harvard.edu/margo/papers/usenix93/paper.ps"
}

@InProceedings{ekmaosmm,
  author       = "Paul~E. McKenney and Jack Slingwine",
  title        = "Efficient Kernel Memory Allocation on Shared-Memory Multiprocessors",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "295--305",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "storage management, multiprocessors",
  abstract     = "There has been great progress from the traditional allocation
    algorithms designed for small memories to more modern algorithms
    exemplified by McKusick's and Karel's allocator.  Nonetheless, none of
    these algorithms have been designed to meet the needs of Unix kernels
    supporting commercial data-processing applications in a shared-memory
    multiprocessor environment.  On a shared-memory multiprocessor, memory is a
    global resource.  Therefore, allocator performance depends on
    synchronization primitives and manipulation of shared data as well as on
    raw CPU speed.  Synchronization primitives and access to shared data depend
    on a system bus interactions.  The speed of system busses has not kept pace
    with that of CPUs, as witnessed by the ever-larger caches found on recent
    systems.  Thus, the performance of synchronization primitives and of memory
    allocators that use them have not received the full benefit of increased
    CPU performance.  This situation calls for a new approach to global memory
    allocation that is not so dependent on synchronization primitives and
    manipulation of shared data.  This paper presents such an approach, which
    exhibits near-linear speedup on multiprocessors as well as fifteen times
    the performance of the traditional algorithm when run on a single CPU.
    Nonetheless, this allocator presents an interface identical to the standard
    System V Unix allocator and performs the efficient online coalescing
    required by many commercial data-processing environments." 
}

@InProceedings{tedwps,
  author       = "C.~Mic Bowman and Chanda Dharap",
  title        = "The {Enterprise} Distributed White-Pages Service",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "349--359",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "name servers, aggregation, distributed data bases",
  abstract     = "This paper describes the Enterprise user directory system.
    Enterprise is unique among directory services in three ways.  First,
    clients identify people using an unordered set of attributes called a
    descriptive name.  Descriptive names are easier to use and remember than,
    for example, x.t00 distinguished names.  Second, Enterprise supports an
    efficient distributed search facility.  Rather than query every server in
    the system, Enterprise maintains several distributed indices that trim the
    set of potential servers to a fraction of the total.  Finally, Enterprise
    provides a fa ility for automatically maintaining its database of
    information using existing repositories of information such as the ruserd
    daemon and the Sun NIS database.  This removes the burden placed on users
    and system administrators to maintain the information.  Enterprise is
    implemented as a collection of translators, resolution functions, and
    generators within a Univers descriptive name server." 
}

@InProceedings{fasfdncap,
  author       = "David C.~M. Wood and Sean~S. Coleman and Michael~F. Schwartz",
  title        = "Fremont:  A System for Discovering Network Characteristics and Problems",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "335--347",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "network management, network measurement",
  location     = "In this paper we present an architecture and prototype
    implementation for discovering key network characteristics, such as hosts,
    gateways, and topology.  The Fremont system uses an extensible set of
    modules to discover information, based on a variety of different protocols
    and information sources, rather than a single network management protocol.
    This approach allows more complete and timely information to be discovered
    than, for example, using only one protocol, even one as capable as the
    Simple Network Management Protocol.  The discovered information is
    time-stamped and recorded in a database.  The contents of this database are
    cross-correlated to form an increasingly complete network picture, to
    direct further discovery, and to highlight inconsistent information." 
}

@InProceedings{fifgmopa,
  author       = "Edelson, Daniel~R.",
  title        = "Fault Interpretation:  Fine-Grain Monitoring of Page Accesses",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "395--403",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "memory access monitoring, garbage collection",
  abstract     = "This paper presents a technique for obtaining fine-grain
    information about page accesses from standard virtual memory hardware and
    UNIX operating system software.  This can be used to monitor all user-mode
    accesses to specified regions of the address space of a process.
    Application code can intervene before and/or after an access occurs,
    permitting a wide variety of semantics to be associated with memory pages.
    The technique facilitates implementing complex replication or consistency
    protocols on transparent distributed shared memory and persistent memory.
    The technique can also improve the efficiency of certain generational and
    incremental garbage collection algorithms.  This paper presents our
    implementation and suggest several others.  Efficiency measurements show
    faults to be about three orders of magnitude more expensive than normal
    memory accesses, but two orders of magnitude less expensive than page
    faults.  Information about how to obtain the code via anonymous ftp appears
    at the end of the paper." 
}

@InProceedings{arscfcueacp,
  author       = "Steven McCanne and Chris Torek",
  title        = "A Randomized Sampling Clock for {CPU} Utilization Estimation and Code Profiling",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "387--394",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "statistical sampling, performance monitoring, code profiling",
  abstract     = "The Unix rusage statistics are well known to be highly
    inaccurate measurements of CPU utilization.  We have observed errors in
    real applications as large as 80%, and we show how to construct an
    adversary process that can use an arbitrary amount of the CPU without being
    charged.  We demonstrate that these inaccuracies result from aliasing
    effects between the periodic system clock and periodic process behavior.
    Process behavior cannot be changed but periodic sampling can.  To eliminate
    aliasing, we have introduced a randomized, aperiodic sampling clock into
    the 4.4bsd kernel.  Our measurements show that this randomization has
    completely removed the systematic errors." 
}

@InProceedings{hpok,
  author       = "Andrew McRae",
  title        = "Hardware Profiling of Kernels",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "375--386",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "kernel profiling, profiling hardware, performance
    optimization, data analysis",
  abstract     = "This paper describes a method of accurately measuring and
    profiling kernel code in real time.  Some background is covered, which
    describes other more common, and easier, methods of profiling, and why
    these methods were rejected.  Some goals are stated, and a proposed
    hardware/software solution is described.  As a case study, the profiling
    method is used to evaluate a kernel incorporating the Berkeley TCP/IP
    networking code; the results of this exercise are presented, showing how
    tracing of network software in real time highlights optimal or non-optimal
    code paths.  Warning to software people: this paper contains some
    descriptions of hardware.  Warning to non-kernel-hackers: this paper has
    lots of kernel hacking in it.", 
  location     = "http://mcrae.homeunix.net/papers/final_usenix.pdf"
}

@InProceedings{eardsbosfi,
  author       = "Darren~R. Hardy and Michael~F. Schwartz",
  title        = "Essence:  A Resource Discovery System Based on Semantic File Indexing",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "361--373",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "semantic indexing, file indexing, distributed databases",
  abstract     = "Discovering different types of file resources (such as
    documentation, programs, and images) in the vast amount of data contained
    within network file systems is useful for both users and system
    administrators.  In this paper we discuss the Essence resource discovery
    system, which exploits file semantics to index both textual and binary
    files.  By exploiting semantics, Essence extracts keywords that summarize a
    file, and generates a compact yet representative index.  Essence
    understands nested file structures (such as uuencoded, compressed, tar
    files), and recursively unravels such files to generate summaries for them.
    These features allow Essence to be used in a number of useful settings,
    such as anonymous FTP archives.  We present measurements of our prototype
    and compare them to related projects, such as the Wide Area Information
    Servers (WAIS) system and the MIT Semantic File System (SFS).  We
    demonstrate that Essence can index more data types, generate smaller
    indexes, and in some case index data faster than these systems.  Our
    prototype generates WAIS-compatible indexes, allowing WAIS users to take
    advantage of the Essence indexing methods." 
}

@InProceedings{udap,
  author       = "Chris Ruemmler and John Wilkes",
  title        = "Unix Disk Access Patterns",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "405--420",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "disk performance, low-level io behavior, buffering, trace
    analysis, simulation analysis",
  abstract     = "Disk access patterns are becoming ever more important to
    understand as the gap between processor and disk performance increases.
    The study presented here is a detailed characterization of every low-level
    disk access generated by three quite different systems over a two month
    period.  The contributions of this paper are the detailed information we
    provide about the disk accesses on these systems (many of our results are
    signiﬁcantly different from those reported in the literature, which provide
    summary data only for ﬁle-level access on small-memory systems); and the
    analysis of a set of optimizations that could be applied at the disk level
    to improve performance.  Our traces show that the majority of all
    operations are writes; disk accesses are rarely sequential; 25–50% of all
    accesses are asynchronous; only 13–41% of accesses are to user data (the
    rest result from swapping, metadata, and program execution); and I/O
    activity is very bursty: mean request queue lengths seen by an incoming
    request range from 1.7 to 8.9 (1.2–1.9 for reads, 2.0–14.8 for writes),
    while we saw 95th percentile queue lengths as large as 89 entries, and
    maxima of over 1000.  Using a simulator to analyze the effect of write
    caching at the disk level, we found that using a small non-volatile cache
    at each disk allowed writes to be serviced considerably faster than with a
    regular disk.  In particular , short bursts of writes go much faster – and
    such bursts are common: writes rarely come singly.  Adding even 8KB of
    non-volatile memory per disk could reduce disk traffic by 10–18%, and 90%
    of metadata write traffic can be absorbed with as little as 0.2MB per disk
    of non-volatile RAM.  Even 128KB of NVRAM cache in each disk can improve
    write performance by as much as a factor of three.FCFS scheduling for the
    cached writes gave better performance than a more advanced technique at
    small cache sizes.  Our results provide quantitative input to people
    investigating improved file system designs (such as log-based ones), as
    well as to I/O subsystem and disk controller designers.", 
  location     = "https://users.soe.ucsc.edu/~sbrandt/290S/udap.ps"
}

@InProceedings{ao1ufmpm,
  author       = "Roman Zajcew and Paul Roy and David~L. Black and Chris Peak and Paulo Guedes and Bradford Kemp and John LoVerso and Michael Leibensperger and Michael Barnett and Faramarz Rabii and Durriya Netterwala",
  title        = "An {OSF}/1 " # Unix # " for Massively Parallel Multicomputers",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "449--468",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "multicomputers, mach, ipc, distributed file systems, process
    migration, process management, socket io",
  abstract     = "This paper describes the architecture and implementation of a
    version of the OSF/1 Unix operating system designed to run on multicomputer
    hardware platforms.  The multicomputer hardware platforms targeted can
    consist of hundreds or even thousands of individual nodes, where each node
    consists of one or more processors.  The multicomputer version of OSF/1
    Unix (called OSF/1 AD TNC) is built on the Mach 3.0 Microkernel and the
    OSF/1 MK Single Server.  These have been modified to run in the
    multicomputer environment and provide a view of the hardware that looks
    like a conventional but massively scaled up shared memory multiprocessor.
    The operating system presents this notion of a Single System Image by
    building Unix functionality on top of base Mach services running on each
    node in the multicomputer.  The focus of this paper is on the particular
    enhancements made to standard OSF/1 functionality to operate in a
    multicomputer environment without incurring system bottlenecks.  These
    include a new distributed file system, a distributed implementation of
    sockets, and enhancements to process management functionality to support
    remote processing and load leveling.  Extensions to the operating system
    interface to allow users to take advantage of the parallelism of the
    multicomputer hardware are also discussed.", 
  location     = "http://ftp.gwdg.de/pub/misc/opengroup/ri/os/papers/osf1ad_usenix.ps"
}

@InProceedings{aiouoaooos,
  author       = "Yousef~A. Khalidi and Michael~N. Nelson",
  title        = "An Implementation of " # unix # " on an Object-Oriented Operating System",
  title        = "An {OSF}/1 Unix for Massively Parallel Multicomputers",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "469--479",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "spring, hosting, unix, servers, libraries, name binding, emulation",
  abstract     = "This paper describes an implementation of UNIX on top of an
    object-oriented operating system.  UNIX is implemented without modifying
    the underlying mechanisms provided by the base system.  The resulting
    system runs dynamically-linked UNIX binaries and utilizes the services
    provided by the object-oriented system." 
}

@InProceedings{hualsfsftsm,
  author       = "John~T. Kohl and Carl Staelin and Michael Stonebraker",
  title        = "{HighLight}:  Using a Log-Structured File System for Tertiary Storage Management",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "435--447",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "log-structured file system, tertiary storage management,
    storage hierarchy, automatic migration, tertiary storage characteristics,
    huge storage capacity, robotic tape jukebox, file systems, storage
    hierarchies, robotic storage devices, sequential write patterns, tertiary
    storage device, memory cache, secondary storage devices", 
  abstract     = "Robotic storage devices offer huge storage capacity at a low
    cost per byte, but with large access times.  Integrating these devices into
    the storage hierarchy presents a challenge to file system designers.
    Log-structured file systems (LFSs) were developed to reduce latencies
    involved in accessing disk devices, but their sequential write patterns
    match well with tertiary storage characteristics.  Unfortunately, existing
    versions only manage memory caches and disks, and do not support a broader
    storage hierarchy.  HighLight extends 4.4BSD LFS to incorporate both
    secondary storage devices (disks) and tertiary storage devices (such as
    robotic tape jukeboxes), providing a hierarchy within the file system that
    does not require any application support.  This paper presents the design
    of HighLight, proposes various policies for automatic migration of file
    data between the hierarchy levels, and presents initial migration mechanism
    performance figures.",
  location     = "http://db.cs.berkeley.edu/papers/UCB-MS-jtkohl.pdf"
}

@InProceedings{aaofmiause,
  author       = "Ethan~L. Miller and Randy~H. Katz",
  title        = "An Analysis of File Migration in a " # Unix # " Supercomputing Environment",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "421--433",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "mass storage, file management, file access behavior,
    trace-driven analysis, file migration",
  abstract     = "The supercomputer center at the National Center for
    Atmospheric Research (NCAR) migrates large numbers of files to and from its
    mass storage system (MSS) because there is insufficient space to store them
    on the Cray supercomputer’s local disks.  This paper presents an analysis
    of file migration data collected over two years.  The analysis shows that
    requests to the MSS are periodic, with one day and one week periods.  Read
    requests to the MSS account for the majority of the periodicity; as write
    requests are relatively constant over the course of a week.  Additionally,
    reads show a far greater fluctuation than writes over a day and week since
    reads are driven by human users while writes are machine-driven.", 
  location     = "https://users.soe.ucsc.edu/~elm/Papers/usenix93.pdf"
}

@InProceedings{tdaioamia,
  author       = "Ioannidis, John and Maguire Jr., Gerald~Q.",
  title        = "The Design and Implementation of a Mobile Internetworking Architecture",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "491--502",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "mobile internetworking architecture, mobile ip, mobile host, 
    non-mobile host, ip-based protocol",
  abstract     = "We present the design, implementation, and evaluation of
    Mobile*IP, a set of IP-based protocols and mechanisms to support host
    mobility throughout the Internet.  The design requires changes only in the
    mobile hosts and their special routers; leaves transport and higher
    protocols unaffected, and requires no changes in the device drivers for
    individual interfaces.  No modifications whatsoever are needed in
    non-mobile hosts and routers, the system scales well, and has no single
    points of failure.  We have implemented Mobile*IP under Mach 2.6, and the
    code is readily portable to any version of Unix that uses Berkeley
    networking code." 
}

@InProceedings{tnios,
  author       = "Christopher, Wayne~A. and Procter, Steven~J. and Anderson, Thomas~E.",
  title        = "The {Nachos} Instructional Operating System",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "481--489",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "instructional operating system, simulation",
  abstract     = "In teaching operating systems at an undergraduate level, we
  believe that it is important to provide a project that is realistic enough
  to show how real operating systems work, yet is simple enough that the
  students can understand and modify it in significant ways.  A number of these
  instructional saystems have been created over the last two decades, but
  recent advances in hardware and software design, along with the increasing
  power of available computational resources, have changed the basis for many
  of the tradeoffs made by these systems.  we have implemented an instructional
  operating system, called Nachos, and designed a series of assignments to go
  with it.  Our system includes CPU and device simulatiors, and it runs as a
  regulat UNIX process.  Nachos illustrates and takes advantage of modern
  operating systems technology, such as threads and remote procedure calls,
  recent harware advances, such as RISC'S and the prevalence of memory
  hierarchies, and modern software design techniques, such as protocol layering
  and object-oriented programming.  Nachos has been used to teach undergraduate
  operating systems classes at several universities with positive results.",
  location     = "https://www2.eecs.berkeley.edu/Pubs/TechRpts/1993/CSD-93-739.pdf"
}

@InProceedings{mceboipf,
  author       = "Hiromi Wada and Takashi Yozawa and Tatsuya Ohnishi and Yasunori Tanaka",
  title        = "Mobile Computing Environment Based on {Internet} Packet Forwarding",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "503--517",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "ip mobility, packet forwarding, location information
    management, mobility protocols",
  abstract     = "We have explored a mobile computing environment which
    provides migration transparency of portable hosts.  In this paper, we
    propose a means of continuous communication with mobile hosts called the
    Packet Forwarding Method (PFM).  In the environment, each mobile host has a
    home address, and when it migrates to another network, it is also assigned
    a temporary address.  An application on the mobile host always uses the
    home address for communication.  PFM is based on packet forwarding.  A
    packet destined for a home address of a mobile host is forwarded to its
    current temporary address.  This forwarding is performed by a Packet
    Forwarding Server (FPS) or by the sender host itself internally.  This
    method has adaptability for existing multi-vendor environments since
    enhancement of stationary hosts is optional and modification of routers is
    not required.  Stationary hosts which have been enhanced to have forwarding
    functionality can communicate with mobile hosts more efficiently than those
    without the enhancement.  The implemented prototype code size is relatively
    small, and experiments indicate that communication overhead is trivial,
    especially in the case of stationary hosts with the enhancement." 
}

@InProceedings{tccuolctepm,
  author       = "Fred Douglis",
  title        = "The Compression CAche:  Using On-Line Compression to Extend Physical Memory",
  booktitle    = usenixw93,
  year         = 1993,
  pages        = "519--529",
  publisher    = "USENIX Association",
  address      = sdca,
  month        = "25--29 " # jan,
  keywords     = "caching, data compression, storage hierarchy, vm paging,
    performance, cpu-io tradeoffs, adaptive allocation",
  abstract     = "This paper describes a method for trading off computation for
    disk or network I/O by using less expensive on-line compression.  By using
    some memory to store data in compressed format, it may be possible to fit
    the working set of one or more large applications in relatively small
    memory.  For working sets that are too large to fit in memory even when
    compressed, compression still provides a benefit by reducing bandwidth and
    space requirements.  Overall, the effectiveness of this compression cache
    depends on application behavior and the relative costs of compression and
    I/O.  Measurements using Sprite on a DECstation 1 5000/200 workstation with
    a local disk indicate that some memory-intensive applications running with
    a compression cache can run two to three times faster than on an unmodified
    system.  Better speedups would be expected in a system with a greater
    disparity between the speed of its processor and the bandwidth to its
    backing store.",  
    location     = "https://www.usenix.org/legacyurl/adaptive-main-memory-compression"
}

@InProceedings{cppompriu,
  author       = "Hall, Robert~J. and Goldberg, Aaron~J.",
  title        = "Call Path Profiling of Monotonic Program Resources in " # unix,
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "1--13",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "program profiling, resource monitoring, call trees, monotonic
    resources",
  abstract     = "Practical performance improvement of a complex program must
    be guided by empirical measurements of its resource usage.  Essentially,
    the programmer wants to know where in the source code the program is
    inefficient and why this is so.  The process interface of UNIX System V
    (proc(4)) provides access to the raw data (e.g.  time, faults, traps, and
    system calls) necessary to answering the why question, but gives no
    guidance in answering the where question.  This paper describes a novel
    approach to the latter, Call Path Profiling, which is both more informative
    and more closely tied to the process of program optimization than either
    trace-based or prof/gprof-like approaches.  In addition, by viewing
    consumption of a resource as the ticking of a clock, we generalize the
    interval-based sampling approach of time profilers to arbitrary monotonic
    resources.  The approach is embodied in several prototypes, including
    CPPROF which operates under System V.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/call-path-profiling-monotonic-program-resources"
}

@InProceedings{csppdutsm,
  author       = "Hoogenboom, Peter and Lepreau, Jay",
  title        = "Computer System Performance Problem Detection Using Time Series Models",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "15--32",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "system monitoring, time series model, expert systems",
  abstract     = "Computer systems require monitoring to detect performance
    anomalies such as runaway processes, but problem detection and diagnosis is
    a complex task requiring skilled attention.  Although human attention was
    never ideal for this task, as networks of computers grow larger and their
    interactions more complex, it falls far short.  Existing computer-aided
    management systems require the administrator manually to specify fixed
    trouble thresholds.  In this paper we report on an expert system that
    automatically sets thresholds, and detects and diagnoses performance
    problems on a network of Unix computers.  Key to the success and
    scalability of this system are the time series models we developed to model
    the variations in workload on each host.  Analysis of the load average
    records of 50 machines yielded models which show, for workstations with
    simulated problem injection, false positive and negative rates of less than
    1%.  The server machines most difficult to model still gave average false
    positive/negative rates of only 6%/32%.  Observed values exceeding the
    expected range for a particular host cause the expert system to focus on
    that machine.  There it applies tools with finer resolution and more
    discrimination, including per-command profiles gleaned from process
    accounting records.  It makes one of 18 specific diagnoses and notifies the
    administrator, and optionally the user.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/computer-system-performance-problem-detection"
}

@InProceedings{daioaslulp,
  author       = "Sang, Janche and Chung, Ke-hsiung and Rego, Vernon",
  title        = "Design and Implementation of a Simulation Library using Lightweight Processes",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "33--44",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "simulation systems, modularity, library design, posix
    threads, performance optimizations, scheduling",
  abstract     = "The Si lightweight-process based system for simulating
    process interactions is an enhancement to the C programming language in the
    form of library primitives with sets of predefined data structures.  The
    Si system encapsulates an existing lightweight-process library to provide
    a discrete-event simulation environment supporting the process view.  It
    was developed as a research testbed for investigating methods which support
    simulations efficiently.  Easy extensions and modifications to the Si
    system are a major design objective, accomplished through modularity and
    layering.  This paper describes the system, our experiences with its
    implementation, and its applicability to simulation modeling.  We report on
    performance measurements of different implementations of the simulation
    scheduler, and of different algorithms for simulating service
    disciplines.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/design-and-implementation-simulation-library"
}

@InProceedings{trom,
  author       = "Moran, Joe and Lyon, Bob",
  title        = "The {Restore-o-Mounter}",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "45--58",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "file archiving, file backups, nfs, os extensions, user-space
    file systems",
  abstract     = "We present a scheme for referencing and accessing saved (We
    use 'save' to denote the super set of backup and archive; save is also
    easier to conjugate than backup.) files in a manner that is transparent to
    UNIX applications.  The scheme requires no kernel modifications.  Instead,
    it uses a mounted process that allows users to change directories to the
    past and browse their saved files with their favorite utilities.  The
    mounted process acts as a protocol gateway between NFS and a commercially
    available network backup product.  Time travel is supported; users may
    change directories to any moment in the past.  Any saved version (not just
    the most recent version) of any file can be viewed or recovered, even if
    the file has since been deleted.  Using this transparent method of
    retrieving saved files by naming their location in the past, a poor man's
    file migration scheme can be implemented by substituting a symbolic link to
    a saved location for a file.  Once a file is referenced, the symbolic link
    can be replaced with its original file.  This migration scheme requires no
    kernel modifications yet remains transparent to UNIX applications and
    users.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/restore-o-mounter-file-motel-revisited"
}

@InProceedings{taabcss,
  author       = "Callaghan, Brent and Singh, Satinder",
  title        = "The {Autofs} Automounter",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "59--68",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "file systems, automounting, nfs",
  abstract     = "Prior to the introduction of the automounter in 1987, NFS
    mounts were administered separately on each workstation.  The automounter
    has provided administrators with a tool to construct a filesystem namespace
    that can be shared across an organization.  While the automounter is widely
    used, its success has been tempered by problems inherent in its
    implementation.  This paper describes a new implementation of the
    automounter based on a new filesystem.  This new automounter not only fixes
    the problems, but provides some interesting opportunities for future
    development.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/presentation/autofs-automounter"
}

@InProceedings{dahrorrofswatmc,
  author       = "Erez Zadok and Dan Duchamp",
  title        = "Discovery and Hot Replacement of Replicated Read-Only File Systems, with Application to Mobile Computing",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "69--85",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "automounting, mobile computing, performance measurement,
    user-space servers, nfs, rlp",
  abstract     = "We describe a mechanism for replacing files, including open
    files, of a read-only file system while the file system remains mounted;
    the act of replacement is transparent to the user.  Such a hot replacement
    mechanism can improve fault-tolerance, performance, or both.  Our mechanism
    monitors, from the client side, the latency of operations directed at each
    file system.  When latency degrades, the client automatically seeks a
    replacement file system that is equivalent to but hopefully faster than the
    current file system.  The files in the replacement file system then take
    the place of those in the current file system.  This work has particular
    relevance to mobile computers, which in some cases might move over a wide
    area.  Wide area movement can be expected to lead to highly variable
    response time, and give rise to three sorts of problems: increased latency,
    increased failures, and decreased scalability.  If a mobile client moves
    through regions having partial replicas of common file systems, then the
    mobile client can depend on our mechanism to provide increased fault
    tolerance and more uniform performance.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/discovery-and-hot-replacement-replicated-read"
}

@InProceedings{tfdb,
  author       = "Katseff, Howard~P. and London, Thomas~B.",
  title        = "The {Ferret} Document Browser",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "101--110",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "document browsing, networking, document storage, image
    representation",
  abstract     = "The Ferret Document Browser is a vehicle for exploring the
    design and use of document storage and retrieval systems.  Its distributed,
    modular structure allows independent information providers to control their
    data, yet make use of a common access and billing control facility.
    Document images are distributed via a nationwide AT&T corporate internet
    which consists mainly of Ethernet networks interconnected by leased data
    circuits.  The relatively low bandwidth of this networks is dealt with by
    compressing the documents for transmission, and by decompressing pages as
    requested on the workstation.  A page image can be decompressed and
    displayed in less that a half second.  A broadband version of the system
    makes use of the BBFS broadband file server, the HPC interconnect, the
    LuckyNet broadband network and the Liaison network multimedia workstation.
    This system allows document browsing at rates up to 15 page images per
    second.", 
  location     = "https://www.usenix.org/publications/library/proceedings/cinci93/full_papers/katseff.txt"
}

@InProceedings{xttfaoar,
  author       = "Treese, G.~Winfield and Wolman, Alec",
  title        = "X Through the Firewall, and Other Application Relays",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "87--99",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "gateways, relays, security, policies and mechanisms,
    networking, firewalls",
  abstract     = "Organizations often impose an administrative security policy
    when they connect to other organizations on a public network such as the
    Internet.  Many applications have their own notions of security, or they
    simply rely on the security of the underlying protocols.  Using the X
    Window System as a case study, we describe some techniques for building
    application-specific relays that allow the use of applications across
    organizational boundaries.  In particular, we focus on analyzing
    administrative and application-specific security policies to construct
    solutions that satisfy the security requirements while providing the
    necessary functions of the applications.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/x-through-firewall-and-other-application-relays"
}

@InProceedings{ltnginfsb,
  author       = "Wittle, Mark and Keith, Bruce~E.",
  title        = "{LADDIS}:  The Next Generation in {NFS} File Server Benchmarking",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "111--128",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "nfs, benchmarking, server performance",
  abstract     = "The ability to compare the performance of various NFS(1) file
    server configurations from several vendors is critically important to a
    computing facility when selecting an NFS file server.  To date,
    nhfsstone(2) has been a popular means of characterizing NFS file server
    performance.  However, several deficiencies have been found in nhfsstone.
    The LADDIS NFS file server benchmark has been developed to resolve
    nhfsstone's shortcomings and provide new functionality.  The Standard
    Performance Evaluation Corporation (SPEC(3)) released the System File
    Server (SFS) Release 1.0 benchmark suite, which contains 097.LADDIS, as an
    industry-standard NFS file server benchmark in April 1993.  This paper
    describes the major technical issues involved in developing the benchmark
    and the rationale used to establish default 097.LADDIS workload parameter
    values.  Where appropriate, areas for further research are identified and
    encouraged.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/laddis-next-generation-nfs-file-server"
}

@InProceedings{daioampsiabuk,
  author       = "Lakshman, K. and Kuthethoor, Giri and Yavatkar, Raj",
  title        = "Design and Implementation of a Multimedia Protocol Suite in a {BSD} " # unix # " Kernel",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "129--146",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "multimedia delivery protocols, floor control, stream
    synchronization", 
  abstract     = "Development of distributed multimedia applications requires
    support for coordination and temporal/causal synchronization of traffic
    over related streams.  Our current research involves investigation of
    appropriate OS and communication abstractions to support such applications.
    Towards this goal, we have designed and implemented MCP, a suite of
    transport and session layer protocols, in the framework of a standard BSD
    Unix networking platform.  MCP contains two new abstractions.  First, MCP
    contains a token-based mechanism for coordination of traffic over a
    multipoint connection.  Second, MCP includes an abstraction called a
    multi-flow conversation that enforces both temporal and causal
    synchronization among related data streams.  This paper discusses Unix
    kernel implementation of MCP and describes our experience in using MCP.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/design-and-implementation-multimedia-protocol"
}

@InProceedings{tsnamfo,
  author       = "Hamilton, Graham and Kougiouris, Panos",
  title        = "The {Spring} Nucleus:  {A} Microkernel for Objects",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "147--159",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "microkernel, ipc, distributed systems, doors, performance",
  abstract     = "The Spring system is a distributed operating system that
    supports a distributed, object-oriented application framework.  Each
    individual Spring system is based around a microkernel known as the
    nucleus, which is structured to support fast cross-address-space object
    invocations.  This paper discusses the design rationale for the nucleus's
    IPC facilities and how they fit into the overall Spring programming model.
    We then describe how the internal structure of the nucleus is organized to
    support fast cross-address-space calls, including some specific details and
    performance information on the current implementation.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/spring-nucleus-microkernel-objects"
}

@InProceedings{svapr,
  author       = "Skinner, Glenn~C. and Wong, Thomas~K.",
  title        = "``{Stacking}'' Vnodes:  {A} Progress Report",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "161--174",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "file system development, interposition, object-oriented
    structuring",
  abstract     = "People are dissatisfied with the file system services that
    come with their UNIX systems.  They want to add new and better features.
    At present they have two choices: express their service as a user-level NFS
    server, or use the vnode/VFS interface to build at least part of it into
    the kernel.  Although the vnode/VFS interface has been remarkably
    successful as a kernel structuring concept, it has failed to provide source
    portability between UNIX versions or even binary compatibility between
    releases of the same UNIX version.  It has been obvious for some time that
    a redesign of the vnode/VFS interface that allowed file systems to be
    shipped as binary kernel modules that survive from release to release is
    needed.  We describe a prototype kernel with a vnode/VFS interface that
    would allow this.  It is based on earlier work on stacking vnodes at Sun
    and at UCLA, but it replaces the stacking concept by a more strictly
    object-oriented concept of interposition.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/stacking-vnodes-progress-report"
}

@InProceedings{oursfui,
  author       = "Evans, Steve and Clarke, Kevin and Singleton, Dave and Smaalders, Bart",
  title        = "Optimizing " # unix # " Resource Scheduling for User Interactions",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "205--218",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "interaction, adaptive scheduling, behavioral scheduling, ",
  abstract     = "Techniques for improving system responsiveness for
    interactive end users of Unix workstations are explored.  After a
    discussion of the current state of resource scheduling, a model is
    presented in which dynamic input from the human user is combined with data
    from user interaction software to supply a centralized manager with the
    information necessary to determine what processes are involved with
    interacting with the user at any given moment.  This service then
    communicates this process set information to the kernel, which uses it to
    manage memory and CPU resource allocation on the behalf of the user.
    Experience with a prototype of this environment is reported.  An argument
    for an interactive scheduling class is made, along with other
    infrastructure changes needed to take advantage of it.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/optimizing-unix-resource-scheduling-user"
}

@InProceedings{ihriu,
  author       = "James Kempf",
  title        = "Integrating Handwriting Recognition into " # unix,
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "187--204",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "user input, handwriting recognition",
  abstract     = "Many new portable computers are substituting an electronic
    stylus, or pen, for the mouse.  While the pen can serve as a simple
    replacement for the mouse, it also provides an enhanced drawing capability.
    This capability opens up the potential for new modes of user interaction,
    one of which is text input through handwriting instead of keyboard entry.
    In this paper, the integration of handwriting recognition into the Unix
    operation system is discussed.  We begin with an examination of the current
    state of the art in recognition algorithms and how handwriting recognition
    can enhance a user interface.  A standard application program interface for
    handwriting recognition engines (HRE API) is then presented.  The HRE API
    is distinguished from existing PC operating system API's in that it is
    specifically designed for multiple handwriting recognition engines of
    differing technologies, rather than a single, vendor-specific engine, and
    it shares a relatively narrow surface area with the window system.  The
    latter characteristic allows it to be used with existing window systems,
    such as X, but does not hinder migration to other window systems should
    they become available.  The API has been implemented with a public domain
    recognition engine and is currently being circulated among vendors of
    handwriting recognition engines for comment.  Finally, the paper concludes
    with a discussion of where handwriting recognition belongs in the current X
    window system architecture, and what would be needed to make handwriting an
    equal partner with typed keyboard input for text entry.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/integrating-handwriting-recognition-unix"
}

@InProceedings{arllpia6bas,
  author       = "Yarvin, Curtis and Bukowski, Richard and Anderson, Thomas",
  title        = "Anonymous {RPC}:  Low-Latency Protection in a 64-Bit Address Space",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "175--186",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "ipc, randomization, rpc, anonymization, protection",
  abstract     = "In this paper, we propose a method of reducing the latency of
    cross-domain remote procedure call (RPC).  Traditional systems use separate
    address spaces to provide memory protection between separate processes, but
    even with a highly optimized RPC system, the cost of switching between
    address spaces can make cross-domain RPC prohibitively expensive.  Our
    approach is to use anonymity instead of hardware page tables for
    protection.  Logically independent memory segments are placed at random
    locations in the same address space and protection domain.  With 64-bit
    virtual addresses, it is unlikely that a process will be able to locate any
    other segment by accidental or malicious memory probes; it is impossible to
    corrupt a segment without knowing its location.  The benefit is that a
    cross-domain RPC need not involve a hardware context switch.  Measurements
    of our prototype implementation show that a round-trip null RPC takes only
    7.7us on an Intel 486-33.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/anonymous-rpc-low-latency-protection-64-bit"
}

@InProceedings{aantsfdaa,
  author       = "Levergood, Thomas~M. and Payne, Andrew~C. and Gettys, James and Treese, G. Winfeld and Stewart, Lawrence~C.",
  title        = "{AudioFile}:  {A} Network-Transparent System for Distributed Audio Applications",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "219--236",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "audio servers, time, transport protocols",
  abstract     = "AudioFile is a portable, device-independent,
    network-transparent system for computer audio systems.  Similar to the X
    Window System, it provides an abstract audio device interface with a simple
    network protocol to support a variety of audio hardware and multiple
    simultaneous clients.  AudioFile emphasizes client handling of audio data
    and permits exact control of timing.  This paper describes our approach to
    digital audio, the AudioFile protocol, the client library, the audio
    server, and some example client applications.  It also discusses the
    performance of the system and our experience using standard networking
    protocols for audio.  A source code distribution is available by anonymous
    FTP.", 
  location     = "https://www.hpl.hp.com/techreports/Compaq-DEC/CRL-93-8.pdf"
}

@InProceedings{hpdltc,
  author       = "Nelson, Michael~N. and Hamilton, Graham",
  title        = "High Performance Dynamic Linking Through Caching",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "253--265",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "caching, dynamic linking, position independent code,
    indirection tables, libraries",
  abstract     = "The Spring Operating System provides high performance dynamic
    linking of program images.  Spring uses caching of both fixed-up program
    images and partially fixed-up shared libraries to make dynamic linking of
    program images efficient, to reduce the need for PIC (position-independent
    code), and to improve page sharing between different program images running
    the same libraries.  The result is that with program image caching,
    dynamically-linked programs have a start-up cost similar to
    statically-linked programs regardless of the number of unresolved symbols
    in dynamically-linked program images and shared libraries.  In addition,
    with library and program image caching, we have reduced the need for PIC
    and have increased page sharing.", 
  location     = "https://www.usenix.org/publications/library/proceedings/cinci93/full_papers/nelson.txt"
}

@InProceedings{fafsl,
  author       = "Douglas Orr and John Bonn and Jay Lepreau and Robert Mecklenburg",
  title        = "Fast and Flexible Shared Libraries",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "237--251",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "flux, ",
  abstract     = "Existing implementations of shared libraries sacrifice speed
    (in loading, linking, and executed code), for essential flexibility (in
    symbol binding, address space use, and interface evolution).  Modern
    operating systems provide the primitives needed to make the dynamic linker
    and loader a persistent server which lives across program invocations.
    This can provide speed without sacrificing flexibility.  The speed is
    gained primarily through caching of previous work, i.e., bound and
    relocated executable images and libraries.  The flexibility comes from the
    server's being an active entity, capable of adapting to changing
    conditions, modifying its cached state, and responding to user directives.
    In this paper we present a shared library implementation based on OMOS, an
    Object/Meta-Object Server, which provides program linking and loading
    facilities as a special case of generic object instantiation.  We discuss
    the architecture of OMOS and its support of module binding primitives,
    which make it more flexible and powerful than existing shared library
    schemes.  Since our design does not require any support from the compiler,
    it is also language-independent and highly portable.  Initial performance
    results, on two operating systems, show an average speedup of 20% (range 0
    - 56%), on short running programs.", 
  location     = "https://www.cs.utah.edu/flux/papers/shlibs.html"
}

@InProceedings{tsaas,
  author       = "Fowler, Glenn",
  title        = "The Shell as a Service",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "267--277",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "remote execution, make, ksh, libraries",
  abstract     = "This paper explores the design history of the nmake shell
    coprocess. Originally a special purpose uniprocessor executor, the coshell
    has evolved into a general purpose service that automatically executes
    shell actions on lightly loaded hosts in a local network.  A major thrust
    of this work has been ease of use.  The only privilege required for
    installation, administration or use is rsh access to the local hosts.
    nmake and GNU-make users can take advantage of network execution with no
    makefile modifications.  Shell level access is similar to but more
    efficient than rsh and allows host expression matching to replace the
    explicit host name argument.  Also provided is a C programming library
    interface with five primitive operations that follow the fork-exec-wait
    process model.  Beside the speedups attained by parallelizing computations
    in a homogeneous network, coshell also supports heterogeneous
    configurations.  This presents novel solutions to traditional
    cross-compilation problems.  It also allows the user to view a new network
    host as a compute engine rather than yet another architecture on which to
    port the home environment and tools.  coshell runs on most S5R4 and BSD
    UNIX* operating system variants.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/shell-service"
}

@InProceedings{abruu,
  author       = "Aky{\" u}rek, Sedat and Salem, Kenneth",
  title        = "Adaptive Block Rearrangement Under " # unix,
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "307--321",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "disk performance, adaptive block management, organ-pipe configuration",
  abstract     = "An adaptive UNIX disk device driver is described.  The driver
    copies frequently-referenced blocks from their original locations to
    reserved space near the center of the disk to reduce seek times.  Reference
    frequencies need not be known in advance.  Instead, they are estimated by
    monitoring the stream of arriving requests.  Measurements show that the
    adaptive driver reduces seek times by more than half, and improves response
    times significantly.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/adaptive-block-rearrangement-under-unix"
}

@InProceedings{sapfsftc5,
  author       = "LoVerso, Susan~J. and Isman, Marshall and Nanopoulos, Andy and Nesheim, Bill and Milne, Ewan and Wheeler, Rick",
  title        = "{\it sfs\/}:  A Parallel File System for the {CM}-5",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "291--304",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "parallel i/o, connection machines, file systems, large files,
    i/o performance",
  abstract     = "This paper describes the creation of a Unix-compatible file
    system with highly scalable performance and size.  The file system is on
    the CM-5 backed by a scalable array of disks.  Using the Unix file system
    (UFS) from the SunOS 4.1.2 kernel as a base and modifying it to support
    Connection Machine (CM) operations, we have created a new file system, the
    scalable file system, or sfs.  We discuss the CM operations we support,
    such as parallel reads and writes to the processing nodes of the Connection
    Machine, the use of NFS to support many partitions of processing nodes on
    the CM, support for very large file sizes (64-bit) and support for odd
    numbers of disk drives.  The tradeoffs and decisions made during the course
    of this project as well as performance data for varying numbers of disk
    drives are provided.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/sfs-parallel-file-system-cm-5"
}

@InProceedings{aulrfs,
  author       = "Glenn Fowler and Yennun Huang and David Korn and Herman Rao",
  title        = "{A} User-Level Replicated File System",
  booktitle    = usenixs93,
  year         = 1993,
  pages        = "279--290",
  address      = cioh,
  month        = "21--25 " # jun,
  keywords     = "file replication, user-level file systems, resilience, recovery",
  abstract     = "This paper describes a replication mechanism called
    nDFS/REPL, which is built inside the Multiple Dimension File System (nDFS).
    Layered on top of physical file systems, nDFS/REPL substantially increases
    the reliability and availability of physical file systems by replicating
    files located on one physical file system onto another physical file system
    at run time.  Implemented at the user level, the system supports Kernel
    Independence and Application Transparency in that the semantics and syntax
    of system calls are preserved; thus, no kernel modification and application
    re-compilation are needed.  To avoid replicating temporary files, nDFS/REPL
    introduces a new notion---a replicated tree---by which users are able to
    define one or more subtrees of a file system that need to be replicated
    Replicated trees are maintained by a user-level, per-process name space.
    nDFS/REPL accesses underlying physical file systems using Unix system
    calls, rather than the actual access protocols.  Hence, it is easier to
    port the system to different platforms.  Finally, in conjunction with a
    process daemon, the system is resilient to a any single-point of failure,
    either software or hardware.  Applications are able to continue processing
    even when the backup physical file system is unreachable.  When the backup
    file system is available again, a recovery mechanism synchronizes it with
    the primary file system without terminating running applications.
    Preliminary testing result show approximately 10% overhead for replication
    on typical Unix tools.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1993-technical-conference/user-level-replicated-file-system"
}

@InProceedings{amafdtp,
  author       = "Michael Wayne Young and Dean~S. Thompson and Elliot Jaffe",
  title        = "{A} Modular Architecture for Distributed Transaction Processing",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "357--363",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "transactions, nested transactions, modularity, distributed systems",
  abstract     = "The prevalence of Unix system has made parallelism and
    distribution an attractive solutions for transaction processing.  The
    affordability of Unix systems makes them attractive both as intelligent
    front-end processors and as serious computation engines.  Unix systems have
    encouraged the construction of small tools that can be combined to solve
    larger problems.  Modular system components with open interfaces simplify
    the construction of efficient, reliable, distributed systems.  Standard
    operating systems interface are part of the solution.  Open, modular
    transaction processing interfaces are another important part.  Existing
    transaction systems fail to define clean interfaces for transaction
    management, communication, logging, locking and recovery.  Their
    communication protocols, recovery algorithms, and transaction management
    algorithms are deeply inter-related.  This complicates the implementation
    and makes interoperability with other systems more difficult.  The Transarc
    TP Toolkit is a highly modular set of transaction processing components
    that simplifies distributed systems programming.  At the core of the
    Toolkit is a distributed transaction management service, which coordinates
    the commitment of transactions that involve multiple applications.  This
    transaction management service defines strict interfaces to communication
    and recovery components.  The transaction management component is
    responsible solely for ensuring a consistent transaction outcome.  The
    communications component is responsible solely for the interaction with
    remote applications.  It may use any communication protocol, naming scheme,
    security model, or programming interface -- in particular, the underlying
    protocol does not need to contain the details of transaction management.
    The recovery component is responsible solely for maintaining local
    persistent resources, and may choose its ow locking or logging techniques.
    The Transarc TP Toolkit provides efficient implementations of these
    transaction management, communication, recovery, locking and logging
    services, many of them in small program libraries, on a variety of
    operating systems.  The Toolkit also includes C language support that makes
    it easy to write both transactional applications and recoverable server
    programs." 
}

@InProceedings{ebapmsfu,
  author       = "Dan Freedman",
  title        = "Experience Building a Process Migration Subsystem for " # unix,
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "349--355",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "process migration, state management",
  abstract     = "Process migration has been explored for a number of years as
    a means of achieving performance improvement in distributed computer
    systems through load balancing.  Due to the complexities inherent in the
    technique, most implementations have relied on the ability of an operating
    system to provide location-transparent addressing of computing resources
    (devices, memory, and so forth), so that these resources may be accessed
    easily by processes after they have been migrated.  This paper describes a
    process migration subsystem which takes a different approach.  It takes
    advantage of whatever location-transparent addressing facilities the
    operating system provides, however where not available it gives processes
    the opportunity to make their own arrangements.  Under this implementation,
    process migration is not transparent, but rather relies on active
    co-operation between processes and the migration subsystem itself.  Using
    this co-operative strategy, it has been possible to develop an effective
    process migration scheme for Unix without modifications to the Unix kernel.
    Although applications wishing to take advantage of the process migration
    subsystem require some modifications, for many programs these are
    straightforward.  Under this subsystem, process migration is most
    transparent to processes which spend a large amount of time processing data
    in memory, and which use little in the way of operating system services.
    Some support is provided for processes which have to terminate and then
    re-establish connections with the operating system during process
    migration."
}

@InProceedings{dadssfs,
  author       = "Andy Bond and John~H. Hine",
  title        = "{DRUMS}:  {A} Distributed Statistical Server for {STARS}",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "335--348",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "distributed systems",
  abstract     = "STARS is a mechanism for providing distributed task
    allocation based on the demand for and supply of resources in a
    heterogeneous Unix workstation environment.  Previous work in this area has
    concentrated on either allocation of idle workstations or allocation
    strategies based on a single load sharing measure.  Our method of
    allocation attempts to model more closely the economics of resources in a
    typical distributed workstation environment.  A three-tiered approach is
    taken to solving the problem of allocation.  An abstract model provides a
    representation of both the availability of host's resources and the
    resource demands of tasks.  Given this common representation , we are able
    to use various allocation schemes to assign tasks to hosts.  These
    allocation schemes include static, dynamic, and adaptive methods.  To
    provide the information to the resource model, and eventually to the
    allocation mechanisms, a Distributed Resource MeasUrement Service is
    provided.  DRUMS is a robust and adaptive set of servers which roam the
    network, providing access to the statistical information about hosts and
    tasks.  Two sets of servers are used, repositories of replicated data and
    collectors of statistical measurements.  We examine the effectiveness of
    using such a dynamic service for maintaining resources measurement
    information.", 
  location     = "ftp://ftp.mcs.vuw.ac.nz/_mnt/doc/misc/dist.sys/papers/drums/usenix-drums.ps.Z"
}

@InProceedings{anuos,
  author       = "Peter Norwood",
  title        = "{A} {NonStop} " # unix # " Operating System",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "325--334",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "fault-tolerant systems, redundancy",
  abstract     = "Tandem's Integrity S2 is a fault-tolerant computer system
    providing the benefits of a standard Unix operating system.  The
    fault-tolerant capabilities of Integrity S2 are realized through a
    combination of hardware and software.  The hardware supports fault-tolerant
    operation through a variety of techniques including triple modular
    redundancy, duplexed hardware, and self-checking circuitry.  The operating
    system, NonStop-UX, is based on an AT&T Unix V.3 kernel.  It has been
    enhanced in a number of ways to improve the robustness of the Unix
    operating system and to support fault-tolerant system operation."
}

@InProceedings{tpousvr40,
  author       = "Campbell, Mard and Barton, Richard and Browning, Jim and Cervenka, Dennis and Curry, Ben and Davis, Todd and Edmonds, Tracy and Holt, Russ and Slice, John and Smith, Tucker and and Wescott, Rich",
  title        = "The Parallelization of " # unix # " {System V Release} 4.0",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "307--323",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "portability, multiprocessor operating systems, locking
    systems, spin locks, blocking locks",
  abstract     = "This document describes the fine-grained parallelization of
    the Unix system v release 4.0 kernel for a tightly-coupled symmetric
    multiprocessing machine.  Unlike most multithreading efforts performed
    using an existing single-threaded Unix base, this effort focused on
    altering as little source as possible during the initial port and then
    making algorithmic modifications only when a measured performance problems
    manifested itself.  This multiprocessing kernel (SVR4/MP) was designed,
    implemented, and tuned in a 9 month development cycle and met all of its
    scalability goals in a dyadic configuration.  Overall design strategy and
    locking primitives are discussed in this paper from a technical and
    schedule perspective; in addition, private data, and interprocessor
    communication are examined.  The multithreading strategy for each of
    several major subsystems is also examined.  All of this is followed by a
    performance and scalability analysis of other overall kernel for several
    different types of benchmarks on a prototype dyadic MC88000-based system" 
}

@InProceedings{aeiodpaio,
  author       = "A.~Lester Buck and Robert~A. {Coyne, Jr.}",
  title        = "An Experimental Implementation of Draft {POSIX} Asynchronous {I}/{O}",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "289--306",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "asynchronous i-o, unix, standards, high-performance i-o",
  abstract     = "As Unix moves into large systems environment, the need for an
    efficient asynchronous input/output (I/O) mechanism becomes more acute.  We
    review various designers' approaches, absent existing standards, to graft
    either non-blocking or fully asynchronous I/O capabilities onto Unix.  We
    then describe an experimental implementation of asynchronous event
    notification and asynchronous I/O for AIX/370 based on unapproved Draft 9
    of the POSIX 1003.4 standard.  Our goal is a high-performance I/O system
    that can efficiently handle hundreds of outstanding I/O operations in a
    single server process, with dozens of operations transferring data
    simultaneously.  We describe queuing structures, changes to standard kernel
    routines, and extensions to the device driver interface to integrate
    asynchronous functionality.  Our first implementation supports only raw
    transfers directly between devices and user buffers.  Issues of real memory
    consumption, page faults in interrupt context, write ordering semantics,
    security, asynchronous ioctl()s, and compatibility with select() are
    discussed." 
}

@InProceedings{aamfu,
  author       = "Matt Bishop",
  title        = "An Authentication Mechanism for {USENET}",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "281--288",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "usenet, authenticity, integrity, public key encryption,
    certificates, digital signatures",
  abstract     = "As Unix based systems become more ubiquitous, so does the
    international news network and bulletin board system USENET.  Like
    electronic mail, the USENET has no security whatsoever; forging articles,
    or altering posted articles in transit, is trivial.  In the past, this has
    not been a problem, but with the advent of authoritative news groups such
    as comp.bugs.4bsd-fixes (which contains official bug fixes and enhancements
    from Berkeley), the integrity and authenticity of some postings becomes
    paramount.  The Privacy and Security Research Group, working under the
    auspices of the Internet Research Steering Group, recently released a set
    of proposals to enhance the security of electronic mail.  One proposal adds
    to the existing mail handling structure by adding an extra layer of
    (security) processing between the transport and user agents; the second
    describes a certificate-based key distribution and management
    infrastructure for public key cryptosystems that supports the first.  This
    paper discusses the design of an addition to network news based upon the
    security enhancements being added to electronic mail.  It uses the same
    underlying key distribution and management infrastructure, so it does not
    require new key management protocols or software, but merely the
    integration of existing protocols.  Further, it is completely compatible
    with unauthenticated news, so it needs not be adopted wholesale, but can be
    employed on a site-by-site basis.  We also will discuss expected efficiency
    of the system.  We also contrast this scheme with some others such as the
    existing nntp authentication scheme and with the use of Kerberos.
    Advantages and disadvantages of the schema will be described.", 
  location     = "http://seclab.cs.ucdavis.edu/papers/mb91d.abs"
}

@InProceedings{upeci,
  author       = "Philip Heng Wai Leong and Chris Tham",
  title        = unix # " Password Encryption Considered Insecure",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "269--280",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "unix passwords, des, salting, authentication, cracking",
  abstract     = "Recently there has been a revival of interest in the security
    of the password encryption scheme employed in the Unix operating system and
    its derivatives.  This resurgence was due mainly to the success of an
    attack on the Internet by a virus program in November 1988.  The current
    encryption scheme used is a variant of the NBS data encryption standard
    (DES) modified in such a way that existing DES hardware implementations
    cannot be used.  There is currently no reported way of reversing the
    password encryption , i.e., to obtain a password from its encryption
    string.  In this paper, we show that the current encryption scheme can no
    longer be considered secure as most Unix passwords can be decrypted using a
    brute force search within a reasonable period of time.  As an example all
    passwords containing only lower case alphabetic characters can be decrypted
    in less than 15 days.  In order to perform a brute force search, we need
    the ability to encrypt a Unix password in the shortest time possible.
    Accordingly, we present a hardware design of a password encryption device
    that can encrypt a unfix password in 6 us.  This device consists of
    approximately 100 Emitter Coupled Logic (ECL) chips and can be built by any
    electronic hobbyist for less than $2000.  The board can also be used to
    encrypt DES at 266 Mbps, more than ten times faster than a recent CMOS VLSI
    design.  We also present a software only implementation of the encryption
    algorithm recoded for maximum speed.  This implementation can encrypt a
    Unix password in 1.2 ms on an IBM rs/6000 Model 530 machine." 
}

@InProceedings{lotkas,
  author       = "Bellovin, S.~M. and Merritt, M.",
  title        = "Limitations of the {Kerberos} Authentication System",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "253--267",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "kerberos, context, reply attacks, secure times services,
    password-guessing attacks, ticketing, session keys, encryption hardware",
  abstract     = "The Kerberos authentication system, a part of MIT's Project
    Athena, has been adopted by other organizations.  Despite Kerberos's many
    strengths, it has a number of limitations and some weaknesses.  Some are
    due to specifics of the MIT environment; others represent deficiencies in
    the protocol design.  We discuss a number of such problems, and present
    solutions to some of them.  We also demonstrate how special-purpose
    cryptographic hardware may be needed in some cases." 
}

@InProceedings{aepafasn,
  author       = "Marc~E. Fiuczynski and Brian~N. Bershad",
  title        = "An Extensible Protocol Architecture for Application-Specific Networking",
  booktitle    = pot # "Winter 1996 USENIX Conference",
  year         = 1996,
  pages        = "55--64",
  address      = sdca,
  month        = "22--26 " # jan,
  keywords     = "spin, protocol access, protocol graphs, packet handling,
    application-specific protocols",
  abstract     = "Plexus is a networking architecture that allows applications
    to achieve high performance with customized protocols.
    Application-specific protocols are written in a typesafe language and
    installed dynamically into the operating system kernel.  Because these
    protocols execute within the kernel, they can access the network interface
    and other operating system services with low overhead.  Protocols
    implemented with Plexus outperform equivalent protocols implemented on
    conventional monolithic systems.  Plexus runs in the context of the SPIN
    extensible operating system.",
  location     = "http://www-spin.cs.washington.edu/papers/Usenix96/extprotarch.ps"
}

@InProceedings{tpfsapmiusv,
  author       = "Roger Faulkner and Ron Gomes",
  title        = "The Process File System and Process Model in " # unix # " System {V}",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "243--252",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "signals, pseudo-file systems, process models, event
    management, process control, debugging",
  abstract     = "We describe the process file system /proc in Unix System V
    Release 4 and its relationship to the Unix process model abstraction.
    /proc began as a debugger interface superseding ptrace(2) but has evolved
    into a general interface to the process model.  It provides detailed
    process information and control mechanisms that are independent of
    operating system implementation details and portable to a large class of
    real architectures.  Control is thorough.  Processes can be stopped and
    started on demand and can be instructed to stop on events of interest:
    specific machine faults, specific signals, and entry to or exit from
    specific system calls.  Complete encapsulation of a process's execution
    environment is possible, as well as non-intrusive inspection.  Breakpoint
    debugging is relieved from the ambiguities of signals.  Security provisions
    are complete and non-destructive.  The addition of multi-threading to the
    process model motivates a proposal for a substantial change to the /proc
    interface that would replace the single-level flat structure with a
    hierarchy of directories containing status and control files.  This
    restructuring would eliminate all ioctl(2) operations in favor of read(2)
    and write(2) operations, which generalize more easily to networks." 
}

@InProceedings{otiauef,
  author       = "Axel Mahler",
  title        = "Organizing Tools in a Uniform Environment Framework",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "231--242",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "object-based frameworks, tool-based frameworks, command
    interfaces, type systems, object shell, object access, attribute store",
  abstract     = "The Unix tool-collection provides an excellent platform for
    software development.  The mere existence of literally hundreds of
    different tools for all sorts of activities makes the Unix toolbox one of
    the most effective software development environments around.  However, all
    these tools are independent from each other, solitary in design, and thus
    are poorly integrated.  It has often been argued that the vast number of
    tools, all with different sorts of options, and different command sets
    makes Unix sometimes hard to use - even for experienced programmers.  Well,
    it's not exactly hard to use the Unix environment, it's more that the
    potential of the environment is often not well enough developed.  Users ten
    to use only a fraction of the possible benefits that the tool-system
    offers.  The concept of an object oriented command-interface provides a
    rather simple but powerfully solution for this problem.  It allows to
    integrate about any Unix tool into a coherent software development
    environment framework.  While training the familiar concept of
    Unix-commands, the system allows to offer functionality, implemented by
    tools or tool-combinations, in a uniform and consistent way at the user
    interface level.  This is achieved by enhancing the notion of files to that
    of software objects.  Software objects are different from files in that
    they have type as a basic property.  Type-specific functionality is
    centered around these software objects in an object oriented fashion The
    user accesses software objects and related tool functionality, represented
    as methods, through the object-shell(OShell), a command interpreter that
    makes consequent use of the underlying type system.  The object-shell
    together with a powerful type definition language provide the potential to
    further develop the vast tool capabilities of the Unix system by organizing
    functionality abound classes of software objects with varying degrees of
    specialization.  The possibility to build class-based abstractions for a
    concrete environment allows to integrate characters of the work process
    with the environment itself." 
}

@InProceedings{aftaso,
  author       = "Andreas Lampen",
  title        = "Advancing Files to Attributed Software Objects",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "219--229",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "software engineering environments, version history, file
    management, attribute stores, ",
  abstract     = "The system described in this paper is part of the kernel of a 
    Unix-based generic software engineering environment (SEE) that is open to
    extension and integration by new and existing tools.  Tool integration is
    based on software objects in the sense of identifiable and controllable
    information units evolving during software development.  AtFS (Attributed
    File System) extends the Unix file system to be a software-object
    repository.  AtFS began as part of the shape-toolkit, a collection of
    programs supporting version control and software configuration management.
    AtFS key issues were the ability to store multiple file versions, a
    mechanism for attaching application-defined attributes to each version, and
    nonunique identification of versions by any attributes.  It provides a
    consistent view of attributed software objects (ASOs) that can either be
    immutable saved versions or regular Unix files.  When adapting AtFS to be
    part of a generic SEE, additional requirements caused conceptual
    extensions.  The notion of attributed software objects is extended, beside
    file versions, to histories and directories.  A concept for object
    identity, coming along with persistent unique identifiers for ASOs is
    introduced.  The attribution mechanism is extended to typed and structured
    application defined attributes.  The conceptual extensions lead to a new
    AtFS implementation, supporting network distributed management of ASOs and
    featuring a revised interface designed in an object-oriented manner."
}

@InProceedings{ahanfs,
  author       = "Anupam Bhide and Elmootazbellah~N. Elnozahy and Stephen~P. Morgan",
  title        = "A Highly Available Network File Server",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "199--205",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "redundancy, reliability, nfs, logs, fail-over systems, divide
    and conquer",
  abstract     = "This paper presents the design and implementation of a Highly
    Available Network File Server (HA-NFS).  We separate the problem of network
    file server reliability into three different subproblems: server
    reliability, disk reliability, and network reliability.  HA-NFS offers a
    different solution for each: dual-ported disks and impersonation are used
    to provide server reliability, disk mirroring can be used to provide disk
    reliability, and optional network replication can be used to provide
    network reliability.  The implementation shows that HA-NFS provides high
    availability without the excessive resource overhead or the performance
    degradation that characterize traditional replication methods.  Ongoing
    operations are not aborted during fail-over and recovery is completely
    transparent to applications.  HA-NFS adheres to the NFS protocol standard
    can be used by existing NFS clients without modification.",
  location     = "ftp://cs.rice.edu/public/hanfs/usenix-91.ps.gz"
}

@InProceedings{to1ufu,
  author       = "Susan~J. LoVerso and Noemi Paciorek and Alan Langerman and George Feinberg",
  title        = "The {OSF}/1 " # unix # " Filesystem ({UFS})",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "207--218",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "multi-threaded file systems, locking protocols, timestamping,
    soft state caching, synchronization, virtual file systems, directory
    operations",
  abstract     = "The OSF/1 Unix file system (UFS) originated from the Berkeley
    4.3-Reno distribution local file system code combined with parallelization
    modifications by Encore Computer Corporation.  The Berkeley project
    concentrated exclusively on a uniprocessor implementation while previous
    Encore projects focused only on multiprocessor implementations, OSF/1, on
    the other hand, must run efficiently in both environments.  This paper
    presents an overview of the parallelized OSF/1 Unix file system and
    describes the rationale behind the changes we made.  We discuss the
    addition of timestamps to optimize the single-stream performance of
    important, parallelized UFS algorithms.  We also describe several
    interesting race conditions resulting from our new UFS locking protocols
    and the introduction of timestamps." 
}

@InProceedings{eptnsm,
  author       = "Robert~K. Israel and Anthony~W. Foster and Arun Taylor and Tracy~M. Taylor and Neil Webber",
  title        = "Evolutionary Path to Network Storage Management",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "185--198",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "file migration, storage hierarchy, backup management, network
    file systems",
  abstract     = "A major problem facing network administrators and users today
    is the management of network storage.  Storage demands continue to increase
    as more powerful workstations become available and more sophisticated
    applications are developed for those workstations.  Storage management
    tools have not kept pace with the proliferation of disk storage on
    workstation networks or with the increased power and number of workstations
    on the typical network.  Network administrators and workstation users are
    now faced with the problem of backing up network station disks, archiving
    old data when these disks fill up, and locating data distributed around a
    network.  In this paper we describe a storage management architecture,
    called the InfinteStorage Architecture, that defines an evolutionary
    approach to automating the storage management of networked Unix
    environments.  This architecture provides for the management of several
    types of storage, e.g., magnetic and optical disks, tape, etc., in a
    storage hierarchy such that data anywhere on the network can be backed up
    and automatically moved to optimize the trade-off between cost and
    accessibility.  The implementation of a primary element of this
    architecture, the Renaissance InfinteStorage Manager, is described in
    detail.  Based on the IEEE Mass Storage Reference Model, the InfinteStorage
    Manager uses a mass storage server as a backing store for magnetic disks
    attached to workstations and workgroup servers on a network.  The contents
    of the least recently used file and the network are automatically migrated
    to the storage server while the transparency of access is preserved." 
}

@InProceedings{plio1,
  author       = "Larry~W. Allen and Harminder~G. Singh and Kevin~G. Wallace and Melanie~B. Weaver",
  title        = "Program Loading in {OSF}/1",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "145--160",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "linking, loading, symbol resolution, object-file format,
    kernel module, dynamic loading",
  abstract     = "In recent years, program loading facilities in Unix have
    become more advanced.  Support for position independent relocatable shared
    libraries can be found in several Unix systems today.  For OSF/1, we have
    designed and implemented a program loader with several important new
    abilities.  In addition to supporting shared libraries, it supports
    callable loading and unloading of object modules, a flexible symbol
    resolution policy based on packages, and loading and unloading of kernel
    modules.  Moreover, the loader supports object file formation independence,
    through use of a loader switch.  Here, we present an overview of an OSF/1
    program loader, describing its major features and capabilities.  We present
    design decisions and trade-offs we made in implementing the loader, with
    special emphasis on key issues such as symbol resolution policy, object
    file format independence, and the loader support required for loading of
    kernel modules." 
}

@InProceedings{cfssficwtuc,
 author       = "Alastair Fyfe and Ivan Soleimanipour and Vijay Tatkar",
 title        = "Compiling from Saved State: Fast Incremental Compilation with Traditional " # Unix # " Compilers",
 booktitle    = usenixw91,
 year         = 1991,
 pages        = "161--171",
 organization = "USENIX Association",
 address      = date,
 month        = "21--25 " # jan, 
 keywords     = "persistent data storage, compilation state, persistent
   compiler state, pre-compilation, recompilation, compilation server",
 abstract = "We describe a strategy for extending traditional Unix
   compilers that enables them to be used in new ways, notably as adjuncts of
   interactive tools such as a debugger and a function-level recompilation
   tool. The compilers' translation of source to intermediate representation
   is reused without significant change and two new capabilities are added to
   each compiler: saved-state capability and compile-server capability. We
   use the term saved-state compiler to refer to a compiler capable of storing
   the context information built up during compilation and later retrieving
   the stored data, reconstructing the earlier context, and performing further
   compilation. This capability allows a compiler to quickly reestablish a
   particular compilation context without needing to reprocess declarations in
   the program's source. The context information required for compilation is
   saved in a special-purpose Symbol Information Database (SID) stored in ELF
   files and retrieved by the compiler on demand. SID information is useful
   to tools other than the compiler, and thus may also be accessed by
   debuggers, performance analyzers and other tools. We use the term compile
   server to describe a compiler which supports interfaces better suited to
   interprocess communication than traditional Unix command-line invocation.
   By adapting a compiler to support RPC and shared memory, it is possible to
   minimize the overhead of using the compiler as an adjunct of another tool,
   such as the debugger. In this paper we describe the steps involved in
   adding saved-state and compiler-server capabilities to two
   production-quality compilers and a preprocessor, discuss three applications
   of this technology, and gives measurements based on the current
   implementation." 
}

@InProceedings{anhpfu,
  author       = "Margo Seltzer and Ozan Yigit",
  title        = "{A} New Hashing Package for " # unix,
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "173--184",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "dynamic hashing, library design",
  abstract     = "UNIX support of disk oriented hashing was originally provided
    by dbm and subsequently improved upon in ndbm.  In AT&T System V, in-memory
    hashed storage and access support was added in the hsearch library
    routines.  The result is a system with two incompatible hashing schemes,
    each with its own set of shortcomings.  This paper presents the design and
    performance characteristics of a new hashing package providing a superset
    of the functionality provided by dbm and hsearch.  The new package uses
    linear hashing to provide efficient support of both memory based and disk
    based hash tables with performance superior to both dbm and hsearch under
    most conditions.", 
  location     = "https://www.eecs.harvard.edu/margo/papers/usenix91/"
}

@InProceedings{aaamspl,
  author       = "Henry Spencer",
  title        = "{\it awk\/} as a Major Systems Programming Language",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "137--143",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "text formatting, parsing, awk",
  abstract     = "Even experienced Unix programmers often don't know awk, or
    know it but view it has a counterpart of sed: useful glue for sticking
    things together in shell programming, but quite unsuited for major
    programming tasks.  This is a major underestimate of a very powerful tool,
    and has hampered the development of support software that would make awk
    much more useful.  There is no fundamental reason why awk programs have o
    be small glue programs: even the old awk is a powerful programming language
    in its own right.  Effective use of its data structures and its
    stream-oriented structure takes some adjustments for C programmers, but the
    results can be quite striking.  On the other hand, getting there can be a
    bit painful, and improvements in both the language and its support tools
    would help." 
}

@InProceedings{uicbopases,
  author       = "Toshiyuki Masui",
  title        = "User Interface Construction Based on Parallel and Sequential Execution Specifications",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "117--125",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "linda, regular expressions, ui development",
  abstract     = "The user interface part of an application program can be easily and compactly constructed by combining the parallel execution primitive Linda and the stat transition description language Flex with a general purpose programming language.  With this approach, a wide range of interfaces can be constructed without using I/I-specific languages or systems.  Using these tools, parallel execution, separate/communication between the application and the interface part, and complicated dialogs can easily be specified.  In our implementation, the specification is compiled into C++ and runs efficiently without any run-time system."
}

@InProceedings{hmtfbdoas,
  author       = "Stephen~A. Uhler",
  title        = "{\$\sc Home Movie} --- Tools for Building Demos on a {Sparcstation}",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "127--136",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "screencasts, multimedia editing, demo software",
  abstract     = "Home Movie is a suite of tools for the capture, editing and
    playback of window system sessions on a Sun Sparcstation.  It includes ISDN
    voice quality audio, video, and a VCR-like user interface.  At any time
    while the demo system is running, a recording may be started, generating a
    complete log or script that captures the changes to the display.
    Simultaneously, an audio script is generated, contain any verbal
    descriptions, or sounds present.  Once these recordings have been made,
    they can be re-arranged, edited, annotated or set to music, using the Home
    Movie sound and image editing tools.  The resulting movie can be played
    back on the display in real time, and thus provides a convenient way to
    document and demonstrate interactive software systems." 
}

@InProceedings{axtbottl,
  author       = "John~K. Ousterhout",
  title        = "An {X11} Toolkit Based on the {Tcl} Language",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "105--115",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "tcl, tk, toolkits, extension languages, user interfaces, x
    window system",
  abstract     = "This paper describes a new toolkit for X11 called Tk.  The
    overall functions provided by Tk are similar to those of the standard
    toolkit Xt.  However, Tk is implemented using Tcl, a lightweight
    interpretive command language.  This means that Tk's functions are
    available not just from C code compiled into the application but also via
    Tcl commands issued dynamically while the application runs.  Tcl commands
    are used for binding keystrokes and other events to application-specific
    actions, for creating and configuring widgets, and for dealing with
    geometry managers and the selection.  The use of an interpretive language
    means that any aspect of the user interface may be changed dynamically
    while an application executes.  It also means that many interesting
    applications can be created without writing any new C code, simply by
    writing Tcl scripts for existing applications.  Furthermore, Tk provides a
    special send command that allows any Tk-based application to invoke Tcl
    commands in any other Tk-based application.  Send allows applications to
    communicate in more powerful ways than a selection mechanism and makes it
    possible to replace monolithic applications with collections of reusable
    tools.", 
  location     = "https://wiki.tcl.tk/39305"
}

@InProceedings{smta,
  author       = "Mike~L. Powell and Steven~R. Kleiman and Steven Barton and Devang Shan and Danial~A. Stein and Mary Weeks",
  title        = "{SunOS} Multi-thread Architecture",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "65--79",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "threading, system-call interface, address-space protection, 
    page-fault handlers, signal handling, portability, re-entrant code",
  abstract     = "We describe a model for multiple threads of control within a
    single UNIX process.  The main goals are to provide extremely lightweight
    threads and to rationalize and extend the UNIX Application Programming
    Interface for a multithreaded environment.  The threads are intended to be
    sufficiently lightweight so that there can be thousands present and that
    synchronization and context switching can be accomplished rapidly without
    entering the kernel.  These goals are achieved by providing lightweight
    user-level threads that are multiplexed on top of kernel-supported threads
    of control.  This architecture allows the programmer to separate logical
    (program) concurrency from the required real concurrency, which is
    relatively costly, and to control both within a single programming model.", 
  location     = "https://link.springer.com/chapter/10.1007/978-1-4612-3192-9_24"
}

@InProceedings{lltt43riotnp,
  author       = "Rick Macklem",
  title        = "Lessons Learned Tuning the {4.3BSD} {Reno} Implementation of the {NFS} Protocol",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "53--64",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "nfs, caching, transport protocol, performance, 4.3bsd reno,
    client-server communication",
  abstract     = "Since its introduction by Sun Microsystems in 1986, the NFS
    protocol has become the defacto standard distributed ﬁle system protocol
    for Unix based workstations.  Most of these Unix implementations are based
    on the reference port provided by Sun Microsystems.  Research published to
    date on NFS performance has focused on the problems of NFS server write
    performance and NFS server performance characterization.  This paper
    discusses other performance and implementation aspects of NFS observed
    while tuning a rather different implementation of the Sun NFS protocol for
    Unix.  Aspects of performance related to differences in caching mechanisms,
    the use of different RPC transport protocols and techniques that minimize
    memory to memory copying are explored.  In particular, the notion that TCP
    transport would provide unacceptable performance for NFS RPCs is shown to
    be unfounded.", 
  location     = "http://www.coredumps.de/doc/nfs/Lessons_Learned_Tuning_the_4.3BSD_Reno_Implementation_of_the_NFS_Protocol.ps"
}

@InProceedings{btclwuiamtf,
  author       = "Michael~B. Jones",
  title        = "Bringing the {C} Libraries With Us Into a Multi-Threaded Future",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "81--91",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "portability, locking strategies, cache synchronization,
    signal handling, re-entrancy, compilation",
  abstract     = "An enormous amount of UNIX (and UNIX-like) code has been
    written (by a likewise enormous amount of programmers) that uses the
    standard C libraries.  Use is made throughout much of this code of the
    knowledge that traditional UNIX programs have exactly one thread of
    control.  However, increasing numbers of UNIX-like systems are beginning to
    provide support for programs with multiple threads of control.  To the
    extent possible, it is highly desirable to preserve the existing C library
    interfaces for multi-threaded programs; this will aid both in code and
    programmer portability between traditional UNIX environments and new
    multithreaded ones.  A number of issues must be confronted in order to
    produce versions of the C libraries which can be used in multi-threaded
    programming environments.  Among these are: functions with non-reentrant
    interfaces, functions which maintain state between invocations, use of
    macros in the library interfaces, interactions with signals, compatibility
    with single-threaded library data structures, performance issues, and of
    course, errno.  Despite these and other problems, experience has shown that
    reasonable solutions are available.  This paper presents both a detailed
    explanation of the problems inherent in producing multi-thread-safe C
    libraries and the different solutions which are available.  Finally, the
    solutions to these problems adopted by a number of research and industry
    groups are presented." 
}

@InProceedings{atbprtfbu,
  author       = "Keith Sklower",
  title        = "A Tree-Based Packet Routing Table for {Berkeley} " # unix,
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "93--103",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "routing lookups, dictionary data structures, arp, hierarchy",
  abstract     = "Packet forwarding for OSI poses strong challenges for routing
    lookups: the algorithm must be able to efficiently accommodate variable
    length, and potentially very long addresses.  The 4.3 Reno release of
    Berkeley UNIX † uses a reduced radix tree to make decisions about
    forwarding packets.  This data structure is general enough to encompass
    protocol to link layer address translation such as the Address Resolution
    Protocol (ARP), and the End System to Intermediate System Protocol (ES−IS),
    and should apply to any hierarchical routing scheme, such as source and
    quality-of-service routing, or choosing between multiple Datakits on a
    single system.  The system uses a message oriented mechanism to communicate
    between the kernel and user processes to maintain the routing database,
    inform user processes of spontaneous events such as redirects, routing
    lookup failures, and suspected timeouts through gateways.", 
  location     = "http://www1.cs.columbia.edu/~ji/F02/ir04/routing.pdf"
}

@InProceedings{sfcshgm,
  author       = "Carl Staelin and Hector Garcia-Molina",
  title        = "Smart Filesystems",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "45--51",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "disk performance, file systems, disk clustering, adaptive
    file storage",
  abstract     = "Over the last few years tremendous strides have been made in
    CPU performance without corresponding strides in i-o performance.
    Consequently, future operating systems must be redesigned to minimize the
    impact of the i-o bottleneck.  We present the concept of a smart filesystem
    as one that can dynamically and automatically tune itself to improve
    performance based on file access statistics it collects.  We describe the
    iPcress File System, a prototype smart filesystem, and demonstrate a simple
    implementation of a disk data clustering technique.  With this approach,
    active data is placed near the center of the disk, reducing seek times."
}

@InProceedings{elpfaufs,
  author       = "Larry~W. McVoy and Steve~R. Kleiman",
  title        = "Extent-Like Performance from a " # unix # " File System",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "33--43",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "file systems, performance, extent-based file systems, disk
    behavior, vm buffering",
  abstract     = "In an effort to meet the increasing throughput demands on the
    SunOS file system made both by applications and higher performance
    hardware, several optimization paths were examined.  The principal
    constraints were that the on-disk file system format remain the same and
    that whatever changes were necessary not be user-visible.  The solution
    arrived at was to approximate the behavior of extent based file systems by
    grouping I/O operations into clusters instead of dealing in individual
    blocks.  A single clustered I/O may take the place of 15-30 block I/Os,
    resulting in a factor of two increased sequential performance increase.
    The changes described were restricted to a small portion of the file system
    code; no user-visible changes were necessary and the on-disk format was not
    altered." 
}

@InProceedings{pmatcohos,
  author       = "Nick Vasilatos",
  title        = "Partitioned Multiprocessors and The Coexistence of Heterogeneous Operating System",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "23--32",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "multi-os systems, multiprocessors, system boot, system
    multiplexing, inter-system communication",
  abstract     = "This presents a variety of issues arising from the alpha
    Research Group at Concurrent's effort to develop a means of partitioning an
    SMP computer system so as to share it between multiple (widely different)
    operating systems.  A simple (minimalistic) mechanism for hosting multiple,
    (largely unmodified) heterogeneous operating systems and providing a
    unified programming environment inclusive of the facilities of both is
    presented.  Basic motivation for the undertaking are discussed in the
    context of our research and development effort -- primarily aimed at
    developing alpha, a new object-oriented, distributed, real-time operating
    system, which has generated significant secondary requirements for
    communicating with the external world, generating and controlling displays,
    file and device I/O and other facilities all of which are well developed
    and widely available on traditional (UNIX) operating system platforms.
    Technical aspects of the mechanism -- dubbed alpha/TMM -- for Trivial
    Machine Monitor, are presented as are details of the OS level RPC
    facilities providing process/thread level communication between hosted
    operating systems over a TMM provided transport channel.  Architectural
    alternatives to the alpha/TMM approach are discussed including fully robust
    virtual monitors and contemporary micro-kernel/OS-server designs.  Finally
    our approach is assessed relative to alternatives and trad-offs dictated by
    the particulars of alpha and our development requirements." 
}

@InProceedings{asgmkboulipac,
  author       = "Marc Guillemont and Jim Lipkis and Doug Orr and Marc Rozier",
  title        = "{A} Second-Generation Micro-Kernel Based on " # unix # "; Lessons in Performance and Compatibility",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "13--22",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "microkernels, ipc, message passing, unix servers, chorus,
    real-time systems, device management",
  abstract     = "An important trend in operating systems development is the
    restructuring of the traditional monolithic OS kernel into independent
    servers running on top of a minimal nucleus or microkernel.  This approach
    rises but of the need for modularity and flexibility in managing
    ever-growing complexity caused by new functions and new architectures.  In
    particular, it provides a solid architectural basis for distribution, fault
    tolerance, and security.  Microkernel-based operating systems have been a
    focus of research for a number of years, and are now beginning to play a
    role in commercial Unix systems.  However, the ultimate feasibility of this
    attractive approach is not yet widely accepted.  A primary concern is
    efficiency: can a microkernel-based modular OS provide performance
    comparable to that of a monolithic kernel -- at least when running on a
    monolithic architecture? The elegance and flexibility of the client-server
    model may extract cost in message-handling and context-switching overhead.
    If this penalty is to great, commercial acceptance will be limited.
    Another pragmatic concern is compatibility: in an industry relying
    increasing on portability and standardization, compatible interfaces are
    needed not only at the level of application programs, but also for device
    drivers, streams modules, and only at the level of application programs,
    but also for device drivers, streams modules, and other components.  In
    many cases binary as well as source compatibility is required.  These
    concerns affect the structure and organization of the operating system.
    The Chorus team has spent the past six years studying and experimenting
    with Unix kernelisation as an aspect of its work in modular distributed and
    real-time systems.  In this paper we examine aspects of the current Chorus
    system in terms of its evolution from the previous version.  Our focus is
    on pragmatic issues such as performance and compatibility, as well as
    considerations of modularity and software engineering." 
}

@InProceedings{ppapmsfne,
  author       = "David~I. Black",
  title        = "Processors, Priority, and Policy:  Mach Scheduling for New Environments",
  booktitle    = usenixw91,
  year         = 1991,
  pages        = "1--12",
  organization = "USENIX Association",
  address      = date,
  month        = "21--25 " # jan, 
  keywords     = "multiprocessor scheduling, microkernels, mach, user-level
    system servers, scalability, heterogeneity, policy and mechanism",
  abstract     = "Changing hardware and software environments require
    alternatives to the timesharing scheduling policies supported by Unix,
    Mach, and similar systems.  Effective use of multiprocessors and
    multicomputer architectures often requires dedicating processors to some
    applications.  Complex real-time applications demand the level of services
    available in a Unix-like environment, but such applications cannot be
    timeshared.  These and other new environments require alternatives to the
    traditional timesharing scheduling model.  This paper describes scheduling
    techniques that enable the Mach operating system to support new application
    environments.  Mach's processor allocation facility supports dedicating
    processors to applications.  Removing allocation decisions from the kernel
    and implementing them in a separate server allows a single kernel to
    support a wide variety of allocation policies and application environments.
    The Mach system also supports scheduling policy alternatives to
    timesharing.  Fixed priority scheduling is currently implemented for use in
    real-time environments, and the design of the kernel interface permits
    additional policies to be added.  These facilities are designed to work
    together, given an application complete control over scheduling of
    processors dedicated to it.  Appendices to this paper describe the
    interfaces to both the kernel and a simple gang-scheduling server" 
}

@InProceedings{tiaoiwtxws,
  author       = "Nancy Crowther and Joyce Graham",
  title        = "{TCP}/{IP} and {OSI} Interoperability with the {X Window System}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "243--253",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "osi protocols, tcp/ip, x windows system, gateways, gosip,
    portability, interoperability, standards",
  abstract     = "Network users have to migrate applications from TCP/IP to the
    emerging Open Systems Interconnection (OSI) protocols.  Application
    migration can be done by rewriting them to use OSI, or switching to new
    applications, or using a gateway between TCP/IP- and OSI-based
    applications.  This paper describes how IBM's Cambridge Scientific Center
    migrated a distributed application, the X Window System, and how the
    migration techniques could be used for other applications.  The draft ANSI
    standard mapping X to OSI is explained.  The changes made to the X Window
    System to support OSI and an X TCP-OSI gateway are described.  The best
    migration technique was extending the socket library to support OSI at
    multiple layers.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/presentation/tcpip-and-osi-interoperability-x-win"
}

@InProceedings{tddidsp,
  author       = "Stephen~R. Snapp and Stephen~E. Smaha and Daniel~M. Teal and Tim Grance",
  title        = "The {DIDS (Distributed Intrusion Detection System)} Prototype",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "227--233",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "intrusion detection systems, distributed intrusion detection
    systems, expert systems, network monitoring, security, identification",
  abstract     = "Intrusion detection is the problem of identifying
    unauthorized use, misuse, and abuse of computer systems by both system
    insiders and external penetrators.  The growth in numbers and complexity of
    heterogeneous computer networks provides additional implications for the
    intrusion detection problem.  In particular, the increased connectivity of
    computer systems gives greater access to outsiders, and makes it easier for
    intruders to avoid detection.  We are designing and implementing a
    prototype Distributed Intrusion Detection System (DIDS) that combines LAN
    distributed monitoring and data reduction (through individual Host and LAN
    Monitors) with centralized data analysis (through the DIDS Director) in
    order to monitor a heterogeneous network of computers.  This approach is
    unique among current intrusion detection systems.  One of the problems
    considered in this paper is the Network-user Identification (NID) problem,
    which is concerned with tracking a user moving across the network, possibly
    with a new user-id on each computer.  Initial prototypes system have
    provided quite favorable results problem on both the NID problem and the
    detection of other attacks on a network.  This paper provides an overview
    of the motivation behind DIDS, the system architecture and capabilities,
    and a discussion about the implementation of the system prototype.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/dids-distributed-intrusion-detection-system"
}

@InProceedings{apmfusvr4os,
  author       = "Charles Salemi and Suryakanta Shah and Eric Lund",
  title        = "{A} Privilege Mechanism for " # UNIX # " {System V Release} 4 Operating Systems",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "235--241",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "privilege assignment, privilege assignment",
  abstract     = "Any multi-user, multi-tasking operating system, such as the
    UNIX SVR4 Operating System must provide protection mechanisms that prohibit
    one user from interfering with another user, or limit the execution of
    certain system operations that affect critical system resources.  These
    protection mechanisms also must provide the ability to override these,
    restrictions commonly referred to as privilege.  For years, over twenty
    UNIX-based operating systems have had one such privilege, called root or
    super-user which is signified by a process whose effective user ID is 0.
    The super-user has the ability to override the restrictions imposed by
    these protection mechanisms.  In the UNIX System V Release 4 Enhanced
    Security product this single, omnipotent privilege is divided into a set of
    discrete privileges designed to assure that sensitive system services
    execute with the minimum amount of privilege required to perform the
    desired task.  This paper describes the privilege control mechanism
    implemented as part of the System V Unix Release 4.1 Enhanced Security
    (SVR4.1ES) product.  The SVR4.1ES privilege control mechanism separates the
    privilege mechanism from the access control mechanism, it provides for
    fine-grained control over sensitive operation access by users, and it
    controls the propagation of privilege from one process to another.  Our
    goals also include accommodating multiple privilege control mechanisms
    within the UNIX System V kernel.  These privilege mechanisms can be into
    plugged the kernel through well defined interfaces much the same way as
    UNIX file systems are currently added to the kernel.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/privilege-mechanism-unix-system-v-release-4"
}

@InProceedings{poapnbm,
  author       = "James {da Silva} and {\' O}lafur Gudmundsson and Daniel Moss{\' e}",
  title        = "Performance of a Parallel Network Backup Manager",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "217--225",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "file-system backup, scheduling, parallelism",
  abstract     = "The advent of inexpensive multi-gigabyte tape drives has
    enabled completely automated backup of many dozens of networked
    workstations to a single tape.  One problem arising with this scheme is
    many computers cannot backup their disks over the network at more than a
    fraction of the tape's rated speed.  Thus, running overnight backups
    sequentially can take well into the next day.  We have developed a parallel
    backup manager named Amanda that solves this problem by running many
    backups in parallel to a holding disk, then using a multi-buffer copy
    scheme to transfer the backups to tape at full speed.  Amanda uses accurate
    estimates of current backup sizes well as as historical information about
    backup rates to schedule backups in parallel without swamping the network
    or overrunning the holding disk or tape.  We use Amanda to back up 11.5
    gigabytes of data in over 230 file systems on more than 100 workstations,
    using a single 2 gigabyte 8mm tape drive, taking two to three hours each
    night.  This paper discusses Amanda's architecture and performance.",  
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/performance-parallel-network-backup-manager"
}

@InProceedings{iattaif,
  author       = "Kiem-Phong Vo and Yih-Farn Chen",
  title        = "Incl:  {A} Tool to Analyze Include Files",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "199--208",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "cia, reverse engineering, include files, smart compilation",
  abstract     = "Large C and projects C++ software typically share common
    types, macros, and variables among modules via include files organized into
    hierarchies.  Many of these hierarchies grow so complex that programmers it
    is hard for figure to when out a file must be included.  Since including
    unused symbols is usually harmless, application code tends to include more
    files than required.  Knowing when files are or are not needed is useful to
    restructure the code and reduce the time required product.  to build a It
    also helps in reorganizing the - include hierarchies should this be deemed
    necessary.  Incl is a tool that analyzes include hierarchies to (1) show
    the dependencies graphical among include files in or text forms, (2) infer
    what files are (3) not needed, and provide ways to remove unused include
    files.  The inference and removal of unused include files must be done with
    care for that may change the meaning of the programs.  application We shall
    precise describe conditions under which include files can be safely ignored
    for give compilation and a linear time algorithm to compute such files.
    Incl projects has been used on many and experience shows that, in many
    cases, eliminating unnecessary include files significantly reduces
    compilation time.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/incl-tool-analyze-include-files"
}

@InProceedings{lsptp,
  author       = "David Tilbrook and Russell Crook",
  title        = "Large Scale Porting Through Parameterization",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "209--216",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "system portability, parameterization, configuration",
  abstract     = "The advent of open systems and standards, while beneficial,
    has not eliminated the difficulty of maintaining and transporting large
    scale software systems across many varying platforms.  In this paper we
    discuss the need and criteria for porting a effective strategy, one that
    allows the rapid and inexpensive retargeting of large scale software
    systems to many widely varying platforms while not compromising the
    integrity of that software on any previously supported platform.  Getting
    Tigger down, said Eeyore, and not hurting anybody, Keep those two ideas in
    your head, Piglet, you'll and be all right.,' A.  A.  Milne, The World of
    Pooh, 1957, pp216, McCelland & Stewart Ltd.  A key component of any porting
    strategy is the methodology used to determine, represent, use, and validate
    specifications of the target system's characteristics and site or system
    dependent build and run time controls.  The standards efforts (e.g., POSIX,
    ANSI C) are attempting to eliminate the large number of discrepancies that
    exist among systems However, problem today.  the will always exist, for
    ieasons that are discussed.  Hence, the main objective of this paper is to
    present and justify the methodology that we use.  This methodology is in
    production use on several products commercial in Sietec.  Its benefits
    include relieving programmer the from the burden of needing detailed
    knowledge all the of idiosyncrasies of the various target environments.  It
    is sufficiently powerful that it accommodates many flavours BSD, of System
    V, and DOS.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/large-scale-porting-through-parameterization"
}

@InProceedings{ichopewcn,
  author       = "Henry Spencer and Geoff Collyer",
  title        = "{\tt \#ifdef} Considered Harmful, or Portability Experience With {C News}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "185--197",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "portability, c preprocessor, conditional macros, software
    complexity", 
  abstract     = "We believe that a C programmer’s impulse to use #ifdef in an
    attempt at portability is usually a mistake.  Portability is generally the
    result of advance planning rather than trench warfare involving #ifdef.  In
    the course of developing C News on different systems, we evolved various
    tactics for dealing with differences among systems without producing a
    welter of #ifdefs at points of difference.  We discuss the alternatives to,
    and occasional proper use of, #ifdef.", 
  location     = "https://www.usenix.org/publications/library/proceedings/sa92/spencer.pdf"
}

@InProceedings{ahalmfhn,
  author       = "Anupam Bhide and Spencer Shepler",
  title        = "{A} Highly Available Lock Manager for {HA}-{NFS}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "177--184",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "nfs, file locking, fault tolerance",
  abstract     = "This paper presents the design and implementation of a highly
    available lock manager for highly available NSF (HA-NSF).  HA-NSF provides
    highly available network file service to NSF clients and can be used by any
    NSF client without modification.  This is provided by having two servers
    share dual-ported disks so that one server can take over the other's disks
    and file systems if it fails.  Making the NSF service highly available is
    not enough since many applications that use NSF also use other services
    provided with NSF such as the network lock manager.  We describe a scheme
    whereby each server transfers enough of its lock state to the other so that
    if it fails, the other server can go through a lock recovery protocol, Our
    design goal was to make the overhead of transferring the state during
    failure-free operations as low as possible.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/highly-available-lock-manager-ha-nfs"
}

@InProceedings{tcmfs,
  author       = "David~P. Anderson and Yoshitomo Osawa and Ramesh Govindan",
  title        = "The {Continuous Media File System}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "157--164",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "file systems, continuous media delivery, rate-based qos,
    admission control, scheduling",
  abstract     = "Handling digital audio and video data (continuous media) in a
    general-purpose file system can lead to performance problems.  File systems
    typically optimize overall average performance, while many audio/video
    applications need guaranteed worst-case performance.  These guarantees
    cannot be provided by fast hardware alone; we need also consider the
    interrelated software issues of file layout on disk, disk scheduling,
    buffer space management, and admission control.  The Continuous Media File
    System (CMFS) is a prototype file system that addresses these issues.", 
  location     = "https://doi.org/10.1145/138873.138875"
}

@InProceedings{msfgnw,
  author       = "Jean-Philippe Baud and Christian Boissat and Fabrizio Cane and Frederic Hemmer and Erik Jagel and Ashok Kumar and Gordon Lee and Bernd Panzer-Steindel and Lee Robertson and Ben Segal and Antoine Trannoy and Igor Zacharov",
  title        = "Mainframe Services from Gigabit-Networked Workstations",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "165--175",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "workstation mainframes, batch system management, disk pools",
  abstract     = "Until recently, large mainframes and super-computers were
    considered essential for powerful scientific batch computing services
    requiring intensive tape usage, large well-managed disk storage systems,
    high throughput and maximum reliability.  However, this situation has
    changed dramatically over recent years with the appearance RISC-based of
    workstations with performance characteristics, at least for scalar
    computations, comparable with the fastest mainframes but with an order of
    magnitude better price/performance.  At the same time competitively priced
    workstation-class disk and tape systems with adequate performance and
    reliability have become available.  Combined with newly-developed LANs and
    Gigabit networking solutions, it is now possible to provide scalable and
    integrated mainframe-class services on workstation platforms with the UNIX
    operating system.  Previous papers have summarized CERN's work over the
    past two years in developing and introducing such services on a large
    scale.  The latest system is called SHIFT, or Scalable Heterogeneous
    Integrated FaciliTy.  The SHIFT facility performs a wide range of
    scientific processing data tasks including many with high I/O requirements
    and is comparable in CPU capacity to the CERN computer center.  Similar
    systems are now being built within the budgets of smaller institutes which
    previously had to depend on remote university or national computing
    centers.  The present paper gives a short review of the SHIFT project's
    goals and .  architectural principles, and a detailed account of the
    networking and software design and implementation problems that were
    encountered and solved.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/mainframe-services-gigabit-networked-workstations"
}

@InProceedings{asiovmhlfsmmm,
  author       = "Ramesh Balan and Kurt Gollhardt",
  title        = "{A} Scalable Implementation of Virtual Memory {HAT} Layer for Shared Memory Multiprocessor Machines",
  title        = "Mainframe Services from Gigabit-Networked Workstations",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "107--115",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "portability, virtual storage management, shootdown policies,
    multiprocessors, locking",
  abstract     = "This paper describes the design and implementation of the
    UNIX SVR4.2 Virtual Memory (VM) Hardware Address Translation(HAT) layer
    that can be used as a model for other multiprocessor(MP) platforms in terms
    of scalability and MP related interfaces between the HAT layer and the
    machine independent layer.  SVR4.2 is a SVR4.1 ES based kernel that
    supports shared memory multiprocessors and light weight processes in a
    shared address space.  By implementing fine-grained locking mechanism, a
    lazy Translation Lookaside Buffer (TLB) shootdown evaluation policy and
    other improvements over the SVR4 design_the memory management feature is
    made scalable in terms of number of processors as well as size of memory
    supported.  Providing a small set of interfaces between the
    machine-dependent and independent layers for TLB consistency and a simple
    set of locking requirements between the€ two layers, SVR4.2 facilitates the
    portability of the memory management feature to other multiprocessor
    platforms.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/scalable-implementation-virtual-memory-hat-layer"
}

@InProceedings{adoeh,
  author       = "Doug Moen",
  title        = "{A} Discipline of Error Handling",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "123--133",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "error handling, exceptions, exception handling,
    documentation, error identification, internationalization",
  abstract     = "In the UNIX world, exception handling mechanisms for error
    handling are often discussed, but seldom applied.  This paper describes a
    disciplined approach to error handling refined over a 3-year period during
    the development of a medium-large (200K line) toolkit written in C under
    UNIX.  We describe a portable exception handling system, written in C, and
    a methodology for using it which encompasses coding style, documentation,
    and testing issues.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/discipline-error-handling"
}

@InProceedings{rtactip,
  author       = "Don Libes",
  title        = "Regression Testing and Confromance Testing Interactive Programs",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "135--144",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "regression testing, expect, program testing, scripting,
    automation, tcl",
  abstract     = "Testing interactive programs, by its nature, requires
    interaction - usually by real people.  Such testing is an expensive process
    and hence rarely done.  Some interactive tools can be used
    non-interactively to a limited extent, and are often tested only this way.
    Purely interactive programs are rarely tested in any systematic way.  This
    paper describes testing of interactive line and character-oriented programs
    via Expect.  An immediate use of this is to build a test suite for
    automating standards conformance of all of the interactive programs in
    POSIX 1003.2a (interactive shells and tools), something which has not yet
    been accomplished by any means.",
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/presentation/regression-testing-and-conformance-t"
}

@InProceedings{ntned,
  author       = "Paul Maybee",
  title        = "{NeD}:  The Network Extensible Debugger",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "145--156",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "debugging, software tools, tcl, software customization",
  abstract     = "NeD is a debugging server with a programmable network
    interface.  NeD is designed to be flexible and extensible enough to support
    a wide range of debugging needs.  Debugging clients communicate with NeD by
    sending it programs to execute.  The programming language, NeDtcl, is tcl
    extended with 30 debugging specific-functions.  NeD can be used as a
    traditional debugger with a textual interface, but the user would find the
    language cumbersome.  It is designed to be convenient for communication
    between programs, rather than between program and user.  As a demonstration
    of NeD's utility as a debugging server, the pdb debugger has been
    retargeted to use NeD as its server.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/ned-network-extensible-debugger"
}

@InProceedings{vwsanatschws,
  author       = "Rita Pascale and Jeremy Epstein",
  title        = "Virtual Window System:  {A} New Approach to Supporting Concurrent Heterogeneous Windowing Systems",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "117--121",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "virtual system, multiplexing, portability",
  abstract     = "A virtual window system (VWS) is a simple model of a window
    system which can be used to host other more sophisticated window systems.
    The VWS allows the window systems to share the physical display in a
    controlled fashion.  A VWS is analogous to the virtual machine monitor
    (VMM) concept in operating systems, where a single physical computer can
    run multiple operating systems, each in its own protection domain.  Unlike
    the VMM concept, the window systems supported by the VWS need close
    cooperation to perform tasks, such as cut and paste between windows of
    different window systems.  This paper describes the VWS concept, discusses
    an architecture for a VWS, describes limitations of the VWS concept,
    discuses some lessons learned from the design and implementation of our
    prototype, and describes the use of VWSs for various application domains.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/virtual-window-systems-new-approach-supporting"
}

@InProceedings{tvmfu,
  author       = "James Franklin",
  title        = "Tiled Virtual Memory for " # unix,
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "99--106",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "virtual storage, mmus, tiling storage, hardware accelerators,
  image processing, matrix processing, storage addressing",
  abstract     = "Many computer applications require the manipulation of large
    data arrays.  These applications can behave-badly under a paged virtual
    memory (VM) system, due to poor memory access patterns.  One solution to
    this problem is tiling, a technique in which the arrays are partitioned
    into sub-arrays that map one-to-one with VM pages.  Software
    implementations of tiling have been described in the literature, but none
    provide the speed and application transparency of a hardware solution.  We
    have implemented a hardware based, tiled VM within a version of the UNIX
    operating system.  Based on a novel memory management unit and supporting
    kernel software, this tiled VM has proven to be an efficient environment
    for manipulating2-dimensional arrays of data In this paper we discuss the
    kernel changes required to implementer tiled VM.  We then compare tiled and
    paged versions of our VM system, and show that tiling results in a
    five-fold reduction in working set size for a common class of image
    processing algorithms.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/tiled-virtual-memory-unix"
}

@InProceedings{iutfis,
  author       = "Rich Salz",
  title        = "{InterNetNews}:  {Usenet} Transport for {Internet} Sites",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "93--98",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "usenet, servers, nntp, information distribution",
  abstract     = "NNTP, the Network News Transfer Protocol, has been called the
    most widely implemented elective protocol in the Internet.  The growth of
    the Internet has meant more sites exchanging NNTP data.  While the
    explosive growth in Usenet traffic places demands on all sites, the goal of
    fast network access puts particular demands on NNTP hosts.  InterNetNews is
    an implementation of the Usenet transport layer designed to address this
    situation.  It replaces the standard Unix server architecture with a single
    long-running server that handles all incoming connections.  It has proven
    be quite successful, providing quick and efficient news transfer.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/internetnews-usenet-transport-internet-sites"
}

@InProceedings{trbufrtphaitue,
  author       = "Mary Baker and Mark Sullivan",
  title        = "The Recovery Box:  Using Fast Recovery to Provide High Availability in the " # unix # " Environment",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "31--43",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "crash recovery, state management, persistent storage,
    postgress, sprite",
  abstract     = "As organizations with high system availability requirements
    move to UNIX, the elimination of down-time in the UNIX environment becomes
    a more important issue.  Designing for fast recovery, rather than crash
    prevention, can provide low-cost highly available systems without
    sacrificing performance or simplicity.  In Sprite, a UNIX-like distributed
    operating system, we accomplish this fast recovery in part through the use
    of a recovery box: a stable area of memory in which the system stores
    carefully selected pieces of system state, and from which the system can be
    regenerated quickly.  Error detection using checksums allows the system to
    revert to its traditional reboot sequence if the recovery box data is
    corrupted during system failure.  Recent statistics about the types and
    frequencies of operating system failures indicate that fast recovery using
    the recovery box will be possible most of the time.  Using our recovery box
    implementation, a Sprite file server recovery in 26 seconds and a database
    manager with ten remote client processes recovers in six seconds - fast
    enough that many users and applications will not care that the system
    crashed.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/recovery-box-using-fast-recovery-provide-high"
}

@InProceedings{iltds,
  author       = "D.~Stein and D.~Shah",
  title        = "Implementing Lightweight Threads",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "1--9",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "lightweight threads, user-space threads, signals, concurrent
    access, processes, kernel-supported threads, multiplexing, libraries",
  abstract     = "We describe an implementation of a threads library that
    provides extremely lightweight threads within a single UNIX process while
    allowing fully concurrent access to system resources.  The threads are
    lightweight enough so that they can be created quickly, there can be
    thousands present, and synchronization can be accomplished rapidly.  These
    goals are achieved by providing user threads which multiplex on a pool of
    kernel-supported threads of control.  This pool is managed by the library
    and will automatically grow or shrink as required to ensure that the
    process will make progress while not using an excessive amount of kernel
    resources.  The programmer can also tune the relationship between threads
    and kernel supported threads of control.  This paper focuses on scheduling
    and synchronizing user threads, and their interaction with UNIX signals in
    a multiplexing threads library.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/implementing-lightweight-threads"
}

@InProceedings{fsmisvr4m,
  author       = "J.~Kent Peacock",
  title        = "File System Multithreading in {System V Release 4 MP}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "19--29",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "file systems, mutual exclusion, locking, performance",
  abstract     = "An Intel-sponsored Consortium of computer companies has
    developed a multiprocessor version of System V Release4 (SVR4MP) which has
    been released by UNIX System Laboratories.  The Consortium's goal was to
    add fine-grained locking to SVR4 with minimal change to the kernel, and
    with complete backward compatibility for user programs.  To do this, a
    locking strategy was developed which complemented, rather than replaced,
    existing mechanisms.  UNIX synchronization To multithread the file systems,
    some general locking strategies developed and applied to the generic
    Virtual File System(VFS) and vnode interfaces.  Of particular interest were
    the disk-based S5 and UFS file system types, especially with respect to
    their scalability.  Contention points were found and successively
    eliminated to the point where the file systems were found to be disk-bound.
    In particular, several file system caches were restructured using a
    low-contention, highly-scalable approach called a Software Set-Associative Cache.  
    This technique reduced the measured locking contention of each of these
    caches from the 10-15% range to less than 0.1%.  A number of experimental
    changes to disk queue sorting algorithms were attempted to reduce the disk
    bottleneck, with limited success.  However, these experiments provided the
    following insight into the need for balance between I/O and CPU utilization
    in the system: that attempting to increase CPU utilization to show higher
    parallelism could actually lower system throughput.  Using the GAEDE
    benchmark with a sufficient number of disks configured, the kernel was
    found to obtain throughput scalability of 88% the theoretical maximum on 5
    processors.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/file-system-multithreading-system-v-release-4-mp"
}

@InProceedings{omadatamte,
  author       = "Thuan~Q. Pham and Pankaj~K. Garg",
  title        = "On Migrating a Distributed Application to a Multi-Threaded Environment",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "45--53",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "portability, thread-level concurrency, software structure,
    performance, performance, processes",
  abstract     = "Light-weight computation threads in a multi-threaded
    operating system promise to provide low-overhead computation and fully
    sharable addressing space not available in conventional process-oriented
    operating systems.  Traditional distributed applications based on processes
    can be re-architectured to use concurrent threads in a multi-threaded
    platform to take advantage of faster context switches and shared-memory
    communication.  We investigated this expectation by porting an existing
    distributed application to a mulrithreaded environment.  As a result, we
    virtually eliminated the cost of message-based IPC, replacing it with
    shared-memory communication between threads.  In this paper we address the
    benefits, the difficulties, and the trade-offs of such a re-architecture.
    We also comment on some feasible architectures for migrating currently
    distributed applications to multi-threaded environments.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/migrating-distributed-application-multi-threaded"
}

@InProceedings{cmewm,
  author       = "William {Moran, Jr} and Farnam Jahanian",
  title        = "Cheap Mutual Exclusion",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "55--61",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "synchronization, signals, preemption, signal handlers",
  abstract     = "A new method of enforcing mutual exclusion among concurrent
    processes on uniprocessors running UNIX is presented in this paper.  When a
    process attempts to obtain a lock, no race condition will occur unless the
    process is preempted.  The central idea is that a process can avoid a race
    condition if preemption is made visible to the process when it is
    rescheduled.  Two possible implementations of this idea are discussed in
    depth.  The proposed solutions do not require special hardware support or
    disabling of interrupts during a critical section.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/cheap-mutual-exclusion"
}

@InProceedings{tadlwat,
  author       = "Barry Brachman and Gerald Neufeld",
  title        = "{TDBM}:  A {DBM} Library With Atomic Transactions",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "63--80",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "extensible hashing, atomic transactions, crash recovery,
    transactions, databases, threads, distributed databases, architecture,
    performance",
  abstract     = "The dbm database library introduced disk-based extensible
    hashing to UNIX.  The library consists of functions to use a simple
    database consisting of key/value pairs.  A number of work-alikes have been
    developed, offering additional features and free source code.  Recently, a
    new package was developed that also offers improved performance however,
    provide fault-tolerant behavior.  None of these implementations.  In many
    applications, a single high-level operation may cause many database items
    to 6s updated, created, or deleted.  If the application crashes while
    processing the operation, the database could be left in an inconsistent
    state.  Current versions of dbm to not handle this problem.  Existing dbm
    implementations do not support concurrent access, even though the use of
    lightweight processes in a UNIX environment is growing.  To address
    deficiencies, tdbm was developed.  Tdbm is a transaction
    processing-database with a dbm-like interface.  It provides nested atomic
    transactions, volatile and persistent databases, and support for very large
    object sand distributed operation.  - This paper describes the design and
    implementation of tdbm and examines its performance.", 
  location     = "https://www.usenix.org/conference/usenix-summer-1992-technical-conference/tdbm-dbm-library-atomic-transactions"
}

@InProceedings{vrqmoti,
  author       = "Kevin Brook Long and Jerry Fowler and Stan Barber",
  title        = "{VNS} Retriever:  Querying {MEDLINE} over the {Internet}",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "81--91",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "information retrieval,  system architecture, query
    management, resource management, interprocess communication, interfaces,
    query engines, administration, performance, system evaluation",
  abstract     = "Academic medical centers around the country are developing
    networking infrastructures and connecting to the Internet.  Baylor College
    of Medicine is developing VNS Retriever, an architecture for comprehensive
    handling of our institution's database requests.  The first implemented
    instance of this architecture is the MEDLINE Retriever, a tool to query the
    considerable citation database of medical literature at the National
    Library of Medicine.  Response times that we have experienced with the
    MEDLINE Retriever have pleased us and impressed our user community.  The
    system will work for small sites, but is extensible for use on large
    campuses as well.  The MEDLINE Retriever uses the Corporation for National
    Research Initiatives' ABIDE gateway.  The principal user interface employs
    Motif and the X Window System.", 
  location     = ""
}

@InProceedings{bmmtsk,
  author       = "J.~R. Eykholt and S.~R. Kleiman and S. Barton and R.~Faulkner and A.~Shivalingiah and M.~Smith and D.~Stein and J.~Voll and M.~Weeks and D.~Williams",
  title        = "Beyond Multiprocessing:  Multithreading the {SunOS} Kernel",
  booktitle    = usenixs92,
  year         = 1992,
  pages        = "11--18",
  organization = "USENIX Association",
  address      = "San Antonio, " # TX,
  month        = "8--12 " # jun, 
  keywords     = "multi-threading, kernel structure, interrupt processing,
    synchronization, scheduling",
  abstract     = "Preparing the SunOS/SVR4 kernel for today's challenges:
    symmetric multiprocessing, multi-threaded applications, real-time, and
    multimedia, led to the incorporation of several innovative techniques.  In
    particular, the kernel was re-structured around threads.  Threads are used
    for most asynchronous processing, including interrupts.  The resulting
    kernel is fully preemptible and capable of real-time response.  The
    combination provides a robust base for highly concurrent, responsive
    operation.",
  location     = "https://www.researchgate.net/publication/2408472_Beyond_Multiprocessing_Multithreading_the_SunOS_Kernel"
}

@Article{eobsoiop,
  author       = "Brustoloni, Jos{\' e} Carlos and Steenkiste, Peter",
  title        = "Effects of Buffering Semantics on {I/O} Performance",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "277--291",
  month        = oct,
  keywords     = "network processing, network load, lazy receiver processing,
    sockets, packet demultiplexing, ip, protocol processing",
  abstract     = "We present a novel taxonomy that characterizes in a
    structured way the software and hardware trade-offs for I/O data passing
    between applications and operating system.  This work contributes new
    techniques, input-disabled page out, transient output copy-on-write, and
    input aliment, that are used for copy avoidance in an optimized buffering
    semantics, emulated copy.  Emulated copy offers the same API and integrity
    guarantees as those of copy semantics and, therefore, can transparently
    replace it.  We implemented an I/O framework, Genie, that allows
    applications to select any semantics in the taxonomy.  Using Genie for
    communication between PCs and AlphaStations of an ATM network at 155 Mbps,
    we found that all non-copy semantics performed similarly, and that only
    copy semantics had distinctly inferior performance.  We analyzed end-to-end
    latency in terms of the costs of primitive data processing operations and
    modeled how those costs scale with CPU, memory, and network speeds.  The
    analysis suggests that current trends tend to intensify the observed
    performance clustering.  The main conclusion is that existing I/O interface
    with copy semantics such that of Unix, can be transparently converted to
    emulated copy semantics and thus achieve performance comparable to the best
    obtainable with any semantics in the taxonomy.",  
  location     = "https://doi.org/10.1145/238721.238787",
  location     = "http://www.cs.cmu.edu/afs/cs/user/jcb/papers/osdi96.ps"
}

@Article{msfnwqosg,
  author       = "David K.~Y. Yau and Simon~S. Lam",
  title        = "Migrating Sockets for Network with Quality of Service Guarentees",
  journal      = ton,
  year         = 1998,
  volume       = 6,
  number       = 6,
  pages        = "700--716",
  month        = dec,
  keywords     = "bandwidth scheduling, cpu scheduling, packet demultiplexing,
    quality of service guarantees, user level protocol",
  abstract     = "Migrating Sockets is the protocol processing component of an
    end-system architecture designed for networking with QoS guarantees.  The
    architecture provides: (1) adaptive rate-controlled scheduling of protocol
    threads in Migrating Sockets, (2) rate-based flow control for reserved rate
    connections in future integrated services networks, and (3) a constant
    overhead active demultiplexing mechanism.  Migrating Sockets achieves its
    efficiency by allowing user applications to manage a network endpoint with
    minimal system intervention, providing user level protocols read-only
    access to routing information in a “well-known” shared memory region, and
    integrating efficient kernel level support we previously built.  It is
    backward compatible with Unix semantics and Berkeley sockets, and has been
    used to implement Internet protocols such as TCP, UDP and IP (including IP
    multicast).  We also show that active demultiplexing supported by Migrating
    Sockets can be transparently enabled in wide-area TCP/IP internetworking
    (although it is not restricted to TCP/IP).  We have an implementation of
    Migrating Sockets in Solaris 2.5.  We discuss our implementation
    experience, and present performance results of our system running on the
    Ultra-1, SPARC 10 and SPARC 20 architectures", 
  location     = "https://www.cs.utexas.edu/users/lam/Vita/IEEE/YauLam98.pdf", 
  location     = "https://doi.org/10.1109/90.748083"
}

@Article{asfsarpoacl,
  author       = "Jan Stelovsky and Hirotsugo Sugaya",
  title        = "{A} System for Specification and Rapid Prototyping of Application Command Languages",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 7,
  pages        = "1023--1032",
  month        = jul,
  keywords     = "software tools, programming environments, user interfaces,
    rapid prototyping, application command languages, XS-2 system, application
    dialogs, command language grammar, nonprocedural description language,
    regular expressions, command specification, command tree, automatic
    translation, Modula-2", 
  abstract     = "The XS-2 system that integrates specification, rapid
    prototyping, and the actual use of application dialogs is described.  The
    XS-2 command language grammar, a nonprocedural description language based
    on regular expressions, is used to specify commands for any application
    program.  The syntax of the command specification is visible to the user:
    command names and their activation rules are displayed as a command tree.
    Since a small set of tools is provided for the development of the command
    specification and its automatic translation into a prototype application
    module in Modula-2, no programming work is necessary to design and evaluate
    the commands.  Experience shows that an advanced end user can develop his
    or her own prototype application without a programmer's assistance.", 
  location     = "https://doi.org/10.1109/32.42742"
}

@Article{plfcmspac,
  author       = "Loy, Gareth and Abbott, Curtis",
  title        = "Programming Languages for Computer Music Synthesis, Performance, and Composition",
  journal      = surveys,
  year         = 1985,
  volume       = 17,
  number       = 2,
  pages        = "235--265",
  month        = jun,
  keywords     = "computer music, digital sound synthesis, music programming
    language design, music representation, real-time control languages,
    object-oriented structures, temporal sequencing",
  abstract     = "The development of formal, descriptive, and procedural
    notations has become a practical concern within the field of music now that
    computers are being applied to musical tasks.  Music combines the real-time
    demands of performance with the intellectual demands of highly developed
    symbolic systems that are quite different from natural language.  The
    richness and variety of these demands makes the programming language
    paradigm a natural one in the musical application of computers.  This
    paradigm provides musicians with a fresh perspective on their work.  At the
    same time, music is a very advanced form of human endeavor, making computer
    music applications a worthy challenge for computer scientists.  In this
    paper we outline the traditional tasks and forms of representation in
    music, then proceed with a survey of languages that deal with music
    programming.", 
  location     = "https://doi.org/10.1145/4468.4485"
}

@Article{spaocbttp,
  author       = "Gazzillo, Paul and Grimm, Robert",
  title        = "{SuperC}:  Parsing All of {C} by Taming the Preprocessor",
  journal      = pldai12,
  year         = 2012,
  volume       = 42,
  number       = 6,
  pages        = "323--334",
  month        = jun,
  keywords     = "c, preprocessor, parsing, conditional macros",
  abstract     = "C tools, such as source browsers, bug finders, and automated
    refactorings, need to process two languages: C itself and the preprocessor.
    The latter improves expressivity through file includes, macros, and static
    conditionals.  But it operates only on tokens, making it hard to even parse
    both languages.  This paper presents a complete, performant solution to
    this problem.  First, a configuration-preserving preprocessor resolves
    includes and macros yet leaves static conditionals intact, thus preserving
    a program's variability.  To ensure completeness, we analyze all
    interactions between preprocessor features and identify techniques for
    correctly handling them.  Second, a configuration-preserving parser
    generates a well-formed AST with static choice nodes for conditionals.  It
    forks new subparsers when encountering static conditionals and merges them
    again after the conditionals.  To ensure performance, we present a simple
    algorithm for table-driven Fork-Merge LR parsing and four novel
    optimizations.  We demonstrate the effectiveness of our approach on the x86
    Linux kernel.", 
  location     = "https://doi.org/10.1145/2254064.2254087",
  location     = "https://cs.nyu.edu/rgrimm/papers/pldai12.pdf"
}

@Article{ptcorcpparfei,
  author       = "Kim, K.~H.",
  title        = "Programmer-Transparent Coordination of Recovering Concurrent Processes:  Philosophy and Rules for Efficient Implementation",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "810--821",
  month        = jun,
  keywords     = "monitors, rollback and recovery, recovery points, error
    recovery, process interaction, programmer-transparent coordination, recovery
    blocks, rollback propagation",
  abstract     = "An approach to coordination of cooperating concurrent
    processes, each capable of error direction and recovery, is presented.
    Error detection, rollback, and retry in a process are specified by a
    well-structured language construct called recovery block.  Recovery points
    of processes must be properly coordinated to prevent a disastrous avalanche
    of process rollbacks.  The approach relies on an intelligent processor
    system (that runs processes) capable of establishing and discarding the
    recovery points of interacting processes in a well coordinated manner such
    that a process never makes two consecutive rollbacks without making a retry
    between the two, and every process rollback becomes a minimum-distance
    rollback.  Following a discussion of the underlying philosophy of the
    author's approach, basic rules of reducing storage and time overhead in
    such a processor system are discussed.  Examples are drawn from the systems
    in which processes communicate through monitors", 
  location     = "https://doi.org/10.1109/32.6160"
}

@Article{aeduai,
  author       = "Dillig, Isil and Dillig, Thomas and Aiken, Alex",
  title        = "Automated Error Diagnosis Using Abductive Inference",
  journal      = pldai12,
  year         = 2012,
  volume       = 47,
  number       = 6,
  pages        = "181--192",
  month        = jun,
  keywords     = "abduction, witnesses, question asking, program proving, error
    classification, proof assistants",
  abstract     = "When program verification tools fail to verify a program,
    either the program is buggy or the report is a false alarm.  In this
    situation, the burden is on the user to manually classify the report, but
    this task is time-consuming, error-prone, and does not utilize facts
    already proven by the analysis.  We present a new technique for assisting
    users in classifying error reports.  Our technique computes small, relevant
    queries presented to a user that capture exactly the information the
    analysis is missing to either discharge or validate the error.  Our insight
    is that identifying these missing facts is an instance of the abductive
    inference problem in logic, and we present a new algorithm for computing
    the smallest and most general abductions in this setting.  We perform the
    first user study to rigorously evaluate the accuracy and effort involved in
    manual classification of error reports.  Our study demonstrates that our
    new technique is very useful for improving both the speed and accuracy of
    error report classification.  Specifically, our approach improves
    classification accuracy from 33% to 90% and reduces the time programmers
    take to classify error reports from approximately 5 minutes to under 1
    minute.", 
  location     = "https://www.cs.utexas.edu/~isil/pldi022-dillig.pdf", 
  location     = "https://doi.org/10.1145/2254064.2254087"
}

@Article{efdmfecfgr,
  author       = "Prem Devanbu and Bill Frakes",
  title        = "Extracting Formal Domain Models from Existing Code for Generative Reuse",
  journal      = "ACM Applied Computing Review",
  year         = 1997,
  volume       = 5,
  number       = 1,
  month        = jun,
  keywords     = "domain models, semantic graphs, reverse engineering, ",
  abstract     = "The existence of a domain model that formally describes the
    meaning of a piece of software can be helpful for re-use.  We illustrate an
    approach, where by reengineering a formal domain model out of an existing
    system, one can generalize the existing system to an application generator:
    we map a domain model for program representations into the front end of a
    compiler, using the Genii system, and use this in Genoa, an application
    generator for language tools.  This approach shows promise in other
    domains, as well.", 
  location     = "http://www.acm.org/sigapp/acr/Issues/V5.1/devanbu.ps"
}

@Article{widdg,
  author       = "David Gardner",
  title        = "What is {DHTML}?",
  journal      = "irt.org",
  year         = 2000,
  month        = jan,
  keywords     = "dhtml, web browsers",
  location     = "https://irt.org/articles/js201/"
}

@Article{oopeia2,
  author       = "S.~Tucker Taft",
  title        = "Object-Oriented Programming Enhancements in {Ada} {200Y}",
  journal      = "Ada User Journal",
  year         = 2003,
  volume       = 24,
  number       = 2,
  pages        = "119--127",
  month        = jun,
  keywords     = "oop languages, cyclic type structures, multiple inheritance,
    type hierarchies, interface inheritance, task types",
  abstract     = "This article provides an overview of four proposed amendments
    to the Ada standard for possible inclusion in the revision planned for late
    2005 or early 2006.  Together, these four amendments can be seen as
    finishing the job of integrating object-oriented programming features into
    Ada.", 
  location     = "http://ada-auth.org/ai-files/grab_bag/oop_200y.pdf"
}

@Article{dqp,
  author       = "Yu, C.~T. and Chang, C.~C.",
  title        = "Distributed Query Processing",
  journal      = surveys,
  year         = 1984,
  volume       = 16,
  number       = 4,
  pages        = "399--433",
  month        = dec,
  keywords     = "communication, cyclic queries, distributed query processing,
    fragment processing, heuristics, join, semijoin, optimization, performance,
    tree queries",
  abstract     = "In this paper, various techniques for optimization queries in
    distributed database are presented.  Although no attempt is made to cover
    all proposed algorithms on this topic, quite a few ideas extracted from
    existing algorithms are outlined.  It is hoped that large-scale experiments
    will be conducted to verify the usefulness of these ideas and that they
    will be integrated to construct a powerful algorithm for distributed query
    processing.", 
  location     = "https://doi.org/10.1145/3872.3874"
}

@Article{cahllfg,
  author       = "Dubach, Christophe and Cheng, Perry and Rabbah, Rodric and Bacon, David~F. and Fink, Stephen~J.",
  title        = "Compiling a High-Level Language for {GPU}s",
  journal      = pldai12,
  year         = 2012,
  volume       = 47,
  number       = 6,
  pages        = "181--192",
  month        = jun,
  keywords     = "java, map, reduce, opencl, kernels, storage management,
    optimizations", 
  abstract     = "Languages such as OpenCL and CUDA offer a standard interface
    for general-purpose programming of GPUs.  However, with these languages,
    programmers must explicitly manage numerous low-level details involving
    communication and synchronization.  This burden makes programming GPUs
    difficult and error-prone, rendering these powerful devices inaccessible to
    most programmers.  We desire a higher-level programming model that makes
    GPUs more accessible while also effectively exploiting their computational
    power.  This paper presents features of Lime, a new Java-compatible
    language targeting heterogeneous systems, that allow an optimizing compiler
    to generate high quality GPU code.  The key insight is that the language
    type system enforces isolation and immutability invariants that allow the
    compiler to optimize for a GPU without heroic compiler analysis.  Our
    compiler attains GPU speedups between 75% and 140% of the performance of
    native OpenCL code.", 
  location     = "https://doi.org/10.1145/2254064.2254066",
  location     = "https://researcher.watson.ibm.com/researcher/files/us-bacon/Dubach12Compiling.pdf"
}

@Article{tdmoi,
  author       = "Anson, Ed",
  title        = "The Device Model of Interaction",
  journal      = "Computer Graphics (" # pot # "Ninth Annual Conference on Computer Graphics and Interactive Techniques)",
  year         = 1982,
  volume       = 16,
  number       = 3,
  pages        = "107--114",
  month        = jul,
  keywords     = "device models, device configuration, user interactions",
  abstract     = "Any interactive system can be described in terms of the
    devices it involves, and their interconnections.  Similarly, each device
    can be described in terms of simpler devices and their interconnections.
    Such descriptions are strictly modular, and well structured.  This
    observation allows any system to be described, at all levels, by the same
    language.  Such descriptions have intuitive appeal for hardware as well as
    software components, and for process control applications as well as
    human-machine interaction.  The Device model of interaction, as described
    here, can ease the job of designing user- friendly interactive systems, and
    can be adapted for automatic compilation.  As an example, the design of an
    actual system component is discussed.  The design is presented, at several
    levels, in a Pascal-like notation.  It represents a module created to
    provide a human-machine interface via a graphic tablet, keyboard and video
    monitor.", 
  location     = "https://doi.org/10.1145/965145.801269"
}

@Article{cbpe,
  author       = "Richard~C. Waters",
  title        = "Clich{\' e}-Based Program Editors",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 1,
  pages        = "102--150",
  month        = jan,
  keywords     = "abstract syntax tree, program schemas, computer-aided software
    engineering, plan diagram, reuse, syntax-directed editing, program
      manipulation",
  abstract     = "A cliche-based program editor supports the construction and
    modification of programs in terms of standard algorithmic fragments
    (cliches), as opposed to merely supporting the construction and
    modification of programs in terms of syntactic or textual units.  These
    experimental cliche-based program editors have been implemented, exploring
    the trade-off between power and speed.  The Knowledge-Based Editor in Emacs
    (KBEmacs) is the most powerful of the three editors.  It supports a wide
    range of editing operations and can represent a wide range of cliches
    because it uses an internal representation called plan diagrams, which
    combines features of flowcharts and data flow schemas.  Unfortunately, the
    need to convert back and forth between program text and plan diagrams
    causes KBEmacs to be quite slow.  The Tempest editor uses text as its
    internal representation and is very fast since it does not have to do any
    conversions.  It supports a number of cliche-based operations and can
    represent a variety of cliches.  As a result, Tempest is valuable tool for
    many kinds of editing.  Unfortunately, most programming cliches are too
    complex to be supported directly in terms of program text.  Therefore,
    Tempest has little advantage over standard editors when used for program
    editing.  The Ace editor retains much of the speed of Tempest while
    supporting much of the power of KBEmacs.  Ace is relatively efficient,
    because it uses abstract syntax tree as the internal representation.  It
    achieves high power by basing these abstract syntax trees on a specially
    designed grammar that facilitates the representation and easy combination
    of cliches.  Ace's approach could be used to add powerful and efficient
    cliche-based editing capabilities to any programming environment.  In
    particular, Ace demonstrates that a small change in the internal workings
    of syntax editors is all that is required to open the door to cliche-based
    editing.", 
  location     = "https://doi.org/10.1145/174625.174628",
  location     = "http://www.merl.com/publications/TR91-01"
}

@Article{pioas,
  author       = "Lin, Huimin",
  title        = "Procedural Implementation of Algebraic Specification",
  journal      = toplas,
  year         = 1993,
  volume       = 15,
  number       = 3,
  pages        = "876--895",
  month        = nov,
  keywords     = "abstract implementation, procedural abstraction, program refinement",
  abstract     = "An implementation of an algebraic specification in an
    imperative programming language consists of a representation type, together
    with an invariant and an equivalence relation over it, and a procedure for
    each operator in the specification.  A formal technique is developed to
    check the correctness of an implementation with respect to its
    specification.  Here &ldquo;correctness&rdquo; means that the
    implementation satisfies the axioms and preserves the behavior of the
    specification.  Within legal representing value space, a correct
    implementation behaves like a desirable model of the specification.  A
    notion of implementation refinement is also proposed, and it is shown that
    the correctness relation between implementations and specifications is
    preserved by implementation refinement.  In the extreme case the procedures
    in an implementation may be pre-post-condition pairs.  Such abstract
    implementations can be refined into executable code by refining the
    abstract procedures in it.  In this way a formal link between the algebraic
    and the pre- post-condition specification techniques is established.", 
  location     = "https://doi.org/10.1145/161468.161473"
}

@Article{asolwtpfhsn,
  author       = "Willibald~A. Doeringer and Doug Dykeman and Matthias Kaiserswerth  and Bernard Werner Meister and Harry Rudin and Robin Williamson",
  title        = "{A} Survey of Light-Weight Transport Protocols for High-Speed Networks",
  journal      = "IEEE Transactions on Communications",
  year         = 1990,
  volume       = 38,
  number       = 11,
  pages        = "2025--2039",
  month        = nov,
  keywords     = "light-weight transport protocols, high-speed networks,
    comparative survey, APPN, Datakit, Delta-t, NETBLT, OSI/TP4, TCP, VMTP,
    XTP, end-to-end transmission, connection management, acknowledgements, flow
    control, error handling",
  abstract     = "A comparative survey is presented of techniques used at the
    transport layer in eight representative protocols, most of which were
    designed to improve the protocol processing rate.  The protocols are the
    relevant portions of the APPN, Datakit, Delta-t, NETBLT, OSI/TP4, TCP,
    VMTP, and XTP architectures.  The protocols are described, and the
    functions under consideration are defined.  No distinction is made as to
    whether these functions are carried out in a LAN, MAN, or WAN environment.
    The objective is to provide reliable, end-to-end transmission of data.  The
    mechanisms required to support connection management, acknowledgements,
    flow control, and error handling are examined.  Suitable techniques for
    designing light-weight transport protocols are identified.  A discussion is
    presented as to which technique seems the most promising.", 
  location     = "https://doi.org/10.1109/26.61485"
}

@Article{aooagmae,
  author       = "Fisher, Gene",
  title        = "An Overview of a Graphical Multilanguage Applications Environment",
  journal      = tse,
  year         = 1998,
  volume       = 14,
  number       = 6,
  pages        = "774--786",
  month        = jun,
  keywords     = "graphical programming, dataflow design, multilanguage
    programming, programming environments, user interfaces",
  abstract     = "A programming environment to support the development and use
    of engineering applications is presented.  The environment provides uniform
    support for a set of Pascal-class languages in which engineering and
    scientific applications are commonly written.  The environment includes a
    dynamically multilanguage interpreter debugger to aid in the interactive
    development of applications.  For the application and user, the environment
    provides a graphical program interface based on the concept of a software
    control panel.  Through a control panel, the user may interactively modify
    program parameters and exercise fine-grain control over program execution.
    The environment also includes a graphical design tool for constructing
    executable block diagrams based on standard application programs.  The
    control-panel tool is integrated with the design tool, to provide a uniform
    interface to all levels of program execution.", 
  location     = "https://doi.org/10.1109/32.6157"
}

@Article{aactfaliwm,
  author       = "Robert Cohn and Thomas Gross and Monica Lam and P.~S. Tseng",
  title        = "Architecture and Compiler Tradeoffs for a Long Instruction Word Microprocessor",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "2--14",
  month        = may,
  keywords     = "vliw processors, iwarp, compilation, cpu architecture",
  abstract     = "A very long instruction word (VLIW) processor exploits
    parallelism by controlling multiple operations in a single instruction
    word.  This paper describes the architecture and compiler tradeoffs in the
    design of iWarp, a VLIW single-chip microprocessor developed in a joint
    project with Intel Corp.  The iWarp processor is capable of spec-ifying up
    to nine operations in an instruction word and has a peak performance of 20
    million floating-point op-erations and 20 million integer operations per
    second.  An optimizing compiler has been constructed and used as a tool to
    evaluate the different architectural proposals in the development of iWarp.
    We present here the anal-ysis and compiler optimizations for those
    architectural features that address two key issues in the design of a VLIW
    microprocessor: code density and a streamlined execution cycle.  We support
    the results of our analysis with performance data for the Livermore Loops
    and a selection of programs from the LINPACK library.", 
  location     = "http://www.cs.cmu.edu/afs/cs/user/gyl/afslcc/trg/open/papers/asplos3/mat.ps"
}

@Article{tiifdfha,
  author       = "Sohi, Gurindar~S. and Vajapeyam, Sriram",
  title        = "Tradeoffs in Instruction Format Designs for Horizontal Architectures",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "15--25",
  month        = may,
  keywords     = "vliw architectures, code density, fine-grained parallelism,
    instruction packing, optimization, instruction set design",
  abstract     = "With recent improvements in software techniques and the
    enhanced level of fine grain parallelism made available by such techniques,
    there has been an increased interest in horizontal architectures and large
    instruction words that are capable of issuing more that one operation per
    instruction.  This paper investigates some issues in the design of such
    instruction formats.  We study how the choice of an instruction format is
    influenced by factors such as the degree of pipelining and the
    instruction's view of the register file.  Our results suggest that very
    large instruction words capable of issuing one operation to each functional
    unit resource in a horizontal architecture may be overkill.  Restricted
    instruction formats with limited operation issuing capabilities are capable
    of providing similar performance (measured by the total number of time
    steps) with significantly less hardware in many cases.", 
  location     = "https://doi.org/10.1145/70082.68184"
}

@Article{olsitc5,
  author       = "Dehnert, James~C. and Hsu, Peter Y.-T. and Bratt, Joseph~P.",
  title        = "Overlapped Loop Support in the {Cydra} 5",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "26--38",
  month        = may,
  keywords     = "loop unrolling, vliw architecture, scientific computation,
    data dependencies, instruction scheduling, compilation, loop analysis", 
  abstract     = "The CydraTM 5 architecture adds unique support for
    overlapping successive iterations of a loop to a very long instruction word
    (VLIW) base.  This architecture allows highly parallel loop execution for a
    much larger class of loops than can be vectorized, without requiring the
    unrolling of loops usually used by compilers for VLIW machines.  This paper
    discusses the Cydra 5 loop scheduling model, the special architectural
    features which support it, and the loop compilation techniques used to take
    full advantage of the architecture.", 
  location     = "https://doi.org/10.1145/70082.68185"
}

@Article{asfstc,
  author       = "Burkowski, F.~J. and Cormack, G.~V. and Dueck, G.~D.~P.",
  title        = "Architectural Support for Synchronous Task Communication",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "40--53",
  month        = may,
  keywords     = "ipc, synchronous communication, layered architecture,
    client-server architecture",
  abstract     = "This paper describes the motivation for a set of intertask 
    communication primitives, the hardware support of these primitives, the
    architecture used in the Sylvan project which studies these issues, and the
    experience gained from various experiments conducted in this area.  We
    start by describing how these facilities have been implemented in a
    multiprocessor configuration that utilizes a shared backplane.  This
    configuration represents a single node in the system.  The latter part of
    the paper discusses a distributed multiple node system and the extension of
    the primitives that are used in this expanded environment.", 
  location     = "https://doi.org/10.1145/70082.68186"
}

@Article{tfbamfhssop,
  author       = "Gupta, Rajiv",
  title        = "The Fuzzy Barrier:  {A} Mechanism for High Speed Synchronization of Processors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "54--63",
  month        = may,
  keywords     = "multiprocessor systems, barrier synchronization,
    parallelizing compilers",
  abstract     = "Parallel programs are commonly written using barriers to
    synchronize parallel processes.  Upon reaching a barrier, a processor must
    stall until all participating processors reach the barrier.  A software
    implementation of the barrier mechanism using shared variables has two
    major drawbacks.  Firstly, the execution of the barrier may be slow as it
    may not only require execution of several instructions and but also result
    in hot-spot accesses.  Secondly, processors that are stalled waiting for
    other processors to reach the barrier are essentially idling and cannot do
    any useful work.  In this paper, the notion of the fuzzy barrier is
    presented, that avoids the above drawbacks.  The first problem is avoided
    by implementing the mechanism in hardware.  The second problem is solved by
    extending the barrier concept to include a region of statements that can be
    executed by a processor while it awaits synchronization.  The barrier
    regions are constructed by a compiler and consist of several instructions
    such that a processor is ready to synchronize upon reaching the first
    instruction in this region and must synchronize before exiting the region.
    When synchronization does occur, the processors could be executing at any
    point in their respective barrier regions.  The larger the barrier region,
    the more likely it is that none of the processors will have to stall.
    Preliminary investigations show that barrier regions can be large and the
    use of program transformations can significantly increase their size.
    Examples of situations where such a mechanism can result in improved
    performance are presented.  Results based on a software implementation of
    the fuzzy barrier on the Encore multiprocessor indicate that the
    synchronization overhead can be greatly reduced using the mechanism.", 
  location     = "https://doi.org/10.1145/70082.68187"
}

@Article{asic,
  author       = "Mellor-Crummey, J.~M. and LeBlanc, T.~J.",
  title        = "{A} Software Instruction Counter",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "78--86",
  month        = may,
  keywords     = "parallel program debugging, cfgs, software instrumentation",
  abstract     = "Although several recent papers have proposed architectural
    support for program debugging and profiling, most processors do not yet
    provide even basic facilities, such as an instruction counter.  As a
    result, system developers have been forced to invent software solutions.
    This paper describes our implementation of a software instruction counter
    for program debugging.  We show that an instruction counter can be
    reasonably implemented in software, often with less than 10% execution
    overhead.  Our experience suggests that a hardware instruction counter is
    not necessary for a practical implementation of watch-points and reverse
    execution, however it will make program instrumentation much easier for the
    system developer.", 
  location     = "https://doi.org/10.1145/68182.68189"
}

@Article{espflsccm,
  author       = "Goodman, James~R. and Vernon, Mary~K. and Woest, Philip~J.",
  title        = "Efficient Synchronization Primitives for Large-Scale Cache-Coherent Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "64--75",
  month        = may,
  keywords     = "synchronization, binary semaphores, scheduling, ",
  abstract     = "This paper proposes a set of efficient primitives for process  
    synchronization in multiprocessors.  The only assumptions made in
    developing the set of primitives are that hardware combining is not
    implemented in the inter-connect, and (in one case) that the interconnect
    supports broadcast.  The primitives make use of synchronization bits
    (syncbits) to provide a simple mechanism for mutual exclusion.  The
    proposed implementation of the primitives includes efficient (i.e.  local)
    busy-waiting for syncbits.  In addition, a hardware-supported mechanism for
    maintaining a first-come first-serve queue of requests for a syncbit is
    proposed.  This queueing mechanism allows for a very efficient
    implementation of, as well as fair access to, binary semaphores.  We also
    propose to implement Fetch and Add with combining in software rather than
    hardware.  This allows an architecture to scale to a large number of
    processors while avoiding the cost of hardware combining.  Scenarios for
    common synchronization events such as work queues and barriers are
    presented to demonstrate the generality and ease of use of the proposed
    primitives.  The efficient implementation of the primitives is simpler if
    the multiprocessor has a hardware cache-consistency protocol.  To
    illustrate this point, we outline how the primitives would be implemented
    in the Multicube multiprocessor [GoWo88].", 
  location     = "https://doi.org/10.1145/70082.68188"
}

@Article{edpfm,
  author       = "Aral, Ziya and Gerther, Ilya and Schaffer, Greg",
  title        = "Efficient Debugging Primitives for Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "87--95",
  month        = may,
  keywords     = "parallel debugging, multiprocessor debugging, thread-based
    debugging, dynamic debugging", 
  abstract     = "Existing kernel-level debugging primitives are inappropriate
    for instrumenting complex sequential or parallel programs.  These functions
    incur a heavy overhead in their use of system calls and process switches.
    Context switches are used to alternately invoke the debugger and the target
    programs.  System calls are used to communicate data between the target and
    debugger.  None of this is necessary in shared-memory multiprocessors.
    Multiple processors concurrently run both the debugger and the target.
    Shared-memory is used to implement efficient communication.  The target's
    state is accessed by running both the target and the debugger in the same
    address space.  Finally, instrumentation points, which have largely been
    implemented as traps to the system, are reimplemented as simple branches to
    routines of arbitrary complexity maintained by the debugger.  Not only are
    primitives such as conditional breakpoints thus generalized, but their
    efficiency is improved by several orders of magnitude.  In the process,
    much of the traditional system's kernel support for debugging is
    reimplemented at user-level.  This paper describes the implementation of
    debugging primitives in Parasight, a parallel programming environment.
    Parasight has been used to implement conditional breakpoints, an important
    primitive for both high-level and parallel debugging.  Preliminary
    measurements indicate that Parasight breakpoints are 1000 times faster than
    the breakpoints in parallel &ldquo;cdb&rdquo;, a conventional UNIX
    debugger.  Light-weight conditional breakpoints open up new opportunities
    for debugging and profiling both parallel and sequential programs.", 
  location     = "https://doi.org/10.1145/70082.68190"
}

@Article{smasfssaraps,
  author       = "Staknis, Mark~E.",
  title        = "Sheaved Memory:  Architectural Support for State Saving and Restoration and Paged Systems",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "96--102",
  month        = may,
  keywords     = "memory management, virtual memory, recovery blocks,
    check-pointing, recovery points",
  abstract     = "The concept of read-one/write-many paged memory is introduced
    and given the name sheaved memory.  It is shown that sheaved memory is
    useful for efficiently maintaining checkpoints in main memory and for
    providing state saving and state restoration for software that includes
    recovery blocks or similar control structures.  The organization of sheaved
    memory is described in detail, and a design is presented for a prototype
    sheaved-memory module that can be built easily from inexpensive,
    off-the-shelf components.  The module can be incorporated within many
    available computers without altering the computers' hardware design.  The
    concept of sheaved memory is simple and appealing, and its potential for
    use in a number of software contexts is foreseen.", 
  location     = "https://doi.org/10.1145/70082.68191"
}

@Article{rhpsamdilsra,
  author       = "Holliday, Mark~A.",
  title        = "Reference History, Page Size, and Migration Daemons in Local\slash Remote Architectures",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "104--112",
  month        = may,
  keywords     = "numa machines, storage management, paging management, data
    migration, software address translation", 
  abstract     = "We address the problem of paged main memory management in the
    local/remote architecture subclass of shared memory multiprocessors.  We
    consider the case where the operating system has primary responsibility and
    uses page migration as its main tool.  We identify some of the key issues
    with respect to architectural support (reference history maintenance, and
    page size), and operating system mechanism (duration between daemon passes,
    and number of migration daemons).  The experiments were conducted using
    software implemented page tables on 32-node BBN Butterfly Plus&trade;.
    Several numeral programs with both synthetic and real data were used as the
    workload.  The primary conclusion is that for the cases considered
    migration was at best marginally effective.  On the other hand, practical
    migration mechanisms were robust and never significantly degraded
    performance.  The specific results include: 1) Referenced bits with aging
    can closely approximate Usage fields, 2) larger page sizes are beneficial
    except when the page is large enough to include locality sets of two
    processes, and 3) multiple migration daemons can be useful.  Only small
    regions of the space of architectural, system, and workload parameters were
    explored.  Further investigation of other parameter combinations is clearly
    warranted.", 
  location     = "https://doi.org/10.1145/70082.68192"
}

@Article{auvssfpa,
  author       = "Jouppi, Norman~P. and Bertoni, Jonathan and Wall, David~W.",
  title        = "{A} Unified Vector\slash Scalar Floating-Point Architecture",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "134--143",
  month        = may,
  keywords     = "cpu architecture, vectorization, performance, register files,
    pipelining",
  abstract     = "In this paper we present a unified approach to vector and
    scalar computation, using a single register file for both scalar operands
    and vector elements.  The goal of this architecture is to yield improved
    scalar performance while broadening the range of vectorizable applications.
    For example, reduction operations and recurrences can be expressed in
    vector form in this architecture.  This approach results in greater overall
    performance for most applications than does the approach of emphasizing
    peak vector performance.  The hardware required to support the enhanced
    vector capability is insignificant, but allows the execution of two
    operations per cycle for vectorized code.  Moreover, the size of the
    unified vector/scalar register file required for peak performance is an
    order of magnitude smaller than traditional vector register files, allowing
    efficient on-chip VLSI implementation.  The results of simulations of the
    Livermore Loops and Linpack using this architecture are presented.", 
  location     = "https://doi.org/10.1145/70082.68195", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/WRL-89-8.html"
}

@Article{fctflda,
  author       = "Gibson, Garth~A. and Hellerstein, Lisa and Karp, Richard~M. and Patterson, David~A.",
  title        = "Failure Correction Techniques for Large Disk Arrays",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "123--132",
  month        = may,
  keywords     = "raid, error coding, parity, linear coding, coding
    performance, data reconstruction, error correcting coding",
  abstract     = "The ever increasing need for I/O bandwidth will be met with
    ever larger arrays of disks.  These arrays require redundancy to protect
    against data loss.  This paper examines alternative choices for encodings,
    or codes, that reliably store information in disk arrays.  Codes are
    selected to maximize mean time to data loss or minimize disks containing
    redundant data, but are all constrained to minimize performance penalties
    associated with updating information or recovering from catastrophic disk
    failures.  We also codes that give highly reliable data storage with low
    redundant data overhead for arrays of 1000 information disks.",
  location     = "https://doi.org/10.1145/70082.68194"
}

@Article{tlbcasa,
  author       = "Black, David~L. and Rashid, Richard~F. and Golub, David~B. and Hill, Charles~R. and Baron, Robert~V.",
  title        = "Translation Lookaside Buffer Consistency:  {A} Software Approach",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "113--122",
  month        = may,
  keywords     = "mach, virtual memory, tlb consistency, consistency protocols,
    performance, software-hardware trade-offs",
  abstract     = "We discuss the translation lookaside buffer (TLB) consistency
    problem for multiprocessors, and introduce the Mach shootdown algorithm for
    maintaining TLB consistency in software.  This algorithm has been
    implemented on several multiprocessors, and is in regular production use.
    Performance evaluations establish the basic costs of the algorithm and show
    that it has minimal impact on application performance.  As a result, TLB
    consistency does not pose an insurmountable obstacle to multiprocessors
    with several hundred processors.  We also discuss hardware support options
    for TLB consistency ranging from a minor interrupt structure modification
    to complete hardware implementations.  Features are identified in current
    hardware that compound the TLB consistency problem; removal or correction
    of these features can simplify and/or reduce the overhead of maintaining
    TLB consistency in software.", 
  location     = "https://doi.org/10.1145/70082.68193", 
  location     = "https://www.cs.rice.edu/~alc/comp521/Papers/p113-black.pdf"
}

@Article{dbrtvcts,
  author       = "Mulder, Hans",
  title        = "Data Buffering:  Run-time versus Compile-time Support",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "144--151",
  month        = may,
  keywords     = "register allocation, cpu architecture, execution performance,
    stack buffers, register set windows",
  abstract     = "Data-dependency, branch, and memory-access penalties are main
    constraints on the performance of high-speed microprocessors.  The
    memory-access penalties concern both penalties imposed by external memory
    (e.g.  cache) or by under utilization of the local processor memory (e.g.
    registers).  This paper focuses solely on methods of increasing the
    utilization of data memory, local to the processor (registers or
    register-oriented buffers).  A utilization increase of local processor
    memory is possible by means of compile-time software, run-time hardware, or
    a combination of both.  This paper looks at data buffers which perform
    solely because of the compile-time software (single register sets); those
    which operate mainly through hardware but with possible software assistance
    (multiple register sets); and those intended to operate transparently with
    main memory implying no software assistance whatsoever (stack buffers).
    This paper shows that hardware buffering schemes cannot replace
    compile-time effort, but at most can reduce the complexity of this effort.
    It shows the utility increase of applying register allocation for multiple
    register sets.  The paper also shows a potential utility decrease inherent
    to stack buffers.  The observation that a single register set, allocated by
    means of interprocedural allocation, performs competitively with both
    multiple register set and stack buffer emphasizes the significance of the
    conclusion", 
  location     = "https://doi.org/10.1145/70082.68196"
}

@Article{artspfat,
  author       = "Roos, Joachim",
  title        = "{A} Real-Time Support Procesor for {Ada} Tasking",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "162--171",
  month        = may,
  keywords     = "ada, tasking, hardware compilation, coprocessors",
  abstract     = "Task synchronization in Ada causes excessive run-time
    overhead due to the complex semantics of the rendezvous.  To demonstrate
    that the speed can be increased by two orders of magnitude by using special
    purpose hardware, a single chip VLSI support processor has been designed.
    By providing predictable and uniformly low overhead for the entire
    semantics of a rendezvous, the powerful real-time constructs of Ada can be
    used freely without performance degradation.  The key to high performance
    is the set of primitive operations implemented in hardware.  Each operation
    is complex enough to replace a considerable amount of code was designed to
    execute with a minimum of communication overhead.  Task control blocks are
    stored on-chip as well as headers for entry, delay and ready queues.  All
    necessary scheduling is integrated in the operations.  Delays are handled
    completely on-chip using an internal real-time clock.  A multilevel design
    strategy, based on silicon compilation, made it possible to run actual Ada
    programs on a functional emulator of the chip and use the results to verify
    the detailed design.  A high degree of parallelism and pipelining together
    with an elaborate internal addressing scheme has reduced the number of
    clock cycles needed to perform each operation.  Using 2 &mgr;m CMOS, the
    processor can run at 20 MHz.  A complex rendezvous, including the calling
    sequence and all necessary scheduling, can be performed in less than 15
    microsecs.", 
  location     = "https://doi.org/10.1145/70082.68198"
}

@Article{aao8isuimdp,
  author       = "Adams, Thomas~L. and Zimmerman, Richard~E.",
  title        = "An Analysis of 8086 Instruction Set Usage in {MS} {DOS} Programs",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "152--161",
  month        = may,
  keywords     = "instruction frequency counts, dynamic program behavior, intel
    processors, dynamic architectural evaluation",
  abstract     = "An architectural evaluation must be based upon real programs
    in an actual operating environment.  The ubiquitous IBM Personal Computer
    running MS DOS represents an excellent test bed for architectural
    evaluation of Intel 8086 systems.  There are many programs and tools
    available to evaluate the performance of IBM Personal Computers and
    compatibles; these evaluation tools are intended to relate the performance
    of one machine to another.  Very little data is available on dynamic
    instruction traces in systems using an 8086.  This paper reports on dynamic
    traces of 8086/88 programs obtained using software tracing tools (described
    below).  The objective of this work is to analyze instruction usage and
    addressing modes used in actual software.  The system used to obtain the
    dynamic instruction frequencies was a compatible running MS DOS 3.1 with a
    Softpatch bios.  To illustrate the RISC argument that only a few
    instruction types are sufficient, the 8086 results are compared with
    similar studies on the Motorola 6800 and Digital Equipment VAX-11.", 
  location     = "https://doi.org/10.1145/70082.68197"
}

@Article{trefsasiot8,
  author       = "Vegdahl, Steven~R. and Pleban, Uwe~F.",
  title        = "The Runtime Environment for {Screme}, a {Scheme} Implementation on the 88000",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "172--182",
  month        = may,
  keywords     = "scheme, runtime environments, tagged data, procedure call and
    return",
  abstract     = "We are implementing a Scheme development system for the
    Motorola 88000. The core of the implementation is an optimizing native code
    compiler, together with a carefully designed runtime system.  This paper
    describes our experiences with the 88000 as a target architecture.  We
    focus on the design decisions concerning the runtime system, particularly
    with respect to data type representations, tag checking, procedure calling
    protocol, generic arithmetic, and the handling of continuations.  We also
    discuss rejected design alternatives, and evaluate the strengths and
    weaknesses of the instruction set with respect to our constraints.", 
  location     = "https://doi.org/10.1145/70082.68199"
}

@Article{pofic,
  author       = "McFarling, Scott",
  title        = "Program Optimization for Instruction Caches",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "183--191",
  month        = may,
  keywords     = "instruction caches, cache hit ratios, code rearrangement,
    performance", 
  abstract     = "This paper presents an optimization algorithm for reducing
    instruction cache misses.  The algorithm uses profile information to
    reposition programs in memory so that a direct-mapped cache behaves much
    like an optimal cache with full associativity and full knowledge of the
    future.  For best results, the cache should have a mechanism for excluding
    certain instructions designated by the compiler.  This paper first presents
    a reduced form of the algorithm.  This form is shown to produce an optimal
    miss rate for programs without conditionals and with a tree call graph,
    assuming basic blocks can be reordered at will.  If conditionals are
    allowed, but there are no loops within conditionals, the algorithm does as
    well as an optimal cache for the worst case execution of the program
    consistent with the profile information.  Next, the algorithm is extended
    with heuristics for general programs.  The effectiveness of these
    heuristics are demonstrated with empirical results for a set of 10 programs
    for various cache sizes.  The improvement depends on cache size.  For a 512
    word cache, miss rates for a direct-mapped instruction cache are halved.
    For an 8K word cache, miss rates fall by over 75%.  Over a wide range of
    cache sizes the algorithm is as effective as increasing the cache size by a
    factor of 3 times.  For 512 words, the algorithm generates only 32% more
    misses than an optimal cache.  Optimized programs on a direct-mapped cache
    have lower miss rates than unoptimized programs on set-associative caches
    of the same size.", 
  location     = "https://doi.org/10.1145/70082.68200"
}

@Article{urtocdcp,
  author       = "Karger, Paul~A.",
  title        = "Using Registers to Optimize Cross-Domain Call Performance",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "194--204",
  month        = may,
  keywords     = "capabilities, cross-domain transfers, performance, register
    set management, compiler optimizations, procedure calls",
  abstract     = "This paper describes a new technique to improve the
    performance of cross-domain calls and returns in a capability-based
    computer system.  Using register optimization information obtained from the
    compiler, a trusted linker can minimize the number of registers that must
    be saved, restored, or cleared when changing from one protection domain to
    another.  The size of the performance gain depends on the level of trust
    between the calling and called protection domains.  The paper presents
    alternate implementations for an extended VAX architecture and for a RISC
    architecture and reports performance measurements done on a
    re-microprogrammed VAX-11/730 processor.", 
  location     = "https://doi.org/10.1145/70082.68201"
}

@Article{tdonanbfhm,
  author       = "Arnould, Emmanuel and Kung, H.~T. and Bitz, Fran{\c c}ois and Sansom, Robert~D. and Cooper, Eric~C. and Peter~A. Steenkiste",
  title        = "The Design of {Nectar}:  {A} Network Backplane for Heterogeneous Multicomputers",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "205--216",
  month        = may,
  keywords     = "network infrastructure, large-grained parallelism,
    communications processors",
  abstract     = "Nectar is a &ldquo;network backplane&rdquo; for use in
    heterogeneous multicomputers.  The initial system consists of a star-shaped
    fiber-optic network with an aggregate bandwidth of 1.6 gigabits/second and
    a switching latency of 700 nanoseconds.  The system can be scaled up by
    connecting hundreds of these networks together.  The Nectar architecture
    provides a flexible way to handle heterogeneity and task-level parallelism.
    A wide variety of machines can be connected as Nectar nodes and the Nectar
    system software allows applications to communicate at a high level.
    Protocol processing is off-loaded to powerful communication processors so
    that nodes do not have to support a suite of network protocols.  We have
    designed and built a prototype Nectar system that has been operational
    since November 1988.  This paper presents the motivation and goals for
    Nectar and describes its hardware and software.  The presentation
    emphasizes how the goals influenced the design decisions and led to the
    novel aspects of Nectar.", 
  location     = "https://doi.org/10.1145/70082.68202"
}

@Article{amdopm,
  author       = "Delgado-Rannauro, Sergio~A. and Reynolds, T.~J.",
  title        = "{A} Message Driven {OR}-Parallel Machine",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "217--228",
  month        = may,
  keywords     = "logic programming, abstract machines, binding environments,
    task scheduling, storage management",
  abstract     = "A message driven architecture for the execution of
    OR-parallel logic languages is proposed.  The computational model is based
    on well known compilation techniques for Logic Languages.  We present first
    the multiple binding mechanism for the OR-parallel Prolog architecture and
    the corresponding OR-parallel abstract machine is described.  A scheduling
    algorithm which does not rely upon the availability of global data
    structures to direct the search for work is discussed.  The message driven
    processor, the processing node of the parallel machine, is designed to
    interact with a shared global address space and to efficiently process
    messages from other processing nodes.  We discuss some of the results
    obtained from a high level functional simulator of the message driven
    machine.", 
  location     = "https://doi.org/10.1145/70082.68203"
}

@Article{etposcc,
  author       = "Owicki, Susan and Agarwal, Anant",
  title        = "Evaluating the Performance of Software Cache Coherence",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "230--242",
  month        = may,
  keywords     = "cache coherence protocols, bus-based architecture,
    interconnection architecture, performance analysis",
  abstract     = "In a shared-memory multiprocessor with private caches, cached
    copies of a data item must be kept consistent.  This is called cache
    coherence.  Both hardware and software coherence schemes have been
    proposed.  Software techniques are attractive because they avoid hardware
    complexity and can be used with any processor-memory interconnection.  This
    paper presents an analytical model of the performance of two software
    coherence schemes and, for comparison, snoopy-cache hardware.  The model is
    validated against address traces from a bus-based multiprocessor.  The
    behavior of the coherence schemes under various workloads is compared, and
    their sensitivity to variations in workload parameters is assessed.  The
    analysis shows that the performance of software schemes is critically
    determined by certain parameters of the workload: the proportion of data
    accesses, the fraction of shared references, and the number of times a
    shared block is accessed before it is purged from the cache.  Snoopy caches
    are more resilient to variations in these parameters.  Thus when evaluating
    a software scheme as a design alternative, it is essential to consider the
    characteristics of the expected workload.  The performance of the two
    software schemes with a multistage interconnection network is also
    evaluated, and it is determined that both scale well.", 
  location     = "https://doi.org/10.1145/70082.68204", 
  location     = "http://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-41.html"
}

@Article{aocipim,
  author       = "Weber, Wolf-Dietrich and Gupta, Anoop",
  title        = "Analysis of Cache Invalidation Patterns in Multiprocessors",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "243--256",
  month        = may,
  keywords     = "multiprocessor programs, program traces, trace analysis, data
    access patterns, cache invalidation, cache directories",
  abstract     = "To make shared-memory multiprocessors scalable, researchers
    are now exploring cache coherence protocols that do not rely on broadcast,
    but instead send invalidation messages to individual caches that contain
    stale data.  The feasibility of such directory-based protocols is highly
    sensitive to the cache invalidation patterns that parallel programs
    exhibit.  In this paper, we analyze the cache invalidation patterns caused
    by several parallel applications and investigate the effect of these
    patterns on a directory-based protocol.  Our results are based on
    multiprocessor traces with 4, 8 and 16 processors.  To gain insight into
    what the invalidation patterns would look like beyond 16 processors, we
    propose a classification scheme for data objects found in parallel
    applications and link the invalidation traffic patterns observed in the
    traces back to these high-level objects.  Our results show that
    synchronization objects have very different invalidation patterns from
    those of other data objects.  A write reference to a synchronization object
    usually causes invalidations in many more caches.  We point out situations
    where restructuring the application seems appropriate to reduce the
    invalidation traffic, and others where hardware support is more
    appropriate.  Our results also show that it should be possible to scale
    well-written parallel programs to a large number of processors without an
    explosion in invalidation traffic.", 
  location     = "https://doi.org/10.1145/70082.68205"
}

@Article{teosotcabpopp,
  author       = "Eggers, Susan~J. and Katz, Randy~H.",
  title        = "The Effect of Sharing on the Cache and Bus Performance of Parallel Programs",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "257--370",
  month        = may,
  keywords     = "multiprocessor caches, cache invalidation, cache performance,
    parallel performance, write invalidation, storage access patterns, cache
    parameters",
  abstract     = "Bus bandwidth ultimately limits the performance, and
    therefore the scale, of bus-based, shared memory multiprocessors.  Previous
    studies have extrapolated from uniprocessor measurements and simulations to
    estimate the performance of these machines.  In this study, we use traces
    of parallel programs to evaluate the cache and bus performance of shared
    memory multiprocessors, in which coherency is maintained by a
    write-invalidate protocol.  In particular, we analyze the effect of sharing
    overhead on cache miss ratio and bus utilization.  Our studies show that
    parallel programs incur substantially higher miss ratios and bus
    utilization than comparable uniprocessor programs.  The sharing component
    of these metrics proportionally increases with both cache and block size,
    and for some cache configurations determines both their magnitude and
    trend.  The amount of overhead depends on the memory reference pattern to
    the shared data.  Programs that exhibit good per-processor-locality perform
    better than those with fine-grain-sharing.  This suggests that parallel
    software writers and better compiler technology can improve program
    performance through better memory organization of shared data.", 
  location     = "https://doi.org/10.1145/70082.68206", 
  location     = "http://www2.eecs.berkeley.edu/Pubs/TechRpts/1988/CSD-88-475.pdf"
}

@Article{moofpo,
  author       = "Dally, William~J.",
  title        = "Micro-Optimization of Floating-Point Operations",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "283--289",
  month        = may,
  keywords     = "floating-point operations, microFPUs, compiler optimizations",
  abstract     = "This paper describes micro-optimization, a technique for
    reducing the operation count and time required to perform floating-point
    calculations.  Micro-optimization involves breaking floating-point
    operations into their constituent micro-operations and optimizing the
    resulting code.  Exposing micro-operations to the compiler creates many
    opportunities for optimization.  Redundant normalization operations can be
    eliminated or combined.  Also, scheduling micro-operations separately
    allows dependent operations to be partially overlapped.  A prototype
    expression compiler has been written to evaluate a number of
    micro-optimizations.  On a set of benchmark expressions operation count is
    reduced by 33% and execution time is reduced by 40%.", 
  location     = "https://doi.org/10.1145/70082.68208"
}

@Article{ailpfsasm,
  author       = "Jouppi, Norman~P. and Wall, David~W.",
  title        = "Available Instruction-Level Parallelism for Superscalar and Superpipelined Machines",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "272--282",
  month        = may,
  keywords     = "parallelism, pipelining, super-scalar issue",
  abstract     = "Superscalar machines can issue several instructions per
    cycle. Superpipelined machines can issue only one instruction per cycle,
    but they have cycle times shorter than the latency of any functional unit.
    In this paper these two techniques are shown to be roughly equivalent ways
    of exploiting instruction-level parallelism.  A parameterizable code
    reorganization and simulation system was developed and used to measure
    instruction-level parallelism for a series of benchmarks.  Results of these
    simulations in the presence of various compiler optimizations are
    presented.  The average degree of superpipelining metric is introduced.
    Our simulations suggest that this metric is already high for many machines.
    These machines already exploit all of the instruction-level parallelism
    available in many non-numeric applications, even without parallel
    instruction issue or higher degrees of pipelining.", 
  location     = "https://doi.org/10.1145/70082.68207"
}

@Article{lomii,
  author       = "Smith, Michael~D. and Johnson, Mike and Horowitz, Mark~A.",
  title        = "Limits on Multiple Instruction Issue",
  journal      = asplos89,
  year         = 1989,
  volume       = 24,
  number       = 5,
  pages        = "290--302",
  month        = may,
  keywords     = "superscalar issue, architecture simulation, instruction-level
    concurrency",
  abstract     = "This paper investigates the limitations on designing a
    processor which can sustain an execution rate of greater than one
    instruction per cycle on highly-optimized, non-scientific applications.  We
    have used trace-driven simulations to determine that these applications
    contain enough instruction independence to sustain an instruction rate of
    about two instructions per cycle.  In a straightforward implementation,
    cost considerations argue strongly against decoding more than two
    instructions in one cycle.  Given this constraint, the efficiency in
    instruction fetching rather than the complexity of the execution hardware
    limits the concurrency attainable at the instruction level.", 
  location     = "https://doi.org/10.1145/70082.68209"
}

@Article{otdooss,
  author       = "Lauer, Hugh~C. and Needham, Roger~M.",
  title        = "On the Duality of Operating System Structures",
  journal      = osr,
  year         = 1979,
  volume       = 13,
  number       = 2,
  pages        = "3--19",
  month        = apr,
  keywords     = "message passing, single-thread procedures, duality, operating
    system structure",
  abstract     = "Many operating system designs can be placed into one of two
    very rough categories, depending upon how they implement and use the
    notions of process and synchronization.  One category, the Message-oriented
    System, is characterized by a relatively small, static number of processes
    with an explicit message system for communicating among them.  The other
    category, the Procedure-oriented System, is characterized by a large,
    rapidly changing number of small processes and a process synchronization
    mechanism based on shared data.  In this paper, it is demonstrated that these
    two categories are duals of each other and that a system which is
    constructed according to one model has a direct counterpart in the other.
    The principal conclusion is that neither model is inherently preferable,
    and the main consideration for choosing between them is the nature of the
    machine architecture upon which the system is being built, not the
    application which the system will ultimately support.", 
  location     = "https://doi.org/10.1145/850657.850658"
}

@Article{aoefbpps,
  author       = "Bershad, Brian~N. and Lazowska, Edward~D. and Levy, Henry~M. and Wagner, David~B.",
  title        = "An Open Environment for Building Parallel Programming Systems",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "1--9",
  month        = sep,
  keywords     = "object-oriented design, parallel programming, open systems,
    component customization, presto, synapse",
  abstract     = "PRESTO is a set of tools for building parallel programming
    systems on shared-memory multiprocessors.  PRESTO's goal is to provide a
    framework within which one can easily build efficient support for any of a
    wide variety of &ldquo;models&rdquo; of parallel programming.  PRESTO is
    designed for easy modification and extension, not only at the level of the
    primitives and structures made available for the application programmer's
    use, but also at the level of the run-time kernel that supports parallel
    applications.  PRESTO is implemented in the object-oriented language C++ on
    a Sequent Balance 21000 and has been used in a number of applications that
    are described in this paper.", 
  location     = "https://homes.cs.washington.edu/~bershad/Papers/p1-bershad.pdf"
}

@Article{ewpdn,
  author       = "Notkin, David and Snyder, Lawrence and Socha, David and Bailey, Mary~L. and Forstall, Bruce and Gates, Kevin and Greenlaw, Ray and Griswold, Willian~G. and Holman, Thomas~J. and Korry, Richard and Lasswell, Gemini and Mitchell, Robert and Nelson, Philip~A.",
  title        = "Experiences with {Poker}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "10--20",
  month        = sep,
  keywords     = "parallel programming, graphical programming environments,
    graphical programming languages, portability",
  abstract     = "Experience from over five years of building nonshared memory
    parallel programs using the Poker Parallel Programming Environment has
    positioned us to evaluate our approach to defining and developing parallel
    programs.  This paper presents the more significant results of our
    evaluation of Poker.  The evaluation is driving our next effort in parallel
    programming environment; many of the results should be sufficiently general
    to apply to other related efforts.", 
  location     = "https://doi.org/10.1145/62115.62118"
}

@Article{niaipip,
  author       = "Aral, Ziya and Gertner, Ilya",
  title        = "Non-Intrusive and Interactive Profiling in {Parasight}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "21--30",
  month        = sep,
  keywords     = "parallel programming, debugging, profiling, single-address spaces",
  abstract     = "Debugging the performance of parallel applications is crucial
    for fully utilizing the potential of multiprocessor hardware.  This paper
    describes profiling tools in Parasight, a programming environment that is
    geared towards non-intrusive performance analysis and high-level debugging.
    In Parasight, profilers execute as observer programs which run concurrently
    with the target program and monitor its behavior.  This design grew out of
    our experience in debugging and monitoring the performance of real parallel
    programs.  Parasight is used to implement an interactive profiler based on
    gprof, a standard UNIX profiling tool.  The new profiler is an interactive
    tool that is dynamically controlled by the programmer and can run
    concurrently with the target program.  It is also less intrusive than the
    original.  This was achieved in part by off-loading the profile gathering
    computations to an adjacent processor and in part by allowing selective
    profiling.  In conjunction with the new profiler, Parasight is used to
    implement high-level custom profiling routines that may be inserted at
    arbitrary locations in a target program to measure user-defined
    abstractions.  One outcome has been to develop the beginnings of a
    profiling methodology in which high-level performance problems are detected
    through a function profiler and detailed performance bottlenecks are
    analyzed with custom profiling routines.  Parasight, the new profiler and
    their associated tools have been implemented on the Encore Multimax, a
    shared-memory multiprocessor running UNIX.  They have been used to profile
    both parallel and sequential programs.", 
  location     = "https://doi.org/10.1145/62115.62119"
}

@Article{pdfasa,
  author       = "Bernd Bruegge",
  title        = "Program Development for a Systolic Array",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "31--41",
  month        = sep,
  keywords     = "program-development environments, systolic arrays,
    co-processing, parallel programming, warp",
  abstract     = "The primary objective of the Warp programming environment
    (WPE) is to simplify the use of Warp, a high-performance programmable
    linear systolic array connected to a general-purpose workstation host.  WPE
    permits the development of distributed applications that access Warp either
    locally from the host or remotely from a large number of workstations
    connected to a local area network.  Its audience includes the user who
    calls routines from a library, the programmer who develops new algorithms
    for Warp, as well as the implementor who writes support software.  Since
    the linear arrangement of the cells in the array restricts direct input and
    output with the host to the boundary cells, a source language debugger is
    important for program development on Warp.  This paper presents the Warp
    debugger and its relation to the other components of the Warp programming
    environment.", 
  location     = "https://doi.org/10.1145/62115.62120", 
  location     = "http://reports-archive.adm.cs.cmu.edu/anon/1994/CMU-CS-94-180.ps"
}

@Article{cf8afftcmcs,
  author       = "Albert, Eugene and Knobe, Kathleen and Lukas, Joan~D. and {Steele Jr.}, Guy~L.",
  title        = "Compiling {Fortran} 8x Array Features for the {Connection Machine} Computer System",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "42--56",
  month        = sep,
  keywords     = "simd computing, parallel compilation, matrix computations,
    connection machine, hypercube networks, optimizations",
  abstract     = "The Connection Machine&reg; computer system supports a data
    parallel programming style, making it a natural target architecture for
    Fortran 8x array constructs.  The Connection Machine Fortran compiler
    generates VAX code that performs scalar operations and directs the
    Connection Machine to perform array operations.  The Connection Machine
    virtual processor mechanism supports elemental operations on very large
    arrays.  Most array operators and intrinsic functions map into single
    instructions or short instruction sequences.  Noncontiguous array sections,
    array-valued subscripts, and parallel constructs such as WHERE and FORALL
    are also readily accommodated on the Connection Machine.  In addition to
    such customary optimizations as common subexpression elimination, the CM
    Fortran compiler minimizes data motion for aligning array operations,
    minimizes transfers between the Connection Machine and the VAX and
    minimizes context switching for masked computations.", 
  location     = "https://doi.org/10.1145/62115.62121"
}

@Article{ccpfahm,
  author       = "Quinn, Michael~J. and Hatcher, Philip~J. and Jourdenais, Karen~C.",
  title        = "Compiling {C}* Programs for a Hypercube Multicomputer",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "57--65",
  month        = sep,
  keywords     = "hypercube interconnects, parallel compilation, message passing",
  abstract     = "A data parallel language such as C* has a number of
    advantages over conventional hypercube programming languages.  The
    algorithm design process is simpler, because (1) message passing is
    invisible, (2) race conditions are nonexistent, and (3) the data can be put
    into a one-to-one correspondence with the virtual processors.  Since data
    are mapped to virtual processors, rather than physical processors, it is
    easier to move algorithms implemented on one size hypercube to a larger or
    smaller system.  We outline the design of a C* compiler for a hypercube
    multicomputer.  Our design goals are to minimize the amount of time spent
    synchronizing, limit the number of interprocessor communications, and make
    each physical processor's emulation of a set of virtual processors as
    efficient as possible.  We have hand translated three benchmark programs
    and compared their performance with that of ordinary C programs.  All three
    programs -- matrix multiplication, LU decomposition, and hyperquicksort -- 
    achieve reasonable speedup on a commercial hypercube, even when solving
    problems of modest size.  On a 64-processor NCUBE/7, the C* matrix
    multiplication program achieves a speedup of 27 when multiplying two 64
    &times; 64 matrices, the hyperquicksort program achieves a speedup of 10
    when sorting 16,384 integers, and LU decomposition attains a speedup of 7
    when decomposing a 256 &times; 256 system of linear equations.  We believe
    the degradation in machine performance resulting from the use of a data
    parallel language will be more than compensated for by the increase in
    programmer productivity.",
  location     = "https://doi.org/10.1145/62115.62122"
}

@Article{pdesofsqn,
  author       = "David~M. Nicol",
  title        = "Parallel Discrete-Event Simulation Of {FCFS} Stochastic Queueing Networks",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "124--137",
  month        = sep,
  keywords     = "discrete event simulation, parallel evaluation, lookahead,
    performance, network simulation ",
  abstract     = "Physical systems are inherently parallel; intuition suggests
    that simulations of these systems may be amenable to parallel execution.
    The parallel execution of a discrete-event simulation requires careful
    synchronization of processes in order to ensure the execution's
    correctness; this synchronization can degrade performance.  Largely
    negative results were recently reported in a study which used a well-known
    synchronization method on queueing network simulations.  In this paper we
    discuss a synchronization method, appointments, which has proven itself to
    be effective on simulations of FCFS queueing networks.  The key concept
    behind appointments is the provision of lookahead.  Lookahead is a
    prediction on a processor's future behavior, based on an analysis of the
    processor's simulation state.  We show how lookahead can be computed for
    FCFS queueing network simulations, give performance data that demonstrates
    the method's effectiveness under moderate to heavy loads, and discuss
    performance trade-offs between the quality of lookahead, and the cost of
    computing lookahead.", 
  location     = "https://doi.org/10.1145/62115.62128"
}

@Article{qeand,
  author       = "Goldman, Ron and Gabriel, Richard~P.",
  title        = "Qlisp:  Experience and New Directions",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "111--123",
  month        = sep,
  keywords     = "common lisp, parallel lisp, futures, parallel programming",
  abstract     = "Qlisp, a dialect of Common Lisp, has been proposed as a 
    multiprocessing programming language which is suitable for studying the
    styles of parallel programming at the medium-grain level.  An initial
    version of Qlisp has been implemented on a multiprocessor and a number of
    experiments with it conducted.  This paper describes the implementation,
    reports on some of the experiments, and presents some new constructs that
    are suggested from programming experience with Qlisp.", 
  location     = "https://doi.org/10.1145/62116.62127"
}

@Article{rlpfce,
  author       = "Larus, James~R. and Hilfinger, Paul~N.",
  title        = "Restructuring {Lisp} Programs for Concurrent Execution",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "100--110",
  month        = sep,
  keywords     = "lisp, program analysis, parallelization, program dependency
    graph, aliases, program transformations, synchronization",
  abstract     = "This paper describes the techniques that the program
    transformation system CURARE uses to restructure Lisp programs for
    concurrent execution in multiprocessor Lisp systems and discusses the
    problems inherent in producing concurrent programs in a flexible and
    dynamic programming language such as Lisp.  CURARE's overall organization
    is similar to other program restructuring systems: it detects potential
    conflicts between statements in a program, then transforms the program to
    improve its concurrent performance, and finally inserts synchronization to
    ensure the program's concurrent behavior.  However, the language and
    programs that CURARE transforms are very different from the FORTRAN
    programs that are the traditional targets of program restructuring and so
    CURARE requires new algorithms and approaches, which are described in this
    paper.",
  location     = "https://doi.org/10.1145/62115.62126"
}

@Article{eiafpaar,
  author       = "Li, Zhiyuan and Yew, Pen-Chung",
  title        = "Efficient Interproedural Analysis for Program AParallelization and Restructuring",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "85--99",
  month        = sep,
  keywords     = "loop parallelization, subscript propagation, interprocedural
    analysis, program transformations",
  abstract     = "An approach to efficient interprocedural analysis for program
    parallelization and restructuring is presented.  Such analysis is needed
    for parallelizing loops which contain procedure calls.  Our approach
    captures call effect on data dependencies by propagating the precise
    information of array subscripts from the called procedure.  This allows the
    optimizing compiler to choose an efficient yet precise data dependence test
    scheme depending on the complexity of array reference patterns.  The other
    existing methods do not provide such flexibility, hence may suffer from
    either imprecision or inefficiency.  The paper also discusses usage of
    classical summary information in several important transformations for
    program parallelization.  Experimental results are reported.", 
  location     = "https://doi.org/10.1145/62115.62125"
}

@Article{udptiapa,
  author       = "Howard~P. Katseff",
  title        = "Using Data Partitioning to Implement a Parallel Assembler",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "66--76",
  month        = sep,
  keywords     = "parallel assembly, symbol relocation",
  abstract     = "A technique for implementing algorithms on a multiprocessor
    computer system is data partitioning, in which input data for a problem is
    partitioned among many processors that cooperate to solve the problem.
    This paper demonstrates that data partitioning is a good method for
    implementing an assembler on a message-passing multiprocessor system: it
    yields a speedup exceeding a factor of 6 with eight processors.  We compare
    several alternative methods for distributing program text and sharing
    global information among the processors executing the assembler: operations
    that are important for a variety of applications implemented with data
    partitioning.", 
  location     = "https://doi.org/10.1145/62115.62123"
}

@Article{adopataae,
  author       = "Burke, Michael and Cytron, Ron and Ferrante, Jeanne and Hsieh, Wilson and Sarkar, Vivek and Shields, David",
  title        = "Automatic Discovery of Parallelism:  {A} Tool and an Experiment",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "77--84",
  month        = sep,
  keywords     = "control flow analysis, data flow analysis, control dependency
    analysis, ",
  abstract     = "This paper reports preliminary results from applying advanced
    techniques to the parallelization of sequential programs.  Such techniques
    include interprocedural analysis and the identification of nested
    parallelism.  These techniques have been proposed for exploiting the
    greater concurrency offered by multiprocessors as compared with vector
    architectures.  The effectiveness of these techniques as applied to some
    popular numerical Fortran programs is examined.  Although extrapolation is
    difficult, these preliminary results are encouraging indicators of the
    success of these techniques.", 
  location     = "https://doi.org/10.1145/62115.62124"
}

@Article{speimpialps,
  author       = "Tambe, Milind and Kalp, Dirk and Gupta, Anoop and Forgy, Charles~L. and Milnes, Brian~G. and Newell, Allen",
  title        = "Soar/{PSM-E}:  Investigating Match Parallelism in a Learning Production System",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "146--160",
  month        = sep,
  keywords     = "production systems, parallel execution",
  abstract     = "Soar is an attempt to realize a set of hypotheses on the
    nature of general intelligence within a single system.  Soar uses a
    production system (rule based system) to encode its knowledge base.  Its
    learning mechanism, chunking, adds productions continuously to the
    production system.  The process of searching for relevant knowledge,
    matching, is known to be a performance bottleneck in production systems.
    PSM-E is a C-based implementation of the OPS5 production system on the
    Encore Multimax that has achieved significant speedups in matching.  In
    this paper we describe our implementation, Soar/PSM-E, of Soar on the
    Encore Multimax that is built on top of PSM-E.  We first describe the
    extensions and modifications required to PSM-E in order to support Soar,
    especially the capability of adding productions at run time as required by
    chunking.  We present the speedups obtained on Soar/PSM-E and discuss some
    effects of chunking on parallelism.  We also analyze the performance of the
    system and identify the bottlenecks limiting parallelism.  Finally, we
    discuss the work in progress to deal with some of them.", 
  location     = "https://doi.org/10.1145/62115.62130"
}

@Article{tpdaioaicgr,
  author       = "Rose, Jonathan",
  title        = "The Parallel Decomposition and Implementation of an Integrated Circuit Global Router",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "138--145",
  month        = sep,
  keywords     = "circuit routing, parallel execution",
  abstract     = "Better quality automatic layout of integrated circuits can be
    obtained by combining the placement and routing phases so that routing is
    used as the cost function for placement optimization.  Conventional routers
    are too slow to make this feasible, and so this paper presents a parallel
    decomposition and implementation of an integrated circuit global router.
    The LocusRoute router is divided into three orthogonal &ldquo;axes&rdquo;
    of parallelism: routing several wires at once, routing segments of a wire
    in parallel, and dividing up the potential routes of a segment among
    different processors to be evaluated.  The implementation of two of these
    approaches achieve significant speedup - wire-by-wire parallelism attains
    speedups from 6.9 to 13.6 using sixteen processors, and route-by-route
    achieves up to 4.6 using eight processors.  When combined, these approaches
    can potentially provide speedups of as much as 55 times.", 
  location     = "https://doi.org/10.1145/62115.62129"
}

@Article{lsppewtbbpp,
  author       = "Thomas~J. LeBlanc and Michael~L. Scott and Christopher~M. Brown",
  title        = "Large-Scale Parallel Programming:  Experience with the {BBN Butterfly Parallel Processor}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "161--172",
  month        = sep,
  keywords     = "multiprocessor, numa processor, butterfly switch, software
    tools, software libraries, programming abstractions, parallel programming,
    software development",
  abstract     = "For three years, members of the Computer Science Department
    at the University of Rochester have used a collection of BBN
    Butterfly&trade; Parallel Processors to conduct research in parallel
    systems and applications.  For most of that time, Rochester's 128-node
    machine has had the distinction of being the largest shared-memory
    multiprocessor in the world.  In the course of our work with the Butterfly
    we have ported three compilers, developed five major and several minor
    library packages, built two different operating systems, and implemented
    dozens of applications.  Our experience clearly demonstrates the
    practicality of large-scale shared-memory multiprocessors, with non-uniform
    memory access times.  It also demonstrates that the problems inherent in
    programming such machines are far from adequately solved.  Both locality
    and Amdahl's law become increasingly important with a very large number of
    nodes.  The availability of multiple programming models is also a concern;
    truly general-purpose parallel computing will require the development of
    environments that allow programs written under different models to coexist
    and interact.  Most important, there is a continuing need for high-quality
    programming tools; widespread acceptance of parallel machines will require
    the development of programming environments comparable to those available
    on sequential computers.", 
  location     = "https://doi.org/10.1145/62115.62131",
  location     = "https://www.cs.rochester.edu/u/scott/papers/1988_BPR22.pdf"
}

@Article{citlaf,
  author       = "Lee Anne Fennell",
  title        = "Common Intrest Tragedies",
  journal      = "Northwestern University Law Review",
  year         = 2004,
  volume       = 98,
  pages        = "907",
  keywords     = "commons tragedies, anticommons tragedies, prisoners' dilemma,
    chicken game",
  abstract     = "This paper engages one of the fastest-growing topics in
    property theory, the anticommons.  The anticommons idea originated in Frank
    Michelman's description of a regulatory regime in which nobody could use a
    particular resource without the permission of everyone else.  Michael
    Heller's subsequent construction of a category of anticommons property
    corresponding to recognizable resource problems sparked a surge of
    scholarly interest in the notion.  The anticommons template has now been
    applied in many property contexts, from patents to land use.  However, some
    of the key criteria scholars have offered for identifying an anticommons
    and distinguishing it from an ordinary commons collapse upon scrutiny.  The
    fragility of the existing boundaries between commons and anticommons
    suggests a larger question that takes center stage here: How might the
    universe of common and interdependent resource problems be most usefully
    carved up? In addressing that question, the paper makes three
    contributions.  First, it develops a functional taxonomy for categorizing
    common interest tragedies.  This taxonomy breaks tragedies into categories
    at the macro level based on the pattern of strategic interaction they
    embody, and further differentiates among tragedies at the micro level based
    on the shape of the production function for the resulting surplus or
    deficit.  Second, the paper explores underappreciated connections between
    types of resource-related dilemmas, and highlights the choices that often
    must be made between two potential tragedies in complex, interdependent
    settings.  Third, the paper shows how the taxonomy developed here offers
    access to analytic tools for making such choices.  The approach taken here
    is therefore designed to provide greater analytical traction on resource
    allocation problems, as well as to advance dialogue in this area of
    property theory.", 
  location     = "https://chicagounbound.uchicago.edu/cgi/viewcontent.cgi?article=8861&context=journal_articles"
}

@Article{aewl,
  author       = "Carriero, Nicholas and Gelernter, David",
  title        = "Applications Experience with {Linda}",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "173--187",
  month        = sep,
  keywords     = "tuple spaces, distributed programming, dna matching",
  abstract     = "We describe three experiments using C-Linda to write parallel
    codes. The first involves assessing the similarity of DNA sequences.  The
    results demonstrate Linda's flexibility&mdash;Linda solutions are presented
    that work well at two quite different levels of granularity.  The second
    uses a prime finder to illustrate a class of algorithms that do not
    (easily) submit to automatic parallelizers, but can be parallelized in
    straight-forward fashion using C-Linda.  The final experiment describes the
    process lattice model, an 'inherently' parallel application that is
    naturally conceived as multiple interacting processes.  Taken together, the
    experience described here bolsters our claim that Linda can bridge the gap
    between the growing collection of parallel hardware and users eager to
    exploit parallelism.",
  location     = "https://doi.org/10.1145/62115.62132"
}

@Article{otioalosmmm,
  author       = "Ching-Cheng Lee and Stephen~K. Skedzielewski and John Feo",
  title        = "On the Implementation of Applicative Languages on Shared-Memory, {MIMD} Multiprocessors",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "188--197",
  month        = sep,
  keywords     = "sisal, applicative languages, parallel programming support,
    performance, ",
  abstract     = "This paper presents the performance of a set of algorithms
    written in SISAL [MSA*85] and run on multiprocessor Sequent, DEC, and Cray
    computers.  We describe our current runtime system and discuss its
    implementation on each machine.  We indicate where our automatic approach
    to parallelization works well, as well as sources of inefficient behavior.
    Overall we find our systems encouraging for the first release of the
    native-code generating software.  We suggest improvements to the compiler
    and…runtime systems, many already developed but not yet implemented, to
    alleviate the inefficiencies." 
}

@Article{ctsbopp,
  author       = "Davis, Helen and Hennessy, John",
  title        = "Characterizing the Synchronization Behavior of Parallel Programs",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "198--211",
  month        = sep,
  keywords     = "performance measurement, parallel programming, synchronization",
  abstract     = "Contention for synchronization locks and delays waiting for
    synchronization events can substantially increase the running time of a
    parallel program.  This makes it important to characterize the
    synchronization behavior of programs and to provide analysis tools to aid
    both the hardware and software designer in evaluating design alternatives.
    This paper describes a tracing facility that is incorporated into a
    synchronization package.  This facility provides a portable means to
    accurately and efficiently characterize parallel programs.  The behavior of
    several applications has been monitored uncovering program characteristics
    that make it difficult to achieve linear speedup.  Our monitoring facility
    allows a programmer to determine the performance implications of the
    synchronization structure he has used, and it allows the architect to
    evaluate various hardware support mechanisms.", 
  location     = "https://doi.org/10.1145/62115.62134"
}

@Article{evgpar,
  author       = "Gupta, Anoop and Tucker, Andrew",
  title        = "Exploiting Variable Grain Parallelism at Runtime",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "212--221",
  month        = sep,
  keywords     = "run-time configuration, parallel structural design, parallel
    granularity",
  abstract     = "Currently, almost all parallel implementations of programs
    fix the granularity at which parallelism is exploited at design time.
    Depending on the application structure and the parallel hardware structure,
    the programmer decides to exploit parallelism at a fine granularity or
    coarse granularity or some intermediate granularity, but this granularity
    is not changed at runtime.  In this paper we argue that for many
    applications fixing the granularity in advance is not a good strategy.
    Instead it is advantageous to decide the granularity at which parallelism
    is exploited at runtime, as a function of the available hardware resources
    and as a function of the overheads associated with going to a finer
    granularity.  We present experimental results from a parallel
    implementation of a geometric constraint satisfaction system to support our
    thesis.  Our results show a significant advantage in using adaptive
    parallelism.", 
  location     = "https://doi.org/10.1145/62115.62135"
}

@Article{cshaafmc,
  author       = "Stramm, Bernd and Berman, Francine",
  title        = "Communication-Sensitive Heuristics and Algorithms for Mapping Compilers",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "222--234",
  month        = sep,
  keywords     = "process-processor mapping, contraction, communication costs,
    performance, cost-driven heuristics ",
  abstract     = "The mapping problem arises when parallel algorithms are
    implemented on parallel machines.  When the number of processes exceeds the
    number of available processing elements, the mapping problem includes the
    contraction problem.  In this paper, we identify communication-sensitive
    heuristics which promote good contractions for graph-based parallel
    algorithms on non-shared memory multiprocessors.  We present algorithms
    which utilize these heuristics and discuss their performance on a group of
    diverse benchmarks.", 
  location     = "https://doi.org/10.1145/62115.62136"
}

@Article{adefhm,
  author       = "Aiken, Alexander and Nicolau, Alexandru",
  title        = "{A} Development Environment for Horizontal Microcode",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 5,
  pages        = "584--594",
  month        = may,
  keywords     = "development environment, horizontal microcode, percolation
    scheduling, parallelism extraction, interactive profiling system, microcode
    compaction process, architecture, correctness preservation,
    synchronization, graphical interface, semantics-preserving
    transformations", 
  abstract     = "This paper describes a development environment for horizontal
    microcode.  The environment uses Percolation Scheduling, a transformational
    system for parallelism extraction, and an interactive profiling system to
    give the user control over the microcode compaction process while reducing
    the burdensome details of architecture, correctness preservation, and
    synchronization.  Through a graphical interface the user suggests what
    should be done in parallel, while the system performs the actual changes
    using semantics-preserving transformations.  If a request cannot be
    satisfied, the system reports the problem causing the failure.  The user
    may then help eliminate the problem by supplying guidance or information
    not explicit in the code.", 
  location     = "https://doi.org/10.1109/32.6136"
}

@Article{cttfeuopm,
  author       = "Gupta, Rajiv and Soffa, Mary Lou",
  title        = "Compile-time Techniques for Efficient Utilization of Parallel Memories",
  journal      = ppeals88,
  year         = 1988,
  volume       = 23,
  number       = 9,
  pages        = "235--246",
  month        = sep,
  keywords     = "memory module assignment, heuristics, value placement",
  abstract     = "The partitioning of shared memory into a number of memory
    modules is an approach to achieve high memory bandwidth for parallel
    processors.  Memory access conflicts can occur when several processors
    simultaneously request data from the same memory module.  Although work has
    been done to improve access performance for vectors, no work has been
    reported to improve the access performance of scalars.  For systems in
    which the processors operate in a lock-step mode, a large percentage of
    memory access conflicts can be predicted at compile-time.  These conflicts
    can be avoided by appropriate distribution of data among the memory modules
    at compile-time.  A long instruction word machine is an example of a system
    in which the functional units operate in a lock-step mode performing
    operations on data fetched in parallel from multiple memory modules.  In
    this paper, compile-time techniques for distribution of scalars to avoid
    memory access conflicts are presented.  Furthermore, algorithms to schedule
    data transfers among memory modules to avoid conflicts that cannot be
    avoided by the distribution of values alone are developed.  The techniques
    have been implemented as part of a compiler for a reconfigurable long
    instruction word architecture.  Results of experiments are presented
    demonstrating that a very high percentage of memory access conflicts can be
    avoided by scheduling a very low number of data transfers.", 
  location     = "https://doi.org/10.1145/62115.62137"
}

@Article{icpffcsc,
  author       = "Andreoli, Jean-Marc and Pareschi, Remo",
  title        = "Integrated Computational Paradigms for Flexible Client-Server Communication",
  journal      = surveys,
  year         = 1996,
  volume       = 28,
  number       = 2,
  pages        = "297--299",
  month        = jun,
  keywords     = "constraint programming, object-oriented programming,
    coordination technologies, remote procedure calls",
  location     = "https://doi.org/10.1145/234528.234731"
}

@Article{dnaluawstw,
  author       = "Andrew Odlyzko",
  title        = "Data Networks are Lightly Utilized, and Will Stay that Way",
  journal      = "Review of Network Economics",
  year         = 2003,
  volume       = 2,
  number       = 3,
  pages        = "210--237",
  month        = sep,
  keywords     = "network traffic, network utilization, traffic measurement,
    network management, network planning, network engineering",
  abstract     = "The popular press often extolls packet networks as much more
    efficient than switched voice networks in utilizing transmission lines.
    This impression is reinforced by the delays experienced on the Internet and
    the famous graphs for traffic patterns through the major exchange points on
    the Internet, which suggest that networks are running at full capacity.
    This paper shows the popular impression is incorrect; data networks are
    very lightly utilized compared to the telephone network.  Even the
    backbones of the Internet are run at lower fractions (10% to 15%) of their
    capacity than the switched voice network (which operates at over 30% of
    capacity on average).  Private line networks are utilized far less
    intensively (at 3% to 5%).  Further, this situation is likely to persist.
    The low utilization of data networks compared to voice phone networks is
    not a symptom of waste.  It comes from different patterns of use, lumpy
    capacity of transmission facilities, and the high growth rate of the
    industry.", 
  location     = "http://www.dtc.umn.edu/~odlyzko/doc/network.utilization.pdf", 
  location     = "http://dx.doi.org/10.2139/ssrn.447140"
}

@Article{acaofc,
  author       = "Dunlop, Douglas~D. and Basili, Victor~R.",
  title        = "{A} Comparative Analysis of Functional Correctness",
  journal      = surveys,
  year         = 1982,
  volume       = 14,
  number       = 2,
  pages        = "229--244",
  month        = jun,
  keywords     = "functional correctness, inductive assertions, correctness,
    subgoal induction, loop invariants",
  abstract     = "This paper presents and discusses the functional correctness
    technique. It is also explained that the underlying theory has an
    implication for deriving loop invariants.  The functional verification
    condition concerning program loops are shown to be a specialization of the
    commonly used inductive assertion verification conditions.  The functional
    technique is compared and contrasted with subgoal induction.  Finally, the
    difficulty of proving initialized loop programs is examined in light of
    both the inductive assertion and functional correctness theories.", 
  location     = "https://doi.org/10.1145/356876.356881",
  location     = "http://www.cs.umd.edu/projects/SoftEng/ESEG/papers/82.15.pdf"
}

@Article{gcolds,
  author       = "Jacques Cohen",
  title        = "Garbage Collection of Linked Data Structures",
  journal      = surveys,
  year         = 1981,
  volume       = 13,
  number       = 3,
  pages        = "341--367",
  month        = sep,
  keywords     = "garbage collection, list processing, marking, compaction,
    variable-sized cells, reference counts, parallel and real-time collection,
    algorithm analysis, language implementation, mark and sweep",
  abstract     = "A concise and unified view of the numerous existing
    algorithms for performing garbage collection of linked data structures is
    presented.  The emphasis is on garbage collection proper, rather than on
    storage allocation.  First, the classical garbage collection algorithms are
    reviewed, and their marking and collection phases, with and without
    compacting, are discussed.  Algorithms describing these phases are
    classified according to the type of cells to be collected: those for
    collecting single-sized cells are simpler than those for varsized cells.
    Recently proposed algorithms are presented and compared with the classical
    ones.  Special topics in garbage collection are also covered: the use of
    secondary and virtual storage, the use of reference counters, parallel and
    real-time collection, analysis of garbage-collection algorithms, and
    language features which influence the design of collectors.  The
    bibliography, with topical annotations, contains over 100 references.", 
  location     = "https://doi.org/10.1145/356850.356854"
}

@Article{eecfwtdtaeewz,
  author       = "Juang, Philo and Oki, Hidekazu and Wang, Yong and Martonosi, Margaret and Peh, Li Shiuan and Rubenstein, Daniel",
  title        = "Energy-Efficient Computing for Wildlife Tracking:  Design Tradeoffs and Early Experiences with ZebraNet",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS X))",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "96--107",
  month        = oct,
  keywords     = "mobile node design, mobile protocol, mobility modeling",
  abstract     = "Over the past decade, mobile computing and wireless
    communication have become increasingly important drivers of many new
    computing applications.  The field of wireless sensor networks particularly
    focuses on applications involving autonomous use of compute, sensing, and
    wireless communication devices for both scientific and commercial purposes.
    This paper examines the research decisions and design tradeoffs that arise
    when applying wireless peer-to-peer networking techniques in a mobile
    sensor network designed to support wildlife tracking for biology
    research.The ZebraNet system includes custom tracking collars (nodes)
    carried by animals under study across a large, wild area; the collars
    operate as a peer-to-peer network to deliver logged data back to
    researchers.  The collars include global positioning system (GPS), Flash
    memory, wireless transceivers, and a small CPU; essentially each node is a
    small, wireless computing device.  Since there is no cellular service or
    broadcast communication covering the region where animals are studied, ad
    hoc, peer-to-peer routing is needed.  Although numerous ad hoc protocols
    exist, additional challenges arise because the researchers themselves are
    mobile and thus there is no fixed base station towards which to aim data.
    Overall, our goal is to use the least energy, storage, and other resources
    necessary to maintain a reliable system with a very high `data homing'
    success rate.  We plan to deploy a 30-node ZebraNet system at the Mpala
    Research Centre in central Kenya.  More broadly, we believe that the
    domain-centric protocols and energy tradeoffs presented here for ZebraNet
    will have general applicability in other wireless and sensor
    applications.", 
  location     = "https://doi.org/10.1145/605432.605408"
}

@Article{hlbdidpiinpe,
  author       = "Eric von Hippel and Marcie~J. Tyre",
  title        = "How ``Learning by Doing'' is Done:  Problem Identification in Novel Process Equipment",
  journal      = "Research Policy",
  year         = 1995,
  volume       = 24,
  number       = 1,
  pages        = "1--12",
  month        = jan,
  keywords     = "failure modes, interference finding, problem discovery,
    unintended consequences, learning",
  abstract     = "The unit cost of producing manufactured goods has been shown
    to decline significantly as more are produced.  It has been argued that
    ‘learning by doing’ is at the root of this phenomenon, but the modes of
    learning actually involved have not been studied in detail.  In this paper
    we attempt to provide a better understanding of the learning behaviors
    involved in learning by doing via a study of 27 problems that affected two
    novel process machines in their first years of use in production.  First,
    ‘interference finding,’ is described, a form of learning by doing that
    appears to be central to the discovery of the problems studied.  Next, the
    reasons why the problems identified by templating were not discovered prior
    to field use - before ‘doing’ - are explored.  Two causes are identified:
    an inability to identify existing problem-related information in the midst
    of complexity, and the introduction of new problem-related information by
    users and other problem solvers who learn by doing after field introduction
    of the machine.  We find that problems due to information lost in
    complexity emerge earlier than do problems due to user learning by doing.
    Tests of reason are used to show why it would be very difficult to
    eliminate doing from learning by doing.  Finally, other implications of the
    study findings are discussed.", 
  location     = "https://doi.org/10.1016/0048-7333%2893%2900747-H",
  location     = "https://dspace.mit.edu/bitstream/handle/1721.1/2448/SWP-3521-27688183.pdf?sequence=1"
}

@Article{atdcoafppac,
  author       = "Kimbrel, Tracy and Tomkins, Andrew and Patterson, R.~Hugo and Bershad, Brian and Cao, Pei and Felten, Edward~W. and Gibson, Garth~A. and Karlin, Anna~R. and Li, Kai",
  title        = "{A} Trace-Driven Comparison of Algorithms for Parallel Prefetching and Caching",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "19--34",
  month        = oct,
  keywords     = "disk arrays, prefetching, caching, prefetch algorithms,
    latency hiding, trace-driven simulation",
  abstract     = "High-performance I/O systems depend on prefetching and
    caching in order to deliver good performance to applications.  These two
    techniques have generally been considered in isolation, even though there
    are significant interactions between them; a block prefetched too early
    reduces the effectiveness of the cache, while a block cached too long
    reduces the effectiveness of prefetching.  In this paper we study the
    effects of several combined prefetching and caching strategies for systems
    with multiple disks.  Using disk-accurate trace-driven simulation, we
    explore the performance characteristics of each of the algorithms in cases
    in which applications provide full advance knowledge of accesses using
    hints.  Some of the strategies have been published with theoretical
    performance bounds, and some are components of systems that have been
    built.  One is a new algorithm that combines the desirable characteristics
    of the others.  We find that when performance is limited by I/O stalls,
    aggressive prefetching helps to alleviate the problem; that more
    conservative prefetching is appropriate when significant I/O stalls are not
    present; and that a single, simple strategy is capable of doing both.", 
  location     = "https://www.usenix.org/publications/library/proceedings/osdi96/full_papers/kimbrel/kimbrel.ps",
  location     = "https://doi.org/10.1145/238721.238737"
}

@Article{aciiopfooca,
  author       = "Mowry, Todd~C. and Demke, Angela~K. and Krieger, Orran",
  title        = "Automatic Compiler-Inserted {I}/{O} Prefetching for Out-of-Core Applications",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "3--17",
  month        = oct,
  keywords     = "compiler-directed prefetch, static analysis, run-time support",
  abstract     = "Current operating systems offer poor performance when a
    numeric application’s working set does not fit in main memory.  As a
    result, programmers who wish to solve “out-of-core” problems efficiently
    are typically faced with the onerous task of rewriting an application to
    use explicit I/O operations (e.g., read/write).  In this paper, we propose
    and evaluate a fully-automatic technique which liberates the programmer
    from this task, provides high performance, and requires only minimal
    changes to current operating systems.  In our scheme, the compiler provides
    the crucial information on future access patterns without burdening the
    programmer, the operating system supports non-binding prefetch and release
    hints for managing I/O, and the operating system cooperates with a run-time
    layer to accelerate performance by adapting to dynamic behavior and
    minimizing prefetch overhead.  This approach maintains the abstraction of
    unlimited virtual memory for the programmer, gives the compiler the
    ﬂexibility to aggressively move prefetches back ahead of references, and
    gives the operating system the flexibility to arbitrate between the
    competing resource demands of multiple applications.  We have implemented
    our scheme using the SUIF compiler and the Hurricane operating system.  Our
    experimental results demonstrate that our fully-automatic scheme
    effectively hides the I/O latency in out-of-core versions of the entire NAS
    Parallel benchmark suite, thus resulting in speedups of roughly twofold for
    five of the eight applications, with one application speeding up by over
    threefold.", 
  location     = "http://www.cs.cmu.edu/~demke/papers/osdi96.pdf",
  location     = "https://doi.org/10.1145/238721.238734"
}

@Article{eccuh,
  author       = "Sarkar, Prasenjit and Hartman, John",
  title        = "Efficient Cooperative Caching using Hints",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "35--46",
  month        = oct,
  keywords     = "caching, distributed shared storage, cooperative caching,
    cache management",
  abstract     = "We present a low-overhead decentralized algorithm for
    cooperative caching that provides performance comparable to that of
    existing centralized algorithms.  Unlike existing algorithms that rely on
    centralized control of cache functions, our algorithm uses hints (i.e.
    inexact information) to allow clients to perform these functions in a
    decentralized fashion.  This paper shows that a hint-based system performs
    as well as a more tightly coordinated system while requiring less overhead.
    Simulations show that the block access times of our system are as good as
    those of the existing tightly-coordinated algorithms, while reducing
    manager load by more than a factor of 15, block lookup traffic by nearly a
    factor of two-thirds, and replacement traffic by more than a factor of 5.", 
  location     = "https://doi.org/10.1145/238721.238741", 
  location     = "https://www2.cs.arizona.edu/projects/swarm/papers/ccache/"
}

@Article{odrdvcg,
  author       = "Perkovi{\' c}, Dejan and Keleher, Peter~J.",
  title        = "Online Data-Race Detection via Coherency Guarantees",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "47--57",
  month        = oct,
  keywords     = "lazy release consistency, race detection, dynamic analysis,
    object-code rewriting",
  abstract     = "We present the design and evaluation of an on-the-fly 
    data-race-detection technique that handles applications written for the
    lazy release consistent (LRC) shared memory model.  We require no explicit
    association between synchronization and shared memory.  Hence, shared
    accesses have to be tracked and compared at the minimum granularity of data
    accesses, which is typically a single word.  The novel aspect of this
    system is that we are able to leverage information used to support the
    underlying memory abstraction to perform on-the-fly data-race detection,
    without compiler support.  Our system consists of a minimally modified
    version of the CVM distributed shared memory system, and instrumentation
    code inserted by the ATOM code re-writer.  We present an experimental
    evaluation of our technique by using our system to look for data races in
    four unaltered programs.  Our system correctly found read-write data races
    in a program that allows unsynchronized read access to a global tour bound,
    and a write-write race in a program from a standard benchmark suite.
    Overall, our mechanism reduced program performance by approximately a
    factor of two.", 
  location     = "https://doi.org/10.1145/238721.238760",
  location     = "https://www.usenix.org/publications/library/proceedings/osdi96/full_papers/perkovic/perkovic.ps"
}

@Article{cisbf,
  author       = "Ford, Bryan and Susarla, Sai",
  title        = "{CPU} Inheritance Scheduling",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "91--105",
  month        = oct,
  keywords     = "cpu scheduling, thread scheduling, coroutines, cooperative scheduling",
  abstract     = "Traditional processor scheduling mechanisms in operating
    systems are fairly rigid, often supporting only one fixed scheduling
    policy, or, at most, a few scheduling classes whose implementations are
    closely tied together in the OS kernel.  This paper presents CPU
    inheritance scheduling, a novel processor scheduling framework in which
    arbitrary threads can act as schedulers for other threads.  Widely
    different scheduling policies can be implemented under the framework, and
    many different policies can coexist in a single system, providing much
    greater scheduling flexibility.  Modular, hierarchical control can be
    provided over the processor utilization of arbitrary administrative
    domains, such as processes, jobs, users, and groups, and the CPU resources
    consumed can be accounted for and attributed accurately.  Applications, as
    well as the OS, can implement customized local scheduling policies; the
    framework ensures that all the different policies work together logically
    and predictably.  As a side effect, the framework also cleanly addresses
    priority inversion by providing a generalized form of priority inheritance
    that automatically works within and among diverse scheduling policies.  CPU
    inheritance scheduling extends naturally to multiprocessors, and supports
    processor management techniques such as processor affinity and scheduler
    activations.  We show that this flexibility can be provided with acceptable
    overhead in typical environments, depending on factors such as context
    switch speed and frequency.", 
  location     = "http://www.bford.info/pub/os/inherit-sched.pdf",
  location     = "https://doi.org/10.1145/238721.238765"
}

@Article{imna,
  author       = "Ahuja, Narendra and Schachter, B.~J.",
  title        = "Image Models",
  journal      = surveys,
  year         = 1981,
  volume       = 13,
  number       = 4,
  pages        = "373--397",
  month        = dec,
  keywords     = "image models, pixel models, area models, statistical models ",
  abstract     = "A survey of spatial variation models used in the computer
    processing of pictorial information.  Image models depicting homogeneous
    textures are reviewed under the categories of pixel-based and region-based
    models.  Pixel-based models are further divided into one-dimensional tune
    series models, random field models, and syntactic models.  Random field
    models incorporate either global or local image properties.  Several
    high-level models using semantic information are described to put the role
    of the two low-level models in perspective.", 
  location     = "http://vision.ai.illinois.edu/publications/image_models_ACMCS_1981.pdf",
  location     = "https://doi.org/10.1145/356859.356861"
}

@Article{peothblrcpfsvms,
  author       = "Zhou, Yuanyuan and Iftode, Liviu and Li, Kai",
  title        = "Performance Evaluation of Two Home-Based Lazy Release Consistency Protocols for Shared Virtual Memory Systems",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "75--88",
  month        = oct,
  keywords     = "multi-processor performance, lazy release consistency,
    home-based consistency, consistency protocols",
  abstract     = "This paper investigates the performance of shared virtual
    memory protocols on large-scale multicomputers.  Using experiments on a
    64-node Paragon, we show that the traditional Lazy Release Consistency
    (LRC) protocol does not scale well, because of the large number of messages
    it requires, the large amount of memory it consumes for protocol overhead
    data, and because of the difficulty of garbage collecting that data.  To
    achieve more scalable performance, we introduce and evaluate two new
    protocols.  The first, Home-based LRC (HLRC), is based on the automatic
    update release consistency (AURC) protocol.  Like AURC, HLRC maintains a
    home for each page to which all updates are propagated and from which all
    copies are derived.  unlike AURC, HLRC requires no specialized hardware
    support.  We find that the use of homes provides substantial improvements
    in performance and scalability over LRC.  Our second protocol, called
    overlapped home-based LRC (OHLRC), takes advantage of the communication
    processor found on each node of the paragon to offload some of the protocol
    overhead of HLRC from the critical path followed by the compute processor.
    We find that OHLRC provides modes improvements of HLRC.  We also apply
    overlapping to the base LRC protocol, with similar results.  Our
    experiments were done using five of the Splash-2 benchmarks.  We report
    overall execution times, as well as detailed breakdowns of elapsed time,
    message traffic, and memory use for each of the protocols.", 
  location     = "https://doi.org/10.1145/238721.238763",
  location     = "https://www.usenix.org/legacy/publications/library/proceedings/osdi96/full_papers/zhou/zhou.ps"
}

@Article{llflrcdsm,
  author       = "Costa, Manuel and Guedes, Paulo and Sequeira, Manuel and Neves, Nuno and Castro, Miguel",
  title        = "Lightweight Logging for Lazy Release Consistent Distributed Shared Memory",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "59--73",
  month        = oct,
  keywords     = "treadmarks, logging, consistency protocols, recovery,
    checkpointing, execution replay",
  abstract     = "This paper presents a new logging and recovery algorithm for
    lazy release consistent distributed shared memory (DSM).  The new algorithm
    tolerates single node failures by maintaining a distributed log of data
    dependencies in the volatile memory of processes.  The algorithm adds very
    little overhead to the memory consistency protocol: it sends no additional
    messages during failure-free periods; it adds only a minimal amount of data
    to one of the DSM protocol messages; it introduces no forced rollbacks of
    non-faulty processes; and it performs no communication-induced accesses to
    stable storage.  Furthermore, the algorithm logs only a very small amount
    of data, because it uses the log of memory accesses already maintained by
    the memory consistency protocol.  The algorithm was implemented in
    TreadMarks, a state-of-the-art DSM system.  Experimental results show that
    the algorithm has near zero time overhead and very low space overhead
    during failure-free execution, thus refuting the common belief that logging
    overhead is necessarily high in recoverable DSM systems.", 
  location     = "https://doi.org/10.1145/238721.238762",
  location     = "https://www.microsoft.com/en-us/research/publication/lightweight-logging-for-lazy-release-consistent-distributed-shared-memory/"
}

@Article{ahcsfmos,
  author       = "Goyal, Pawan and Guo, Xingang and Vin, Harrick~M.",
  title        = "{A} Hierarchical {CPU} Scheduler for Multimedia Operating Systems",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "107--121",
  month        = oct,
  keywords     = "scheduling, multimedia systems",
  abstract     = "The need for supporting variety of hard and soft real-time as
    well as best effort applications in a multimedia computing environment
    requires an operating system framework that: (1) enables different
    schedulers to be employed for different application classes, and (2)
    provides protection between the various classes of applications.  We argue
    that these objectives can be achieved by hierarchical partitioning of CPU
    bandwidth, in which an operating system partitions the CPU bandwidth among
    various application classes, and each application class, in turn,
    partitions its allocation (potentially using a different scheduling
    algorithm) among its sub-classes or applications.  We present Start-time
    Fair Queuing (SFQ) algorithm, which enables such hierarchical partitioning.
    We have implemented a hierarchical scheduler in Solaris 2.4.  We describe
    our implementation, and demonstrate its suitability for multimedia
    operating systems.", 
  location     = "https://www.usenix.org/conference/osdi-96/hierarchical-cpu-scheduler-multimedia-operating-systems"
}

@Article{tsbnbsaoss,
  author       = "Greenwald, Michael and Cheriton, David",
  title        = "The Synergy Between Non-blocking Synchronization and Operating System Structure",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "123--136",
  month        = oct,
  keywords     = "non-blocking synchronization, dcas, operating system
    structure, concurrent data structures",
  abstract     = "Non-blocking synchronization has significant advantages over
    blocking synchronization: however, it has not been used to a significant
    degree in practice.  We designed and implemented a multiprocessor operating
    system kernel and run-time library for high-performance, reliability and
    modularity.  We used nonblocking synchronization, not because it was an
    objective in itself, but because it became the approach of choice.  It was
    an attractive approach because of the synergy between other structuring
    techniques we used to achieve our primary goals and the benefits of
    non-blocking synchronization.  This paper describes this synergy: the
    structuring techniques we used which facilitated non-blocking
    synchronization and our experience with this implementation", 
  location     = "https://people.eecs.berkeley.edu/~culler/cs262b/papers/synergy-osdi96.pdf",
  location     = "https://doi.org/10.1145/248155.238767"
}

@Article{sownpudet,
  author       = "Perl, Sharon~E. and Sites, Richard~L.",
  title        = "Studies of {Windows NT} Performance using Dynamic Execution Traces",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "169--183",
  month        = oct,
  keywords     = "trace-driven analysis, pin bandwidth, lock contention,
    commercial workloads, run-time analysis, measurement",
  abstract     = "We studied two aspects of the performance of Windows NT :
    processor bandwidth requirements for memory accesses in a uniprocessor
    system running commercial and benchmark applications, and locking behavior
    of a commercial database on a small-scale multiprocessor.  Our studies are
    based on full dynamic execution traces of the systems, which include all
    instructions executed by the operating system and applications over periods
    of a few seconds (enough time to allow for significant computation).  The
    traces were obtained on Alpha PCs, usinga new software toolcalled PatchWrx
    that takes advantage of the Alpha architecture’s PAL-code layer to
    implement efﬁcient, comprehensive system tracing.  Because the Alpha
    version of Windows NT uses substantially the same code base as other
    versions, and therefore executes nearly the same sequence of calls, basic
    blocks, and data structure accesses, we believe our conclusions are
    relevant for non-Alpha systems as well.  This paper describes our
    performance studies and interesting aspects of PatchWrx.  We conclude from
    our studies that processor bandwidth can be a first-order bottleneck to
    achieving good performance.  This is particularly apparent when studying
    commercial benchmarks.  Operating system code and data structures
    contribute disproportionately to the memory access load.  We also found
    that operating system software lock contention was a factor preventing the
    database benchmark from scaling up on the small multiprocessor, and that
    the cache coherence protocol used by the machine introduced more cache
    interference than necessary.", 
  location     = "http://doi.org/10.1145/238721.238773",
  location     = "https://www.usenix.org/publications/library/proceedings/osdi96/full_papers/perl/perl.ps"
}

@Article{mpeitsos,
  author       = "Mosberger, David and " # llp,
  title        = "Making Paths Explicit in the {Scout} Operating System",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "153--167",
  month        = oct,
  keywords     = "os abstractions, integrated layer processing, specialization
    optimization", 
  abstract     = "This paper makes a case for paths as an explicit abstraction
    in operating system design.  Paths provide a unifying infrastructure for
    several OS mechanisms that have been introduced in the last several years,
    including fbufs, integrated layer processing, packet classifiers, code
    specialization, and migrating threads.  This paper articulates the
    potential advantages of a path-based OS structure, describes the specific
    path architecture implemented in the Scout OS, and demonstrates the
    advantages in a particular application domain---receiving, decoding, and
    displaying MPEG-compressed video.", 
  location     = "https://www.usenix.org/publications/library/proceedings/osdi96/full_papers/mosberger/mosberger.ps",
  location     = "https://doi.org/10.1145/238721.238771"
}

@Article{mmrvm,
  author       = "Ford, Bryan and Hibler, Mike and Lepreau, Jay and Tullmann, Patrick and Back, Godmar and Clawson, Stephen",
  title        = "Microkernels Meet Recursive Virtual Machines",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "137--151",
  month        = oct,
  keywords     = "microkernels, virtual machines, recursive structures, nested
    structures, state encapsulation, access control, operating system
    structure",
  abstract     = "This paper describes a novel approach to providingmodular and
    extensible operating system functionality and encapsulated environments
    based on a synthesis of microkernel and virtual machine concepts.  We have
    developed a software-based virtualizable architecture called Fluke that
    allows recursive virtual machines (virtual machines running on other
    virtual machines) to be implemented efficiently by a microkernel running on
    generic hardware.  A complete virtual machine interface is provided at each
    level; efficiency derives from needing to implement only new functionality
    at each level.  This infrastructure allows common OS functionality, such as
    process management, demand paging, fault tolerance, and debugging support,
    to be provided by cleanly modularized, independent, stackable virtual
    machine monitors, implemented as user processes.  It can also provide
    uncommon or unique OS features, including the above features specialized
    for particular applications' needs, virtual machines transparently
    distributed cross-node, or security monitors that allow arbitrary untrusted
    binaries to be executed safely.  Our prototype implementation of this model
    indicates that it is practical to modularize operating systems this way.
    Some types of virtual machine layers impose almost no overhead at all,
    while others impose some overhead (typically 0--35%), but only on certain
    classes of applications.", 
  location     = "https://www.flux.utah.edu/download?uid=106",
  location     = "https://doi.org/10.1145/238721.238769"
}

@Article{agauoaso,
  author       = "Tim Sheard",
  title        = "Automatic Generation and Use of Abstract Structure Operators",
  journal      = toplas,
  year         = 1991,
  volume       = 13,
  number       = 4,
  pages        = "531--557",
  month        = oct,
  keywords     = "automatic type-directed operation generation, classes,
    reflection, recursion, programming languages",
  abstract     = "Abstract structures are those structures definable by
    parametric and recursive type equations.  Manipulation of the instances of
    such structures is often expressed as recursive functions.  These functions
    can be quite complex and tedious to write, especially for types needed to
    model complex objects found in many modern applications.  We define a set
    of operators for computing over abstract structures that provide a clean
    interface with large functionality.  These operations have many of the good
    properties found in the relational algebra such as abstraction, algebraic
    manipulation, and specification, but operate over a much larger class of
    values.  Concrete definitions of these operators for specific types can be
    automatically generated as a by-product of type declaration and are thus
    made available to the user at no programming cost.", 
  location     = "https://doi.org/10.1145/115372.115369"
}

@Article{ulteisp,
  author       = "Endo, Yasuhiro and Wang, Zheng and Chen, J.~Bradley and Seltzer, Margo",
  title        = "Using Latency to Evaluate Interactive System Performance",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "185--199",
  month        = oct,
  keywords     = "latency, performance measurements, usability",
  abstract     = "The conventional methodology for system performance
    measurement, which relies primarily on throughput-sensitive benchmarks and
    throughput metrics, has major limitations when analyzing the behavior and
    performance of interactive workloads.  The increasingly inter- active
    character of personal computing demands new ways of measuring and analyzing
    system performance.  In this paper, we present a combination of measurement
    techniques and benchmark methodologies that address these problems.  We
    introduce several simple methods for making direct and precise measurements
    of event handling latency in the context of a realistic interactive
    application.  We analyze how results from such measurements can be used to
    understand the detailed behavior of latency-critical events.  We
    demonstrate our techniques in an analysis of the performance of two
    releases of Windows NT and Windows 95.  Our experience indicates that
    latency can be measured for a class of interactive workloads, providing a
    substantial improvement in the accuracy and detail of performance
    information over measurements based strictly on throughput.", 
  location     = "https://doi.org/10.1145/238721.238775",
  location     = "https://www.usenix.org/conference/osdi-96/using-latency-evaluate-interactive-system-performance"
}

@Article{dwdsmke,
  author       = "Seltzer, Margo~I. and Endo, Yasuhiro and Small, Christopher and Smith, Keith~A.",
  title        = "Dealing With Disaster:  Surviving Misbehaved Kernel Extensions",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "213--227",
  month        = oct,
  keywords     = "configurable kernels, software fault isolation, interface
    design, vino, fault tolerance, fault avoidance, performance",
  abstract     = "Today’s extensible operating systems allow applications to
    modify kernel behavior by providing mechanisms for application code to run
    in the kernel address space.  The advantage of this approach is that it
    provides improved application ﬂexibility and performance; the disadvantage
    is that buggy or malicious code can jeopardize the integrity of the kernel.
    It has been demonstrated that it is feasible to use safe languages,
    software fault isolation, or virtual memory protection to safeguard the
    main kernel.  However, such protection mechanisms do not address the full
    range of problems, such as resource hoarding, that can arise when
    application code is introduced into the kernel.  In this paper, we present
    an analysis of extension mechanisms in the VINO kernel.  VINO uses software
    fault isolation as its safety mechanism and a lightweight transaction
    system to cope with resource-hoarding.  We explain how these two mechanisms
    are sufﬁcient to protect against a large class of errant or malicious
    extensions, and we quantify the overhead that this protection introduces.
    We ﬁnd that while the overhead of these techniques is high relative to the
    cost of the extensions themselves, it is low relative to the beneﬁts that
    extensibility brings.", 
  location     = "https://doi.org/10.1145/248155.238779",
  location     = "https://www.eecs.harvard.edu/~keith/papers/osdi96.pdf"
}

@Article{dbfaes,
  author       = "Pardyak, Przemys{\l}aw and Bershad, Brian~N.",
  title        = "Dynamic Binding for an Extensible System",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "201--213",
  keywords     = "events, extensible kernels, modula 3, type safety, modules,
    fault tolerance, fault avoidance",
  abstract     = "An extensible system requires a means to dynamically bind
    extensions into executing code.  SPIN extensible operating system uses an
    event-based invocation mechanism to provide this functionality in a
    flexible, transparent, safe, and efficient way.  Events offer a uniform
    model of extensibility, whereby the system's configuration can change
    without changing any of its components.  Events are defined with the
    granularity and syntax of procedures but provide extended procedure call
    semantics such as conditional execution, multicast, and asynchrony.  By
    installing a handler on an event, an extension's code can execute in
    response to activities at the granularity of procedure call.  Our system
    uses runtime code generation to ensure that event delivery has low overhead
    and scales well with the number of handlers.  This paper describes the
    design, use and performance of events in the SPIN operating system.", 
  location     = "https://www.usenix.org/conference/osdi-96/dynamic-binding-extensible-system",
  location     = "https://doi.org/10.1145/248155.238777"
}

@Article{skewrtc,
  author       = "Necula, George~C. and Lee, Peter",
  title        = "Safe Kernel Extensions Without Run-Time Checking",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "229--243",
  keywords     = "operating systems, automatic program verification, proof
    systems, system safety, type systems, program reliability, configurable
    kernels, packet filters, assembly languages.", 
  abstract     = "This paper describes a mechanism by which an operating system
    kernel can determine with certainty that it is safe to execute a binary
    supplied by an untrusted source.  The kernel first defines a safety policy
    and makes it public.  Then, using this policy, an application can provide
    binaries in a special form called proof-carrying code, or simply PCC.  Each
    PCC binary contains, in addition to the native code, a formal proof that
    the code obeys the safety policy.  The kernel can easily validate the proof
    without using cryptography and without consulting any external trusted
    entities.  If the validation succeeds, the code is guaranteed to respect
    the safety policy without relying on run-time checks.  The main practical
    difficulty of PCC is in generating the safety proofs.  In order to gain
    some preliminary experience with this, we have written several network
    packet filters in hand-tuned DEC Alpha assembly language, and then
    generated PCC binaries for them using a special prototype assembler.  The
    PCC binaries can be executed with no run-time over-head, beyond a one-time
    cost of 1 to 3 milliseconds for validating the enclosed proofs.  The net
    result is that our packet filters are formally guaranteed to be safe and
    are faster than packet filters created using Berkeley Packet Filters,
    Software Fault Isolation, or safe languages such as Modula-3.", 
  location     = "https://apps.dtic.mil/dtic/tr/fulltext/u2/a322252.pdf",
  location     = "https://doi.org/10.1145/238721.238781"
}

@Article{ddaddca,
  author       = "Treleaven, Philip~C. and Brownbridge, David~R. and Hopkins, Richard~P.",
  title        = "Data-Driven and Demand-Driven Computer Architecture",
  journal      = surveys,
  year         = 1982,
  volume       = 14,
  number       = 1,
  pages        = "93--143",
  month        = mar,
  keywords     = "demand-driven architecture, data-driven architecture,
    non-von-neumann architectures, functional programming, intermediate
    representations, graph representations, string replacement, data-flow
    computing, reduction computers, parallel execution, fork-join parallelism,
    sub-graph sharing",
  abstract     = "Novel data-driven and demand-driven computer architectures
    are under development in a large number of laboratories in the United
    States, Japan, and Europe.  These computers are not based on the traditional
    von Neumann organization; instead, they are attempts to identify the next
    generation of computer.  Basically, in data-driven (e.g., data-flow)
    computers the availability of operands triggers the execution of the
    operation to be performed on them, whereas in demand-driven (e.g,
    reduction) computers the requirement for a result triggers the operation
    that will generate it.  Although there are these two distinct areas of
    research, each laboratory has developed its own individual model of
    computation, stored program representation, and machine organization.
    Across this spectrum of designs there m, however, a significant sharing of
    concepts.  The aim of this paper is to identify the concepts and
    relationships that exist both within and between the two areas of research.
    It does thin by examlmng data-driven and demand-driven architecture at
    three levels, computation organizatmn, (stored) program organization, and
    machine organLzation.  Finally, a survey of various novel computer
    architectures under development is given.", 
  location     = "https://doi.org/10.1145/356869.356873"
}

@Article{aiothsmia,
  author       = "Buzzard, Greg and Jacobson, David and Mackey, Milon and Marovich, Scott and Wilkes, John",
  title        = "An Implementation of the {Hamlyn} Sender-Managed Interface Architecture",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "245--259",
  keywords     = "storage management, network interfaces, network performance",
  abstract     = "As the latency and bandwidth of multicomputer interconnection
    fabrics improve, there is a growing need for an interface between them and
    host processors that does not hide these gains behind software overhead.
    The Hamlyn interface architecture does this.  It uses sender-based memory
    management to eliminate receiver buffer overruns, provides applications
    with direct hardware access to minimize latency, supports adaptive routing
    networks to allow higher throughput, and offers full protection between
    applications so that it can be used in a general-purpose computing
    environment.  To test these claims we built a prototype Hamlyn interface
    for a Myrinet network connected to a standard HP workstation and report
    here on its design and performance.  Our interface delivers an
    application-to-application round trip time of 28us for short messages and a
    one-way time of 17.4us + 32.6ns/byte (30.7mb/s) for longer ones, while
    requiring fewer CPU cycles than an aggressive implementation of Active
    Messages on the CM-5.", 
  location     = "https://doi.org/10.1145/238721.238784",
  location     = "https://www.hpl.hp.com/techreports/96/HPL-96-137.pdf"
}

@Article{lrplansafss,
  author       = "Druschel, Peter and Banga, Gaurav",
  title        = "Lazy Receiver Processing ({LRP}):  {A} Network Subsystem Architecture for Server Systems",
  journal      = osdi96,
  year         = 1996,
  volume       = 30,
  number       = SI,
  pages        = "261--275",
  keywords     = "",
  abstract     = "The explosive growth of the Internet, the widespread use of
    WWW-related applications, and the increased reliance on client-server
    architectures places interesting new demands on network servers.  In
    particular, the operating system running on such systems needs to manage
    the machine's resources in a manner that maximizes and maintains throughput
    under conditions of high load.  We propose and evaluate a new network
    subsystem architecture that provides improved fairness, stability, and
    increased throughput under high network load.  The architecture is hardware
    independent and does not degrade network latency or bandwidth under normal
    load conditions.",
  location     = "https://doi.org/10.1145/238721.238786"
}

@Article{siopuaecc,
  author       = "Vuong, Son~T. and Lau, Allen~C. and Chan, R.~Isaac",
  title        = "Semiautomatic Implementation of Protocols Using an {Estelle-C} Compiler",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "384--393",
  month        = mar,
  keywords     = "automatic implementation, compiler, estelle fdt, protocols",
  abstract     = "The basic ideas underlying an Estelle-C compiler, which
    accepts an Estelle protocol specification and produces a protocol
    implementation in C, are presented.  The implementation of the ISO
    (International Organization for Standardization) class-2 transparent
    protocol, using the semiautomatic approach, is discussed.  A manual
    implementation of the protocol is performed and compared to the
    semiautomatic implementation.  The semiautomatic approach to protocol
    implementation offers several advantages over the conventional manual one,
    including correctness and modularity in protocol implementation code,
    conformance to the specification, and reduction in implementation time.
    Finally, ongoing development of a new Estelle-C compiler is presented.", 
  location     = "https://doi.org/10.1109/32.4658"
}

@Article{aipsauagstg,
  author       = "Zhang, Yao~Xue and Takahashi, Kaoru and Shiratori, Norio and Noguchi, Shoichi",
  title        = "An Interactive Protocol Synthesis Algorithm Using a Global State Transition Graph",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "394--404",
  month        = mar,
  keywords     = "communication protocols, protocol synthesis, finite state
    machine, global state translation, protocol validation",
  abstract     = "An interactive synthesis algorithm, to construct two
    communicating finite-state machines (protocols), is presented.  The
    machines exchange messages over two unidirectional FIFO (first-in
    first-out) channels when the function of the protocol has been given.  The
    synthesis algorithm first constructs the global state transitiion graph
    (GSTG) of a protoco to be synthesized and then produces the protocol.  It
    is based on a set of production rules and a set of deadlock avoidance
    rules, which guarantee that complete reception and deadlock freeness
    capabilities are provided in the interacting process.  This synthesis
    algorithm prevents a designer from creating unspecified reception and
    nonexecutable transition, avoids the occurrence of deadlocks, and monitors
    for the presence of buffer overflow.", 
  location     = "https://doi.org/10.1109/32.4659"
}

@Article{aml,
  author       = "Damm, Werner",
  title        = "{A} Microprogramming Logic",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 5,
  pages        = "559--574",
  month        = may,
  keywords     = "design verification, firmware verification, formal
    microengine models, hardware description languages, high-level microprogramming
    languages",
  abstract     = "A universal syntax-directed proof system is presented for the
    verification of horizontal computer architectures.  The system is based on
    the axiomatic architecture description language AADL, which is sufficiently
    rich to allow the specification of target architectures while providing a
    concise model for clocked microarchitectures.  For each description A
    epsilon AADL of a host, it is shown how to construct systematically a
    (Hoare-style) axiomatic definition of an A-dependent high-level
    microprogramming language based on S*.  The axiomatization of A's
    microoperations together with a powerful proof-rule dealing with the
    inherent low-level parallelism of horizontal architectures allow a complete
    axiomatic treatment of the timing behavior and dynamic conflicts of
    microprograms written in S*(A).", 
  location     = "https://doi.org/10.1109/32.6134"
}

@Article{bds,
  author       = "Fred~J. Maryanski",
  title        = "Backend Database Systems",
  journal      = surveys,
  year         = 1980,
  volume       = 12,
  number       = 1,
  pages        = "3--25",
  month        = mar,
  keywords     = "database systems, backend machines, distributed databases,
    database machines, performance, concurrency, networking, load balancing",
  abstract     = "Backend database systems have been proposed as a solution to
    the problem of overloaded data processing installations.  This tutorial
    examines backend database systems in terms of their basic structure, their
    potential benefits and drawbacks, and the problems facing developers of
    such systems.  Several prototype systems are described, and research on
    extensions of the backend concept is discussed.  The structure of the
    hardware and software components of the backend database system is
    presented in detail.  The performance problems encountered in recent
    prototypes are pointed out and potential solutions indicated",
  location     = "https://doi.org/10.1145/356802.356804"
}

@Article{ardphawtfi,
  author       = "Parnas, David~L. and Clements, Paul~C.",
  title        = "{A} Rational Design Process:  How and Why to Fake It",
  journal      = tse,
  year         = 1986,
  volume       = 12,
  number       = 2,
  pages        = "251-257",
  month        = feb,
  keywords     = "software design, requirements analysis, modularity,
    interfaces, documentation",
  abstract     = "Many have sought a software design process that allows a
    program to be derived systematically from a precise statement of
    requirements.  It is proposed that, although designing a real product in
    that way will not be successful, it is possible to produce documentation
    that makes it appear that the software was designed by such a process.  The
    ideal process and the documentation that it requires are described.  The
    authors explain why one should attempt to design according to the ideal
    process and why one should produce the documentation that would have been
    produced by that process.  The contents of each of the required documents
    are outlined.", 
  location     = "https://doi.org/10.1109/TSE.1986.6312940"
}

@Article{dovaptfda,
  author       = "Claude Jard and Jean-Fran{\c c}ois Monin and Roland Groz",
  title        = "Development of {V{\' e}da}, A Prototyping Tool for Distributed Algorithms",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "339--352",
  month        = mar,
  keywords     = "distributed algorithms, estelle, prolog, pascal, protocols,
    simulation, software engineering, verification",
  abstract     = "The development of a simulator, called Veda, is described.
    Veda is a software tool to help designers in protocol modeling and
    validation.  It is oriented towards the rapid prototyping of distributed
    algorithms.  Algorithms are described using an ISO (International
    Organisation for Standardization) formal description technique, called
    Estelle.  The development of Veda and its internal structure is presented,
    emphasizing the use of Prolog as a software engineering tool.  Typical uses
    of Veda are discussed.",
  location     = "https://hal.inria.fr/inria-00071322/document"
}

@Article{uaioseicfp,
  author       = "Li, Tao and John, Lizy Kurian and Sivasubramaniam, Anand and Vijaykrishnan, N. and Rubio, Juan",
  title        = "Understanding and Improving Operating System Effects in Control Flow Prediction",
  journal      = sigplan,
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "68--80",
  month        = oct,
  keywords     = "branch prediction, branch estimators, execution performance,
    the kernel-user split",
  abstract     = "Many modern applications result in a significant operating
    system (OS) component.  The OS component has several implications including
    affecting the control flow transfer in the execution environment.  This
    paper focuses on understanding the operating system effects on control flow
    transfer and prediction, and designing architectural support to alleviate
    the bottlenecks.  We characterize the control flow transfer of several
    emerging applications on a commercial operating system.  We find that the
    exception-driven, intermittent invocation of OS code and the user/OS branch
    history interference increase the misprediction in both user and kernel
    code.We propose two simple OS-aware control flow prediction techniques to
    alleviate the destructive impact of user/OS branch interference.  The first
    one consists of capturing separate branch correlation information for user
    and kernel code.  The second one involves using separate branch prediction
    tables for user and kernel code.  We study the improvement contributed by
    the OS-aware prediction to various branch predictors ranging from simple
    Gshare to more elegant Agree, Multi-Hybrid and Bi-Mode predictors.  On 32K
    entries predictors, incorporating OS-aware techniques yields up to 34%,
    23%, 27% and 9% prediction accuracy improvement in Gshare, Multi-Hybrid,
    Agree and Bi-Mode predictors, resulting in up to 8% execution speedup.", 
  location     = "http://www.cse.psu.edu/~axs53/csl/papers/asplos02.pdf",
  location     = "https://doi.org/10.1145/605397.605405"
}

@Article{efsis,
  author       = "Khalidi, Yousef~A. and Nelson, Michael~N.",
  title        = "Extensible File Systems in {Spring}",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "1--14",
  month        = dec,
  keywords     = "extensible file systems, spring, object-oriented design,
    interfaces, caching, coherence, file-system stacking, operating-system design",
  abstract     = "This paper describes an extensible file system architecture.
    The architecture extends file system function by composing (or stacking)
    new file systems on existing file systems.  A file system stacked on an
    existing file system can access the existing file system's files via a
    well-defined naming interface and can coherently share the same underlying
    file data.  We describe extending file systems in the context of the Spring
    operating system.  Composing file systems in Spring is facilitated by basic
    Spring features such as its virtual memory architecture, its strongly-typed
    well-defined interfaces, its location-independent object invocation
    mechanism, and its flexible naming architecture.  File systems in Spring
    can reside in the kernel, in user-mode, or on remote machines, and they can
    be flexibly composed.",
  location     = "http://www.pdos.lcs.mit.edu/ld/LogicalDisk.ps",
  location     = "https://doi.org/10.1145/173668.168620"
}

@Article{tldanatifs,
  author       = "de Jonge, Wiebren and Kaashoek, M. Frans and Hsieh, Wilson~C.",
  title        = "The {Logical Disk}:  A New Approach to Improving File Systems",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "15--28",
  month        = dec,
  keywords     = "logical disks, disk management, log-structured file systems,
    minix, file-system performance",
  abstract     = "The Logical Disk (LD) defines a new interface to disk storage
    that separates file management and disk management by using logical block
    numbers and block lists.  The LD interface is designed to support multiple
    file systems and to allow multiple implementations, both of which are
    important given the increasing use of kernels that support multiple
    operating system personalities.A log-structured implementation of LD (LLD)
    demonstrates that LD can be implemented efficiently.  LLD adds about 5% to
    10% to the purchase cost of a disk for the main memory it requires.
    Combining LLD with an existing file system results in a log-structured file
    system that exhibits the same performance characteristics as the Sprite
    log-structured file system.",
  location     = "https://doi.org/10.1145/168619.168621"
}

@Article{tzsnfs,
  author       = "Hartman, John~H. and Ousterhout, John~K.",
  title        = "The {Zebra} Striped Network File System",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "29--43",
  month        = dec,
  keywords     = "network file systems, striping, raid, log-structured file
    systems, file metadata management, strip cleaning",
  abstract     = "Zebra is a network file system that stripes file data across
    multiple servers for increased file throughput.  Rather than striping each
    file separately, Zebra forms all the new data from each client into a
    single stream, which it then stripes.  This provides high performance for
    reads and writes of large files and also for writes of small files.  Zebra
    also writes parity information in each stripe in the style of RAID disk
    arrays; this increases storage costs slightly but allows the system to
    continue operation even while a single storage server is unavailable.  A
    prototype implementation of Zebra, built in the Sprite operating system,
    provides 5-8 times the throughput of the standard Sprite file system or NFS
    for large files and a 20%-3x improvement for writing small files.",
  location     = "https://www2.eecs.berkeley.edu/Pubs/TechRpts/1993/6277.html"
}

@Article{utlocatoc,
  author       = "Cheriton, David~R. and Skeen, Dale",
  title        = "Understanding the Limitations of Causally and Totally Ordered Communication",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "44--57",
  month        = dec,
  keywords     = "catocs, end-to-end arguments, communication overhead,
    state-based solutions, hidden causality, time-stamping",
  abstract     = "Causally and totally ordered communication support (CATOCS)
    has been proposed as important to provide as part of the basic building
    blocks for constructing reliable distributed systems.  In this paper, we
    identify four major limitations to CATOCS, investigate the applicability of
    CATOCS to several classes of distributed applications in light of these
    limitations, and the potential impact of these facilities on communication
    scalability and robustness.  From this investigation, we find limited merit
    and several potential problems in using CATOCS.  The fundamental difficulty
    with the CATOCS is that it attempts to solve problems at the communication
    level in violation of the well-known end-to-end argument.", 
  location     = "https://doi.org/10.1145/168619.168623"
}

@Article{oksmoesa,
  author       = "Hans Leiss",
  title        = "On {Kilbury's} Modification of {Earley's} Algorithm",
  journal      = toplas,
  year         = 1990,
  volume       = 12,
  number       = 4,
  pages        = "610--640",
  month        = oct,
  keywords     = "context-free grammars, early's algorithm,
    graham-harrison-ruzzo's algorithm, inductive definitions, lookahead,
    parse-tree representation, structure sharing, tomita's packed-forest
    representation",
  abstract     = "We improve on J. Kilbury's proposal to interchange predictor
    and scanner in Earley's parser.  This modification of Earley's parser can
    trivially be combined with those suggested by S. Graham, M. Harrison, and
    W. Ruzzo, leading to smaller parse tables and almost the power of lookahead
    1.  Along these lines we can also obtain Earley-parsers having partial
    lookahead r > 1, without storing right contexts.  Parse trees with shared
    structure can be stored in the parse tables directly, rather than
    constructing the trees from dotted rules.", 
  location     = "https://doi.org/10.1145/88616.88637"
}

@Article{tibaafeds,
  author       = "Oki, Brian and Pfluegl, Manfred and Siegel, Alex and Skeen, Dale",
  title        = "The {Information Bus} --- An Architecture for Extensible Distributed Systems",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "58--68",
  month        = dec,
  keyword      = "ipc, bus architectures, publish-subscribe, rpc",
  abstract     = "Research can rarely be performed on large-scale, distributed
    systems at the level of thousands of workstations.  In this paper, we
    describe the motivating constraints, design principles, and architecture
    for an extensible, distributed system operating in such an environment.
    The constraints include continuous operation, dynamic system evolution, and
    integration with extant systems.  The Information Bus, our solution, is a
    novel synthesis of four design principles: core communication protocols
    have minimal semantics, objects are self-describing, types can be
    dynamically defined, and communication is anonymous.  The current
    implementation provides both flexibility and high performance, and has been
    proven in several commercial environments, including integrated circuit
    fabrication plants and brokerage/trading floors.", 
  location     = "https://doi.org/10.1145/168619.168624"
}

@Article{safbfdp,
  author       = "Hamilton, Graham and Mitchell, James~G. and Powell, Michael~L.",
  title        = "Subcontract:  {A} Flexible Base for Distributed Programming",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "69--79",
  month        = dec,
  keywords     = "spring, object-oriented design, distributed computing, remote
    procedure call, stub generation, indirection, communication semantics",
  abstract     = "A key problem in operating systems is permitting the orderly
    introduction of new properties and new implementation techniques.  We
    describe a mechanism, subcontract, that within the context of an
    object-oriented distributed system permits application programmers control
    over fundamental object mechanisms.  This allows programmers to define new
    object communication mechanisms without modifying the base system.  We
    describe how new subcontracts can be introduced as alternative
    communication mechanisms in the place of existing subcontracts.  We also
    briefly describe some of the uses we have made of the subcontract mechanism
    to support caching, crash recovery, and replication.", 
  location     = "https://doi.org/10.1145/168619.168625"
}
27;5;39~
@Article{tioossomsp,
  author       = "Chen, J. Bradley and Bershad, Brian~N.",
  title        = "The Impact of Operating System Structure on Memory System Performance",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "120--133",
  month        = dec,
  keywords     = "caching, storage performance, trace-driven analysis, mach,
    ultrix, locality, context switches, self-interference",
  abstract     = "In this paper we evaluate the memory system behavior of two
    distinctly different implementations of the UNIX operating system: DEC's
    Ultrix, a monolithic system, and Mach 3.0 with CMU's UNIX server, a
    microkernel-based system.  In our evaluation we use combined system and
    user memory reference traces of thirteen industry-standard workloads.  We
    show that the microkernel-based system executes substantially more non-idle
    system instructions for an equivalent workload than the monolithic system.
    Furthermore, the average instruction for programs running on Mach has a
    higher cost, in terms of memory cycles per instruction, than on Ultrix.  In
    the context of our traces, we explore a number of popular assertions about
    the memory system behavior of modern operating systems, paying special
    attention to the effect that Mach's microkernel architecture has on system
    performance.  Our results indicate that many, but not all of the assertions
    are true, and that a few, while true, have only negligible impact on real
    system performance.", 
  location     = "https://doi.org/10.1145/168619.168629", 
  location     = "https://www.cs.cmu.edu/afs/cs/project/mach/public/www/doc/abstracts/os-memorysys.html"
}

@Article{ptaafmmoaool,
  author       = "Hosking, Antony~L. and Moss, J.~Eliot~B.",
  title        = "Protection Traps and Alternatives for Memory Management of an Object-Oriented Language",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "106--119",
  month        = dec,
  keywords     = "generational garbage collection, dirty bits, persistent
    store, database checkpointing, performance, hardware-assisted management",
  abstract     = "Many operating systems allow user programs to specify the
    protection level (inaccessible, read-only, read-write) of pages in their
    virtual memory address space, and to handle any protection violations that
    may occur.  Such page-protection techniques have been exploited by several
    user-level algorithms for applications including generational garbage
    collection and persistent stores.  Unfortunately, modern hardware has made
    efficient handling of page protection faults more difficult.  Moreover,
    page-sized granularity may not match the natural granularity of a given
    application.  In light of these problems, we reevaluate the usefulness of
    page-protection primitives in such applications, by comparing the
    performance of implementations that make use of the primitives with others
    that do not.  Our results show that for certain applications software
    solutions outperform solutions that rely on page-protection or other
    related virtual memory primitives.", 
  location     = "https://doi.org/10.1145/168619.168628"
}

@Article{utiisacs,
  author       = "Hauser, Carl and Jacobi, Christian and Theimer, Marvin and Welch, Brent and Weiser, Mark",
  title        = "Using Threads in Interactive Systems:  A Case Study",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "94--105",
  month        = dec,
  keywords     = "thread models, software structures, thread behavior, deferring
  work, pumping data, avoid deadlock, rejuvenating tasks, exploiting concurrency",
  abstract     = "We describe the results of examining two large research and
    commercial systems for the ways that they use threads.  We used three
    methods: analysis of macroscopic thread statistics, analysis the
    microsecond spacing between thread events, and reading the implementation
    code.  We identify ten different paradigms of thread usage: defer work,
    general pumps, slack processes, sleepers, one-shots, deadlock avoidance,
    rejuvenation, serializers, encapsulated fork and exploiting parallelism.
    While some, like defer work, are well known, others have not been
    previously described.  Most of the paradigms cause few problems for
    programmers and help keep the resulting system implementation
    understandable.  The slack process paradigm is both particularly effective
    in improving system performance and particularly difficult to make work
    well.  We observe that thread priorities are difficult to use and may
    interfere in unanticipated ways with other thread primitives and paradigms.
    Finally, we glean from the practices in this code several possible future
    research topics in the area of thread abstractions.", 
  location     = "https://doi.org/10.1145/168619.168627"
}

@Article{iatiucatsi,
  author       = "Jones, Michael~B.",
  title        = "Interposition Agents:  Transparently Interposing User Code at the System Interface",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "80--93",
  month        = dec,
  keywords     = "operating systems interfaces, system calls, configurable
    systems, toolkits, object-oriented design",
  abstract     = "Many contemporary operating systems utilize a system call
    interface between the operating system and its clients.  Increasing numbers
    of systems are providing low-level mechanisms for intercepting and handling
    system calls in user code.  Nonetheless, they typically provide no
    higher-level tools or abstractions for effectively utilizing these
    mechanisms.  Using them has typically required reimplementation of a
    substantial portion of the system interface from scratch, making the use of
    such facilities unwieldy at best.This paper presents a toolkit that
    substantially increases the ease of interposing user code between clients
    and instances of the system interface by allowing such code to be written
    in terms of the high-level objects provided by this interface, rather than
    in terms of the intercepted system calls themselves.  This toolkit helps
    enable new interposition agents to be written, many of which would not
    otherwise have been attempted.This toolkit has also been used to construct
    several agents including: system call tracing tools, file reference tracing
    tools, and customizable filesystem views.  Examples of other agents that
    could be built include: protected environments for running untrusted
    binaries, logical devices implemented entirely in user space, transparent
    data compression and/or encryption agents, transactional software
    environments, and emulators for other operating system environments.", 
  location     = "https://dx.doi.org/10.1145/173668.168626"
}

@Article{timopcape,
  author       = "E.~Jane Cameron and David~M. Cohen and B.~Gopinath and William~M. Keese and Linda Ness and Prem Uppaluru and John~R. Vollaro",
  title        = "The {IC}* Model of Parallel Computation and Programming Environment",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "317--326",
  month        = mar,
  keywords     = "temporal constraints, parallel computation, programming
    environment, IC* project, design, specification, communication protocols,
    parallel machines, distributed systems, structural constraints, explicit
    modeling, nondeterministic evolution, dynamic activation, parallel
    computer", 
  abstract     = "The IC* project is an effort to create an environment for the
    design, specification, and development of complex systems such as
    communication protocols, parallel machines, and distributed systems.  The
    basis of the project is the IC* model of parallel computation, in which a
    system is specified by a set of invariant expressions which describe its
    behavior in time.  The features of this model include temporal and
    structural constraints, inherent parallelism, explicit modeling of time,
    nondeterministic evolution, and dynamic activation.  The project also
    includes the construction of a parallel computer specifically designed to
    support the model of computation.  The authors discuss the IC* model and
    the current user language, and describe the architecture and hardware of
    the prototype supercomputer built to execute IC* programs.", 
  location     = "https://doi.org/10.1109/32.4652"
}

@Article{pacsep,
  author       = "Perl, Sharon~E. and Weihl, William~E.",
  title        = "Performance Assertion Checking",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "134--145",
  month        = dec,
  keywords     = "performance monitoring, logging, query languages,
    domain-specific languages, performance assertions",
  abstract     = "Performance assertion checking is an approach to automating
    the testing of performance properties of complex systems.  System designers
    write assertions that capture expectations for performance; these
    assertions are checked automatically against monitoring data to detect
    potential performance bugs.  Automatically checking expectations allows a
    designer to test a wide range of performance properties as a system
    evolves: data that meets expectations can be discarded automatically,
    focusing attention on data indicating potential problems.PSpec is a
    language for writing performance as sertions together with tools for
    testing assertions and estimating values for constants in assertions.  The
    language is small and efficiently checkable, yet capable of expressing a
    wide variety of performance properties.  Initial experience indicates that
    PSpec is a useful tool for performance testing and debugging; it helped
    uncover several performance bugs in the runtime system of a parallel
    programming language.", 
  location     = "https://doi.org/10.1145/168619.168630"
}

@Article{ccgcoaph,
  author       = "O'Toole, James and Nettles, Scott and Gifford, David",
  title        = "Concurrent Compacting Garbage Collection of a Persistent Heap",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "161--174",
  month        = dec,
  keywords     = "persistence, garbage collection, transaction based storage,
    dynamic storage management, heaps", 
  abstract     = "We describe a replicating garbage collector for a persistent
    heap.  The garbage collector cooperates with a transaction manager to
    provide safe and efficient transactional storage management.  Clients read
    and write the heap in primary memory and can commit or abort their write
    operations.  When write operations are committed they are preserved in
    stable storage and survive system failures.  Clients can freely access the
    heap during garbage collection because the collector concurrently builds a
    compact replica of the heap.  A log captures client write operations and is
    used to support both the transaction manager and the replicating garbage
    collector.Our implementation is the first to provide concurrent and
    compacting garbage collection of a persistent heap.  Measurements show that
    concurrent replicating collection produces significantly shorter pause
    times than stop-and-copy collection.  For small transactions, throughput is
    limited by the logging bandwidth of the underlying log manager.  The
    results suggest that replicating garbage collection offers a flexible and
    efficient way to provide automatic storage management in transaction
    systems, object-oriented databases and persistent programming
    environments.", 
  location     = "https://doi.org/10.1145/168619.168632", 
  location     = "https://www.cs.cmu.edu/afs/cs/project/venari/www/sosp93.html"
}

@Article{lrvm,
  author       = "Satyanarayanan, M. and Mashburn, Henry~H. and Kumar, Puneet and Steere, David~C. and Kistler, James~J.",
  title        = "Lightweight Recoverable Virtual Memory",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "146--160",
  month        = dec,
  keywords     = "camelot, virtual storage, transactions, rvm, crash recovery",
  abstract     = "Recoverable virtual memoryrefers to regions of a virtual
    address space on which transactional guarantees are offered.  This article
    describes RVM, an efficient, portable, and easily used implementation of
    recoverable virtual memory for Unix environments.  A unique characteristic
    of RVM is that it allows independent control over the transactional
    properties of atomicity, permanence, and serializability.  This leads to
    considerable flexibility in the use of RVM, potentially enlarging the range
    of applications that can benefit from transactions.  It also simplifies the
    layering of functionality such as nesting and distribution.  The article
    shows that RVM performs well over its intended range of usage even though
    it does not benefit from specialized operating system support.  It also
    demonstrates the importance of intra- and inter-transaction
    optimizations.", 
  location     = "https://doi.org/10.1145/174613.174615", 
  location     = "https://www.cs.cmu.edu/~satya/docdir/satya-sosp14-rvm-1993.pdf"
}

@Article{iibkd,
  author       = "Liedtke, Jochen",
  title        = "Improving {IPC} by Kernel Design",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "175--188",
  month        = dec,
  keywords     = "kernel, ipc, storage management, performance, threads,
    storage remapping",
  abstract     = "Inter-process communication (ipc) has to be fast and
    effective, otherwise programmers will not use remote procedure calls (RPC),
    multithreading and multitasking adequately.  Thus ipc performance is vital
    for modern operating systems, especially &amp;mu;-kernel based ones.
    Surprisingly, most &amp;mu;-kernels exhibit poor ipc performance, typically
    requiring 100 &amp;mu;s for a short message transfer on a modern processor,
    running with 50 MHz clock rate.In contrast, we achieve 5 &amp;mu;s; a
    twentyfold improvement.This paper describes the methods and principles
    used, starting from the architectural design and going down to the coding
    level.  There is no single trick to obtaining this high performance;
    rather, a synergetic approach in design and implementation on all levels is
    needed.  The methods and their synergy are illustrated by applying them to
    a concrete example, the L3 &amp;mu;-kernel (an industrial-quality operating
    system in daily use at several hundred sites).  The main ideas are to guide
    the complete kernel design by the ipc requirements, and to make heavy use
    of the concept of virtual address space inside the &amp;mu;-kernel
    itself.As the L3 experiment shows, significant performance gains are
    possible: compared with Mach, they range from a factor of 22 (8-byte
    messages) to 3 (4-Kbyte messages).  Although hardware specific details
    influence both the design and implementation, these techniques are
    applicable to the whole class of conventional general purpose von Neumann
    processors supporting virtual addresses.  Furthermore, the effort required
    is reasonably small, for example the dedicated parts of the &amp;mu;-kernel
    can be concentrated in a single medium sized module.", 
  location     = "https://doi.org/10.1145/168619.168633"
}

@Article{esbfi,
  author       = "Wahbe, Robert and Lucco, Steven and Anderson, Thomas~E. and Graham, Susan~L.",
  title        = "Efficient Software-Based Fault Isolation",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "203--216",
  month        = dec,
  keywords     = "rpc, shared storage, address spaces",
  abstract     = "One way to provide fault isolation among cooperating software
    modules is to place each in its own address space.  However, for
    tightly-coupled modules, this solution incurs prohibitive context switch
    overhead.  In this paper, we present a software approach to implementing
    fault isolation within a single address space.Our approach has two parts.
    First, we load the code and data for a distrusted module into its own fault
    do main, a logically separate portion of the application's address space.
    Second, we modify the object code of a distrusted module to prevent it from
    writing or jumping to an address outside its fault domain.  Both these
    software operations are portable and programming language independent.Our
    approach poses a tradeoff relative to hardware fault isolation:
    substantially faster communication between fault domains, at a cost of
    slightly increased execution time for distrusted modules.  We demonstrate
    that for frequently communicating modules, implementing fault isolation in
    software rather than hardware can substantially improve end-to-end
    application performance.", 
  location     = "https://doi.org/10.1145/168619.168635"
}

@Article{haavsiade,
  author       = "Jones, Alan and Hopper, Andrew",
  title        = "Handling Audio and Video Streams in a Distributed Environment",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "231--243",
  month        = dec,
  keywords     = "transputers, occam, buffering, multi-media streams, media mixing",
  abstract     = "Handling audio and video in a digital environment requires
    timely delivery of data.  This paper describes the principles adopted in
    the design of the Pandora networked multi-media system.  They attempt to
    give the user the best possible service while dealing with error and
    overload conditions.Pandora uses a sub-system to handle the multi-media
    peripherals.  It uses transputers and associated Occam code to implement
    the time critical functions.  Stream implementation is based on
    self-contained segments of data containing information for delivery,
    synchronisation and error recovery.  Decoupling buffers are used to allow
    concurrent operation of multiple processing elements.  Clawback buffers are
    used to resynchronise streams at their destinations with minimum
    latency.The system has proved robust in normal use, under overload, and in
    the presence of errors.  It has been in use for a number of years.The
    principles involved in this design are now being used in the development of
    two complementary systems.  One approach explodes Pandora by having the
    camera, microphone, speaker and display as independent units linked only by
    the LAN.  The other approach integrates these devices as peripheral cards
    in a powerful workstation.", 
  location     = "https://doi.org/10.1145/168619.168638"
}

@Article{no1993,
  author       = "Andrew Birrell and Greg Nelson and Susan Owicki and Edward Wobber",
  title        = "Network Objects",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "217--230",
  month        = dec,
  keywords     = "modula 3, remote objects, argument marshaling, transports",
  abstract     = "A network object is an object whose methods can be invoked
    over a network.  this paper describes the design, implementation and early
    experience with a network objects system for Modula-3.  this system is
    novel for its overall simplicity.  The paper includes a through description
    of realistic marshaling algorithms for network objects.", 
  location     = "https://doi.org/10.1145/168619.168638",
  location     = "http://birrell.org/andrew/papers/115-NetworkObjects-SOSP.pdf"
}

@Article{mamfqaos,
  author       = "Mohanty, Siba~N.",
  title        = "Models and Measurements for Quality Assessment of Software",
  journal      = surveys,
  year         = 1979,
  volume       = 11,
  number       = 3,
  pages        = "251--275",
  month        = sep,
  keywords     = "entropy function, software science, zipf's law, software
    characteristics, software errors, software testing and test planning,
    software reliability",
  abstract     = "Several software quality assessment methods which span the
    software life system are discussed.  the quality of a system design can be
    estimated by measuring the system entropy function or the system work
    function.  The quality improvement due to reconfiguration can be determined
    by calculating system entropy loading measure.  Software science and Zipf's
    law are shown to be useful for estimating program length and implementation
    time.  Deterministic and statistical methods are presented for providing
    the number of errors.  Testing theory is useful in planning the program
    test process, as discussed in this paper, it includes measurement of
    program structure characteristics to determine test effectiveness and test
    planning.  Statistical methods for estimating software reliability are also
    discussed.", 
  location     = "https://doi.org/10.1145/356778.356783"
}

@Article{psdfhpn,
  author       = "Maeda, Chris and Bershad, Brian~N.",
  title        = "Protocol Service Decomposition for High-Performance Networking",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "244--255",
  month        = dec,
  keywords     = "user-space libraries, protocol performance, communication
    architectures", 
  location     = "https://doi.org/10.1145/168619.168639",
  abstract     = "In this paper we describe a new approach to implementing
    network protocols that enables them to have high performance and high
    flexibility, while retaining complete conformity to existing application
    programming interfaces.  The key insight behind our work is that an
    application's interface to the network is distinct and separable from its
    interface to the operating system.  We have separated these interfaces for
    two protocol implementations, TCP/IP and UDP/IP, running on the Mach 3.0
    operating system and UNIX server.  Specifically, library code in the
    application's address space implements the network protocols and transfers
    data to and from the network, while an operating system server manages the
    heavyweight abstractions that applications use when manipulating the
    network through operations other than send and receive.  On DECstation
    5000/200 systems connected by 10Mb/sec Ethernet, this approach to protocol
    decomposition achieves TCP/IP throughput of 1088 KB/second, which is
    comparable to that of a high-quality in-kernel TCP/IP implementation, and
    substantially better than a server-based one.  Our approach achieves
    small-packet UDP/IP round trip latencies of 1.23 ms, again comparable to a
    kernel-based implementation and more than twice as fast as a server-based
    one." 
}

@Article{aittos,
  author       = "Wobber, Edward and Abadi, Mart{\' \i}n and Burrows, Michael and Lampson, Butler",
  title        = "Authentication in the {Taos} Operating System",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "256--269",
  month        = dec,
  keywords     = "authentication, principal management, authority manager,
    credential management, certificates",
  abstract     = "We describe a design for security in a distributed system and
    its implementation.  In our design, applications gain access to security
    services through a narrow interface.  This interface provides a notion of
    identity that includes simple principals, groups, roles, and delegations.
    A new operating system component manages principals, credentials, and
    secure channels.  It checks credentials according to the formal rules of a
    logic of authentication.  Our implementation is efficient enough to support
    a substantial user community.", 
  location     = "https://www.microsoft.com/en-us/research/publication/authentication-in-the-taos-operating-system/", 
  location     = "https://doi.org/10.1145/174613.174614"
}

@Article{pliiauce,
  author       = "Spreitzer, Mike and Theimer, Marvin",
  title        = "Providing Location Information in a Ubiquitous Computing Environment",
  journal      = sosp93,
  year         = 1993,
  volume       = 27,
  number       = 5,
  pages        = "270--283",
  month        = dec,
  keywords     = "system architectures, location management, privacy, sensors",
  abstract     = "To take full advantage of the promise of ubiquitous computing
    requires the use of location information, yet people should have control
    over who may know their whereabouts.  We present an architecture that
    achieves these goals for an interesting set of applications.  Personal
    information is managed by User Agents, and a partially decentralized
    Location Query Service is used to facilitate location-based operations.
    This architecture gives users primary control over their location
    information, at the cost of making more expensive certain queries, such as
    those wherein location and identity closely interact.  We also discuss
    various extensions to our architecture that offer users additional
    trade-offs between privacy and efficiency.  Finally, we report some
    measurements of the unextended system in operation, focusing on how well
    the system is actually able to track people.  Our system uses two kinds of
    location information, which turn out to provide partial and complementary
    coverage.", 
  location     = "https://doi.org/10.1145/168619.168641"
}

@Article{cuiupbevpac,
  author       = "Myers, Brad~A.",
  title        = "Creating User Interfaces Using Programming by Example, Visual Programming, and Constraints",
  journal      = toplas,
  year         = 1990,
  volume       = 12,
  number       = 2,
  pages        = "143--177",
  month        = apr,
  keywords     = "constraints, direct manipulation, plausible inferences,
    programming by example, user interface design, user interface management
    systems, visual programming",
  abstract     = "Peridot is an experimental tool that allows designers to
    create user interface components without conventional programming.  The
    designer draws pictures of what the interface should look like and then
    uses the mouse and other input devices to demonstrate how the interface
    should operate.  Peridot generalizes from these example pictures and
    actions to create parameterized procedures, such as those found in
    conventional user interface libraries such as the Macintosh Toolbox.
    Peridot uses visual programming, programming by example, constraints, and
    plausible inferencing to allow nonprogrammers to create menus, buttons,
    scroll bars, and many other interaction techniques easily and quickly.
    Peridot created its own interface and can create almost all of the
    interaction techniques in the Macintosh Toolbox.  Therefore, Peridot
    demonstrates that it is possible to provide sophisticated programming
    capabilities to nonprogrammers in an easy-to-use manner and still have
    sufficient power to generate interesting and useful programs.", 
  location     = "https://doi.org/10.1145/78942.78943"
}

@Article{cstjbaps,
  author       = "Serpette, Bernard Paul and Serrano, Manuel",
  title        = "Compiling {Scheme} to {JVM} Bytecode:  {A} Performance Study",
  journal      = icfp02,
  year         = 2002,
  volume       = 37,
  number       = 9,
  pages        = "259--270",
  month        = sep,
  keywords     = "jvm, bytecode, functional compilation, boxing, performance,
    tail calls",
  abstract     = "We have added a Java virtual machine (henceforth JVM)
    bytecode generator to the optimizing Scheme-to-C compiler Bigloo.  We named
    this new compiler BiglooJVM.  We have used this new compiler to evaluate
    how suitable the JVM bytecode is as a target for compiling strict
    functional languages such as Scheme.  In this paper, we focus on the
    performance issue.  We have measured the execution time of many Scheme
    programs when compiled to C and when compiled to JVM.  We found that for
    each benchmark, at least one of our hardware platforms ran the BiglooJVM
    version in less than twice the time taken by the Bigloo version.  In order
    to deliver fast programs the generated JVM bytecode must be carefully
    crafted in order to benefit from the speedup of just-in-time compilers.", 
  location     = "https://doi.org/10.1145/583852.581503"
}

@Article{llf3yom,
  author       = "Andrew~S. Tannenbaum",
  title        = "Lessons Learned from 30 Years of {MINIX}",
  journal      = cacm,
  year         = 2016,
  volume       = 59,
  number       = 3,
  pages        = "70--78",
  month        = mar,
  keywords     = "operating systems, minix, linux, software development,
    software engineering",
  abstract     = "While Linux is well known, its direct ancestor, MINIX, is now
    30 and still quite spry for such aged software.  Its story and how it and
    Linux got started is not well known, and there are perhaps some lessons to
    be learned from MINIX's development.  Some of these lessons are specific to
    operating systems, some to software engineering, and some to other areas
    (such as project management).  Neither MINIX nor Linux was developed in a
    vacuum.  There was quite a bit of relevant history before either got
    started, so a brief introduction may put this material in perspective.", 
  location     = "https://doi.org/10.1145/2795228"
}

@Article{pahlpntorsavocp,
  author       = "Billington, Jonathan and Wheeler, Geoffrey~R. and Wilbur-Ham, Michael~C.",
  title        = "{PROTEAN}:  {A} High-Level {Petri} Net Tool for the Specification and Verification of Communication Protocols",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "301--316",
  month        = mar,
  keywords     = "automated verification, computer graphics, petri nets,
    protocol analysis, protocol design, software cad, specification animation",
  abstract     = "The PROTEAN protocol emulation and analysis computer aid is
    presented.  It is based on a formal specification technique called numerical
    Petri nets (NPNs), and provides both graphical (color) and textual
    interfaces to the protocol designer.  NPN specifications may be created,
    stored, appended to other NPNs, structured, edited, listed, displayed, and
    analyzed.  Interactive simulation, exhaustive reachability analysis, and
    several directed graph analysis facilities are described.  Specification
    languages are compared, with concentration on extended finite state
    machines and high-level Petri nets.  Boththe NPN and PROTEAN facilities are
    described and illustrated with a simple example.  The application of
    PROTEAN to complex examples is mentioned briefly.  Work towards a
    comprehensive protocol engineering workstation is also discussed.",
  location     = "https://doi.org/10.1109/32.4651"
}

@Article{taba,
  author       = "Olivier Danvy and Mayer Goldberg",
  title        = "There and Back Again",
  journal      = icfp,
  year         = 2002,
  volume       = 37,
  number       = 9,
  pages        = "230--234",
  month        = sep,
  keywords     = "list traversal, continuations, catalan numbers, convolutions,
    palindromes",
  abstract     = "We present a programming pattern where a recursive function
    defined over a data structure traverses another data structure at return
    time.  The idea is that the recursive calls get us ‘there’ by traversing
    the first data structure and the returns get us ‘back again ’ while
    traversing the second data structure.  We name this programming pattern of
    traversing a data structure at call time and another data structure at
    return time “There And Back Again ” (TABA).  The TABA pattern directly
    applies to computing symbolic convolutions and to multiplying polynomials.
    It also blends well with other programming patterns such as dynamic
    programming and traversing a list at double speed.  We illustrate TABA and
    dynamic programming with Catalan numbers.  We illustrate TABA and
    traversing a list at double speed with palindromes and we obtain a novel
    solution to this traditional exercise.  Finally, through a variety of tree
    traversals, we show how to apply TABA to other data structures than lists.
    A TABA-based function written in direct style makes full use of an
    ALGOL-like control stack and needs no heap allocation.  Conversely, in a
    TABA-based function written in continuation-passing style and recursively
    defined over a data structure (traversed at call time), the continuation
    acts as an iterator over a second data structure (traversed at return
    time).  In general, the TABA pattern saves one from accumulating
    intermediate data structures at call time", 
  location     = ""
}

@Article{ptacropp,
  author       = "Waddle, Vance~E.",
  title        = "Production Trees:  {A} Compact Representation of Parsed Programs",
  journal      = toplas,
  year         = 1990,
  volume       = 12,
  number       = 1,
  pages        = "61--83",
  month        = jan,
  keywords     = "parse trees, intermediate representation, space efficiency,
    parsing", 
  abstract     = "Abstract syntax trees were devised as a compact alternative
    to parse trees, because parse trees are known to require excessive amounts
    of storage to represent parsed programs.  However, the savings that
    abstract syntax trees actually achieve have never been precisely described
    because the necessary analysis has been missing.  Without it, one can only
    measure particular cases that may not adequately represent all the possible
    behaviors.  We introduce a data structure, production trees, that are more
    compact than either abstract syntax trees or parse trees.  Further, we
    develop the necessary analysis to characterize the storage requirements of
    parse trees, abstract syntax trees, and production trees and relate the
    size of all three to the size of the program's text.  The analysis yields
    the parameters needed to characterize these storage behaviors over their
    entire range.  We flesh out the analysis by measuring these parameters for
    a sample of &ldquo;C&rdquo; programs.  For these programs, production trees
    were from 1/15 to 1/23 the size of the corresponding parse tree, l/2.7 the
    size of a (minimal) abstract syntax tree, and averaged only 2.83 times the
    size of the program text.", 
  location     = "https://doi.org/10.1145/77606.77609"
}

@Article{ewtiq,
  author       = "Schmuck, Frank and Wyllie, Jim",
  title        = "Experience with Transactions in {QuickSilver}",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "239--253",
  month        = oct,
  keywords     = "transactions, servers, ipc, file systems, os services, quicksilver",
  abstract     = "All programs in the QuickSilver distributed system behave
    atomically with respect to their updates to permanent data.  Operating
    system support for transactions provides the framework required to support
    this, as well as a mechanism that unifies reclamation of resources after
    failures or normal process termination.  This paper evaluates the use of
    transactions for these purposes in a general purpose operating system and
    presents some of the lessons learned from our experience with a complete
    running system based on transactions.  Examples of how transactions are
    used in QuickSilver and measurements of their use demonstrate that the
    transaction mechanism provides an efficient and powerful means for solving
    many of the problems introduced by operating system extensibility and
    distribution.", 
  location     = "https://doi.org/10.1145/121133.121171", 
  location     = "https://pdos.csail.mit.edu/archive/6.824-2005/papers/quicksilver91.pdf"
}

@Article{doitcfs,
  author       = "Kistler, James~J. and Satyanarayanan, M.",
  title        = "Disconnected Operation in the {Coda} File System",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "213--225",
  month        = oct,
  keywords     = "disconnected operation, file systems, client-server
    architecture, coda file system, eventual consistency",
  abstract     = "Disconnected operation is a mode of operation that enables a
    client to continue accessing critical data during temporary failures of a
    shared data repository.  An important, though not exclusive, application of
    disconnected operation is in supporting portable computers.  In this paper,
    we show that disconnected operation is feasible, efficient and usable by
    describing its design and implementation in the Coda File System.  The
    central idea behind our work is that caching of data, now widely used for
    performance, can also be exploited to improve availability.", 
  location     = "https://doi.org/10.1145/146941.146942",
  location     = "https://www.cs.cmu.edu/~satya/docdir/kistler-tocs-coda-1992.pdf"
}

@Article{rithfs,
  author       = "Liskov, Barbara and Ghemawat, Sanjay and Gruber, Robert and Johnson, Paul and Shrira, Liuba and Williams, Michael",
  title        = "Replication in the {Harp} File System",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "226--238",
  month        = oct,
  keywords     = "replication, virtual file systems, views, logs",
  abstract     = "This paper describes the design and implementation of the
    Harp file system.  Harp is a replicated Unix file system accessible via the
    VFS interface.  It provides highly available and reliable storage for files
    and guarantees that file operations are executed atomically in spite of
    concurrency and failures.  It uses a novel variation of the primary copy
    replication technique that provides good performance because it allows us
    to trade disk accesses for network communication.  Harp is intended to be
    used within a file service in a distributed network; in our current
    implementation, it is accessed via NFS.  Preliminary performance results
    indicate that Harp provides equal or better response time and system
    capacity than an unreplicated implementation of NFS that uses Unix files
    directly.", 
  location     = "https://doi.org/10.1145/121133.121169",
  location     = "http://www.pmg.csail.mit.edu/papers/harp.pdf"
}

@Article{moadfs,
  author       = "Baker, Mary~G. and Hartman, John~H. and Kupfer, Michael~D. and Shirriff, Ken~W. and Ousterhout, John~K.",
  title        = "Measurements of a Distributed File System",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "198--212",
  month        = oct,
  keywords     = "caching, i-o behavior, trace-driven analysis, sprite, cache
    consistency",
  abstract     = "We analyzed the user-level file access patterns and caching
    behavior of the Sprite distributed file system.  The first part of our
    analysis repeated a study done in 1985 of the: BSD UNIX file system.  We
    found that file throughput has increased by a factor of 20 to an average of
    8 Kbytes per second per active user over 10-minute intervals, and that the
    use of process migration for load sharing increased burst rates by another
    factor of six.  Also, many more very large (multi-megabyte) files are in
    use today than in 1985.  The second part of our analysis measured the
    behavior of Sprite's main-memory file caches.  Client-level caches average
    about 7 Mbytes in size (about one-quarter to one-third of main memory) and
    filter out about 50% of the traffic between clients and servers.  35% of
    the remaining server traffic is caused by paging, even on workstations with
    large memories.  We found that client cache consistency is needed to
    prevent stale data errors, but that it is not invoked often enough to
    degrade overall system performance.", 
  location     = "https://doi.org/10.1145/121133.121164"
}

@Article{aiatlr,
  author       = "Rodeheffer, Thomas L. and Schroeder",
  title        = "Autoconfiguration in {Autonet}",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "183--197",
  month        = oct,
  keywords     = "skeptics, networking, network configuration, failure
    detection, topology discovery, distributed algorithms, discovered spanning
    trees, failure modes, network management, lans, cross-bar switches",
  abstract     = "Autonet is a self-configuring local area network composed of
    switches interconnected by 100 Mbit/second, full-duplex, point-to-point
    links.  The switches contain 12 ports that are internally connected by a
    full crossbar.  Switches use cut-through to achieve a packet forwarding
    latency as low as 2 microseconds per switch.  Any switch port can be cabled
    to any other switch port or to a host network controller.  A processor in
    each switch monitors the network’s physical configuration.  A distributed
    algorithm running on the switch processors computes the routes packets are
    to follow and fills in the packet forwarding table in each switch.  This
    algorithm automatically recalculates the forwarding tables to incorporate
    repaired or new links and switches, and to bypass links and switches that
    have failed or been removed.  Host network controllers have alternate ports
    to the network and fail over if the active port stops working.  With
    Autonet, distinct paths through the set of network links can carry packets
    in parallel.  Thus, in a suitable physical configuration, many pairs of
    hosts can communicate simultaneously at full link bandwidth.  The aggregate
    bandwidth of an Autonet can be increased by adding more links and switches.
    Each switch can handle up to 2 million packets/second.  Coaxial links can
    span 100 meters and fiber links can span two kilometers.  A 30-switch
    network with more than 100 hosts is the service network for Digital’s
    Systems Research Center .", 
  location     = "https://www.microsoft.com/en-us/research/publication/automatic-reconfiguration-in-autonet/"
}

@Article{ivfp,
  author       = "Hanna, Keith",
  title        = "Interactive Visual Functional Programming",
  journal      = icfp,
  year         = 2002,
  volume       = 37,
  number       = 9,
  pages        = "145--156",
  month        = sep,
  keywords     = "haskell, spreadsheets, style sheets, incremental development",
  abstract     = "An interactive graphical environment for supporting the
    development and use of Haskell applications programs is described.  The
    environment, named Vital, is particularly intended for supporting the
    open-ended, incremental development style often preferred by non-specialist
    users in which successive steps of program development are motivated and
    informed by results so far obtained.Significant features of Vital include:
    the graphical display of data structures in a format defined by a
    datatype-indexed stylesheet, the way that evaluation of (possibly infinite)
    values is demand-driven by the action of the user scrolling around an
    unbounded workspace, and support for copy-and-paste graphical editing of
    data structures.  This latter allows, for example, the user to modify a
    complex data structure by point-and-click operations, or to create (by
    functional evaluation) a regular data structure and then edit values or
    expressions into it.  The effect of each editing operation is immediately
    reflected in the Haskell program source code.", 
  location     = "https://doi.org/10.1145/581478.581493"
}

@Article{aseftsaaopocac,
  author       = "Aggarwal, Sudhir and Barbar{\' a}, Daniel and Meth, Kalman~Z.",
  title        = "{A} Software Environment for the Specification and Analysis of Problems of Coordination and Concurrency",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "280--290",
  month        = mar,
  keywords     = "analysis, verification, distributed systems, formal
    descriptions, parallel languages, simulation, software environments",
  abstract     = "The SPANNER software environment for the specification and
    analysis of concurrent process coordination and resource sharing
    coordination is described.  In the SPANNER environment, one can formally
    produce a specification of a distributed computing problem, and then verify
    its validity through reachability analysis and simulation.  SPANNER is
    based on a finite-state machine model called the selection/resolution
    model.  The capabilities of SPANNER are illustrated by the analysis of two
    classical coordination problems: (1) the dining philosophers; and (2)
    Dijkstra's concurrent programming problem.  In addition, some of the more
    recently implemented capabilities of the SPANNER system are discussed, such
    as process types and cluster variables.", 
  location     = "https://doi.org/10.1109/32.4649"
}

@Article{uctitmacios,
  author       = "Draves, Richard~P. and Bershad, Brian~N. and Rashid, Richard~F. and Dean, Randall~W.",
  title        = "Using Continuations to Implement Thread Management and Communication in Operating Systems",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "122--136",
  month        = oct,
  keywords     = "mach, threads, kernel threads, control transfer,
    continuations, optimizations, storage management, performance improvements,
    os structure, rpc",
  abstract  = "We have improved the performance of the Mach 3.0 operating
    system by redesigning its internal thread and interprocess communication
    facilities to use continuations as the basis for control transfer.
    Compared to previous versions of Mach 3.0, our new system consumes 85% less
    space per thread.  Cross-address space remote procedure calls execute 14%
    faster.  Exception handling runs over 60% faster.  In addition to improving
    system performance, we have used continuations to generalize many control
    transfer optimizations that are common to operating systems, and have
    recast those optimizations in terms of a single implementation methodology.
    This paper describes our experiences with using continuations in the Mach
    operating system.",
  location     = "https://doi.org/10.1145/121133.121155"
}

@Article{iapom,
  author       = "Carter, John~B. and Bennett, John~K. and Zwaenepoel, Willy",
  title        = "Implementation and Pefrormance of {Munin}",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "152--164",
  month        = oct,
  keywords     = "shared storage, parallel programs, release consistency,
    munin, program annotations, barriers, locking",
  abstract     = "Munin is a distributed shared memory (DSM) system that allows
    shared memory parallel programs to be executed efficiently on distributed
    memory multiprocessors.  Munin is unique among existing DSM systems in its
    use of multiple consistency protocols and in its use of release
    consistency.  In Munin, shared program variables are annotated with their
    expected access pattern, and these annotations are then used by the runtime
    system to choose a consistency protocol best suited to that access pattern.
    Release consistency allows Munin to mask network latency and reduce the
    number of messages required to keep memory consistent.  Munin's
    multiprotocol release consistency is implemented in software using a
    delayed update queue that buffers and merges pending outgoing writes.  A
    sixteen-processor prototype of Munin is currently operational.  We evaluate
    its implementation and describe the execution of two Munin programs that
    achieve performance within ten percent of message passing implementations
    of the same programs.  Munin achieves this level of performance with only
    minor annotations to the shared memory programs.", 
  location     = "https://doi.org/10.1145/121132.121159"
}

@Article{tronmm,
  author       = "LaRowe Jr., Richard~P. and Ellis, Carla Schlatter and Kaplan, Laurence~S.",
  title        = "The Robustness of {NUMA} Memory Management",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "137--151",
  keywords     = "parallel programming, numa architectures, program
    performance, distributed memory, page management policies, parameters",
  abstract     = "The study of operating systems level memory management
    policies for nonuniform memory access time (NUMA) shared memory
    multiprocessors is an area of active research.  Previous results have
    suggested that the best policy choice often depends on the application
    under consideration, while others have reported that the best policy
    depends on the particular architecture.  Since both observations have
    merit, we explore the concept of policy tuning on an
    application/architecture basis.We introduce a highly tunable dynamic page
    placement policy for NUMA multiprocessors, and address issues related to
    the tuning of that policy to different architectures and applications.
    Experimental data acquired from our DUnX operating system running on two
    different NUMA multiprocessors are used to evaluate the usefulness,
    importance, and ease of policy tuning.Our results indicate that while
    varying some of the parameters can have dramatic effects on performance, it
    is easy to select a set of default parameter settings that result in good
    performance for each of our test applications on both architectures.  This
    apparent robustness of our parameterized policy raises the possibility of
    machine-independent memory management for NUMA-class machines.", 
  location     = "https://doi.org/10.1145/121132.121158"
}

@Article{aidstap2002,
  author       = "Lampson, Butler and Abadi, Mart{\' \i}n and Burrows, Michael and Wobber, Edward",
  title        = "Authentication in Distributed Systems:  Theory and Practice",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "122--136",
  keywords     = "authentication, distributed systems, authentication logic,
    channels, encryption, names, roles, ipc, access control",
  abstract     = "We describe a theory of authentication and a system that
    implements it.  Our theory is based on the notion of principal and a
    'speaks for' relation between principals.  A simple principal either has a
    name or is a communication channel; a compound principal can express an
    adopted role or delegated authority.  The theory shows how to reason about
    a principal's authority by deducing the other principals that it can speak
    for; authenticating a channel is one important application. We use the
    theory to explain many existing and proposed security mechanisms.  In
    particular, we describe the system we have built.  It passes principals
    efficiently as arguments or results of remote procedure calls, and it
    handles public and shared key encryption, name lookup in a large name
    space, groups of principals, program loading, delegation, access control,
    and revocation.",  
  location     = "https://doi.org/10.1145/138873.138874", 
  location     = "https://www.microsoft.com/en-us/research/publication/authentication-in-distributed-systems-theory-and-practice/"
}

@Article{saeksftulmop,
  author       = "Anderson, Thomas~E. and Bershad, Brian~N. and Lazowska, Edward~D. and Levy, Henry~M.",
  title        = "Scheduler Activations:  Effective Kernel Support for the User-Level Management of Parallelism",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "95--109",
  keywords     = "user-space threads, kernel threads, parallel programming,
    protection boundaries, up-calls, scheduler activations, parallel performance",
  abstract     = "Threads are the vehicle for concurrency in many approaches to
    parallel programming.  Threads separate the notion of a sequential
    execution stream from the other aspects of traditional UNIX-like processes,
    such as address spaces and I/O descriptors.  The objective of this
    separation is to make the expression and control of parallelism
    sufficiently cheap that the programmer or compiler can exploit even
    fine-grained parallelism with acceptable overhead.Threads can be supported
    either by the operating system kernel or by user-level library code in the
    application address space, but neither approach has been fully
    satisfactory.  This paper addresses this dilemma.  First, we argue that the
    performance of kernel threads is inherently worse than that of user-level
    threads, rather than this being an artifact of existing implementations; we
    thus argue that managing parallelism at the user level is essential to
    high-performance parallel computing.  Next, we argue that the lack of
    system integration exhibited by user-level threads is a consequence of the
    lack of kernel support for user-level threads provided by contemporary
    multiprocessor operating systems; we thus argue that kernel threads or
    processes, as currently conceived, are the wrong abstraction on which to
    support user-level management of parallelism.  Finally, we describe the
    design, implementation, and performance of a new kernel interface and
    user-level thread package that together provide the same functionality as
    kernel threads without compromising the performance and flexibility
    advantages of user-level management of parallelism.", 
  location     = "https://doi.org/10.1145/121132.121151"
}

@Article{gdlmhe,
  author       = "Margaret~H. Eich",
  title        = "Graph Directed Locking",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 2,
  pages        = "133--140",
  month        = feb,
  keywords     = "concurrency control, database systems, deadlock, locking
    protocols, serializability, transactions, two-phase locking, graph directed
    lock migration",
  abstract     = "A non-two-phase database concurrency control technique is
    introduced. The technique is deadlock-free, places no restrictions on the
    structure of the data, never requires data to be reread, never forces a
    transaction to be rolled back in order to achieve serializability, applies
    a type of lock conversion, and allows items to be released to subsequent
    transactions as soon as possible.  The method introduced, database flow
    graph locking (FGL), uses a directed acyclic graph to direct the migration
    of locks between transactions.  Unlike many previous non-two-phase methods,
    the database need not be structured in any specific fashion.  The effect of
    these changes is that, with the same serializable schedule, FGL obtains a
    higher degree of concurrency than two-phase locking (2PL).  Overhead
    requirements for database flow graph locking are comparable to those for
    two-phase locking, with 2PL being better in low conflict situations and FGL
    better in high conflict.", 
  location     = "https://doi.org/10.1109/32.4633"
}

@Article{ahpmsfsd,
  author       = "Muller, Keith and Pasquale, Joseph",
  title        = "{A} High Performance Multi-Structured File System Design",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "56--67",
  keywords     = "file system, workload characteristics, caching, log storage,
    performance scaling",
  abstract     = "File system I/O is increasingly becoming a performance
    bottleneck in large distributed computer systems.  This is due to the
    increased file I/O demands of new applications, the inability of any single
    storage structure to respond to these demands, and the slow decline of,
    disk access times (latency and seek) relative to the rapid increase in CPU
    speeds, memory size, and network bandwidth.We present a multi-structured
    file system designed for high bandwidth I/O and fast response.  Our design
    is based on combining disk caching with three different file storage
    structures, each implemented on an independent and isolated disk array.
    Each storage structure is designed to optimize a different set of file
    system access characteristics such as cache writes, directory searches,
    file attribute requests or large sequential reads/writes.As part of our
    study, we analyze the performance of an existing file system using trace
    data from UNIX disk I/O-intensive workloads.  Using trace driven
    simulations, we show how performance is improved by using separate storage
    structures as implemented by a multi-structured file system.", 
  location     = "https://cseweb.ucsd.edu/~pasquale/Research/Papers/sosp91.pdf",
  location     = "https://doi.org/10.1145/121132.286600"
}

@Article{fcult,
  author       = "Marsh, Brian~D. and Scott, Michael~L. and LeBlanc, Thomas~J. and Markatos, Evangelos~P.",
  title        = "First-Class User-Level Threads",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "110--121",
  keywords     = "numa systems, software interrupts, shared kernel-user data,
    schedulers, user-space threads", 
  abstract     = "It is often desirable, for reasons of clarity, portability,
    and efficiency, to write parallel programs in which the number of processes
    is independent of the number of available processors.  Several modern
    operating systems support more than one process in an address space, but
    the overhead of creating and synchronizing kernel processes can be high.
    Many runtime environments implement lightweight processes (threads) in user
    space, but this approach usually results in second-class status for
    threads, making it difficult or impossible to perform scheduling operations
    at appropriate times (e.g.  when the current thread blocks in the kernel).
    In addition, a lack of common assumptions may also make it difficult for
    parallel programs or library routines that use dissimilar thread packages
    to communicate with each other, or to synchronize access to shared data.We
    describe a set of kernel mechanisms and conventions designed to accord
    first-class status to user-level threads, allowing them to be used in any
    reasonable way that traditional kernel-provided processes can be used,
    while leaving the details of their implementation to user-level code.  The
    key features of our approach are (1) shared memory for asynchronous
    communication between the kernel and the user, (2) software interrupts for
    events that might require action on the part of a user-level scheduler, and
    (3) a scheduler interface convention that facilitates interactions in user
    space between dissimilar kinds of threads.  We have incorporated these
    mechanisms in the Psyche parallel operating system, and have used them to
    implement several different kinds of user-level threads.  We argue for our
    approach in terms of both flexibility and performance.", 
  location     = "https://doi.org/10.1145/121132.344329"
}

@Article{dfsfdvaa,
  author       = "Rangan, P. Venkat and Vin, Harrick~M.",
  title        = "Designing File Systems for Digital Video and Audio",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  month        = oct,
  pages        = "81--94",
  keywords     = "ropes, media synchronization, data streams, media operations,
    scheduling",
  abstract     = "We address the unique requirements of a multimedia file
    system such as continuous storage and retrieval of media, maintenance of
    synchronization between multiple media streams, and efficient manipulation
    of huge media objects.  We present a model that relates disk and device
    characteristics to the recording rate, and derive storage granularity and
    scattering parameters that guarantee continuous access.  In order for the
    file system to support multiple concurrent requests, we develop admission
    control algorithms for determining whether a new request can be accepted
    without violating the realtime constraints of any of the requests.We define
    a strand as an immutable sequence of continuously recorded media samples,
    and then present a multimedia rope abstraction which is a collection of
    individual media strands tied together by synchronization information.  We
    devise operations for efficient manipulation of multi-stranded ropes, and
    develop an algorithm for maintaining the scattering parameter during
    editing so as to guarantee continuous playback of edited ropes.We have
    implemented a prototype multimedia file system, which serves as a testbed
    for experimenting with policies and algorithms for multimedia storage.  We
    present our initial experiences with using the file system.", 
  location     = "https://doi.org/10.1145/121132.121149"
}

@Article{saimfcm,
  author       = "Govindan, Ramesh and Anderson, David~P.",
  title        = "Scheduling and {IPC} Mechanisms for Continuous Media",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "68--80",
  month        = oct,
  keywords     = "media delivery, shared storage, upcalls, scheduling,
    user-space threads, streams, user-kernel interface, memory mapping",
  abstract     = "Next-generation workstations will have hardware support for
    digital continuous media (CM) such as audio and video.  CM applications
    handle data at high rates, with strict timing requirements, and often in
    small chunks.  If such applications are to run efficiently and predictably
    as user-level programs, an operating system must provide scheduling and IPC
    mechanisms that reflect these needs.  We propose two such mechanisms:
    split-level CPU scheduling of lightweight processes in multiple address
    spaces, and memory-mapped streams for data movement between address spaces.
    These techniques reduce the the number of user/kernel interactions (system
    calls, signals, and preemptions).  Compared with existing mechanisms, they
    can reduce scheduling and I/O overhead by a factor of 4 to 6.", 
  location     = "https://doi.org/10.1145/121132.121147"
}

@Article{tdaioalsfs,
  author       = "Rosenblum, Mendel and Ousterhout, John~K.",
  title        = "The Design and Implementation of a Log-Structured File System",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "1--15",
  month        = oct,
  keywords     = "log file systems, segment cleaning, disk utilization, crash
    recovery", 
  abstract     = "This paper presents a new technique for disk storage
    management called a log-structured file system.  A log-structured file
    system writes all modifications to disk sequentially in a log-like
    structure, thereby speeding up both file writing and crash recovery.  The
    log is the only structure on disk; it contains indexing information so that
    files can be read back from the log efficiently.  In order to maintain
    large free areas on disk for fast writing, we divide the log
    intosegmentsand use a segment cleaner to compress the live information from
    heavily fragmented segments.  We present a series of simulations that
    demonstrate the efficiency of a simple cleaning policy based on cost and
    benefit.  We have implemented a prototype log-structured file system called
    Sprite LFS; it outperforms current Unix file systems by an order of
    magnitude for small-file writes while matching or exceeding Unix
    performance for reads and large writes.  Even when the overhead for
    cleaning is included, Sprite LFS can use 70% of the disk bandwidth for
    writing, whereas Unix file systems typically can use only 5--10%.", 
  location     = "https://doi.org/10.1145/146941.146943",
  location     = "https://people.eecs.berkeley.edu/~brewer/cs262/LFS.pdf"
}

@Article{sfsdkg,
  author       = "Gifford, David~K. and Jouvelot, Pierre and Sheldon, Mark~A. and O'Toole Jr., James~W.",
  title        = "Semantic File Systems",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "16--25",
  month        = oct,
  keywords     = "indexing, virtual directories, user-space file systems,
    content-addressable file systems",
  abstract     = "A semantic file system is an information storage system that
    provides flexible associative access to the system's contents by
    automatically extracting attributes from files with file type specific
    transducers.  Associative access is provided by a conservative extension to
    existing tree-structured file system protocols, and by protocols that are
    designed specifically for content based access.  Compatiblity with existing
    file system protocols is provided by introducing the concept of a virtual
    directory.  Virtual directory names are interpreted as queries, and thus
    provide flexible associative access to files and directories in a manner
    compatible with existing software.  Rapid attribute-based access to file
    system contents is implemented by automatic extraction and indexing of key
    properties of file system objects.  The automatic indexing of files and
    directories is called semantic because user programmable transducers use
    information about the semantics of updated file system objects to extract
    the properties for indexing.  Experimental results from a semantic file
    system implementation support the thesis that semantic file systems present
    a more effective storage abstraction than do traditional tree structured
    file systems for information sharing and command level programming.", 
  location     = "https://doi.org/10.1145/121133.121138"
}

@Article{tiocaopsfmsmm,
  author       = "Vaswani, Raj and Zahorjan, John",
  title        = "The Implications of Cache Affinity on Processor Scheduling for Multiprogrammed, Shared Memory Multiprocessors",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "26--40",
  month        = oct,
  keywords     = "cache affinity, processor reallocation, processor scheduling,
    caches",
  abstract     = "In a shared memory multiprocessor with caches, executing
    tasks develop affinity to processors by filling their caches with data and
    instructions during execution.  A scheduling policy that ignores this
    affinity may waste processing power by causing excessive cache
    refilling.Our work focuses on quantifying the effect of processor
    reallocation on the performance of various parallel applications
    multiprogrammed on a shared memory multiprocessor, and on evaluating how
    the magnitude of this cost affects the choice of scheduling policy.We first
    identify the components of application response time, including processor
    reallocation costs.  Next, we measure the impact of reallocation on the
    cache behavior of several parallel applications executing on a Sequent
    Symmetry multiprocessor.  We also measure, the performance of these
    applications under a number of alternative allocation policies.  These
    experiments lead us to conclude that on current machines processor affinity
    has only a very weak influence on the choice of scheduling discipline, and
    that the benefits of frequent processor reallocation (in response to the
    changing parallelism of jobs) outweigh the penalties imposed by such
    reallocation.  Finally, we use this experimental data to parameterize a
    simple analytic model, allowing us to evaluate the effect of processor
    affinity on future machines, those containing faster processors and larger
    caches.", 
  location     = "https://doi.org/10.1145/121132.121140"
}

@Article{esocsfasmm,
  author       = "Anna~R. Karlin and Kai Li and Mark~S. Manasse and Susan~S. Owicki",
  title        = "Empirical Studies of Competitive Spinning for a Shared-Memory Multiprocessor",
  journal      = sosp91,
  year         = 1991,
  volume       = 25,
  number       = 5,
  pages        = "41--55",
  month        = oct,
  keywords     = "multiprocessors, synchronization, spin locks, lock waiting",
  abstract     = "Acquiring a lock to protect access to shared data is a common operation in multiprocessor programs.  Typically, the requesting thread is blocked if the lock it needs is held by another thread.  The cost of blocking one thread and activating another can be a substantial part of program execution time.  Alternatively, the thread could spin until the lock is free, or spin for a while and then block.  This may avoid context-switch overhead, but processor cycles may be wasted in unproductive spinning.  This paper studies seven strategies for determining whether and how long to spin before blocking.  This paper studies seven strategies for determining whether and how long to spin before blocking.  Of particular interest are competitive strategies, for which the performance can be shown to be no worse than some constant factor times an optimal off-line strategy.  The performance of five competitive strategies is compared with that of always blocking, always spinning, or using the optimal off-line algorithm.  Measurements of lock-waiting time distributions for five parallel programs were used to compare the cost of synchronization under all the strategies.  Additional measurements of elapsed time for some of the programs and strategies allowed assessment of the impact of synchronization strategy on overall program performance.  Both types of measurements indicate that the standard blocking strategy performs poorly compared to mixed strategies.  Among the mixed strategies studied, adaptive algorithms perform better than non-adaptive ones.",
  location     = "https://homes.cs.washington.edu/~karlin/papers/spinlock.ps"
}

@Article{cacm,
  author       = "Matthew Flatt",
  title        = "Composable and Compilable Macros",
  subtitle     = "You Want it When?",
  journal      = icfp02,
  year         = 2002,
  volume       = 37,
  number       = 9,
  pages        = "72--83",
  month        = sep,
  keywords     = "modules, macros, compilation, run-time, compile-time expansion",
  abstract     = "Many macro systems, especially for Lisp and Scheme, allow
    macro transformers to perform general computation.  Moreover, the language
    for implementing compile-time macro transformers is usually the same as the
    language for implementing run-time functions.  As a side effect of this
    sharing, implementations tend to allow the mingling of compile-time values
    and run-time values, as well as values from separate compilations.  Such
    mingling breaks programming tools that must parse code without executing
    it.  Macro implementors avoid harmful mingling by obeying certain
    macro-definition protocols and by inserting phase-distinguishing
    annotations into the code.  However, the annotations are fragile, the
    protocols are not enforced, and programmers can only reason about the
    result in terms of the compiler's implementation.  MzScheme---the language
    of the PLT Scheme tool suite---addresses the problem through a macro system
    that separates compilation without sacrificing the expressiveness of
    macros.", 
  location     = "https://doi.org/10.1145/581478.581486",
  location     = "https://www.cs.utah.edu/plt/publications/macromod.pdf"
}

@Article{qnmoccn,
  author       = "Wong, J.~W.",
  title        = "Queueing Network Modeling of Computer Communication Networks",
  journal      = surveys,
  year         = 1978,
  volume       = 10,
  number       = 3,
  pages        = "343--351",
  month        = sep,
  keywords     = "message switched networks, packet switched networks, routers,
    performance, modeling, end-to-end delay, throughput, buffer management,
    flow control",
  abstract     = "The application of queueing network models to the performance
    analysis of message-switched (or packet-switched) communication networks is
    surveyed.  The main topics covered are the analysis of end-to-end delay and
    the analysis of buffer management schemes.  A brief discussion on flow
    control is also included.  A queueing network model is developed for a
    single user-resource network.  The mean response time of a host computer in
    this network is illustrated by a numerical example.", 
  location     = "https://doi.org/10.1145/356733.356740"
}

@Article{cewfgnp1,
  author       = "Benoit~B. Mandelbrot and James~R. Wallis",
  title        = "Computer Experiments with Fractional Gaussian Noises, Part 1",
  journal      = "Water Resources Research",
  year         = 1969,
  volume       = 5,
  number       = 1,
  pages        = "228--241",
  month        = feb,
  keywords     = "fractional noise, secular averages, sequential variance,
    correlation, distributions, student's distribution",
  abstract     = "Fractional Gaussian noises are a family of random processes
    such that the interdependence between values of the processes at instants
    of time very distant from each other is small but non negligible.  It has
    been shown by mathematical analysis that such interdependence has precisely
    the intensity required for a good mathematical model of long run
    hydro-logical and geophysical records.  This analysis will now be
    illustrated, extended and made practically usable, which the help of
    computer simulations.  In this Part, we shall stress the shape of the
    sample functions and the relations between past and future averages.", 
  location     = "https://users.math.yale.edu/~bbm3/web_pdfs/055computerExperimentsPart1.pdf"
}

@Article{cewfgnp2,
  author       = "Benoit~B. Mandelbrot and James~R. Wallis",
  title        = "Computer Experiments with Fractional Gaussian Noises, Part 2, Rescaled Ranges and Spectra",
  journal      = "Water Resources Research",
  year         = 1969,
  volume       = 5,
  number       = 1,
  pages        = "242--259",
  month        = feb,
  keywords     = "rescaled ranges, approximate factional noises, spectral analysis",
  abstract     = "Continuing the preceding paper, we shall report on computer
    experiments concerning the 'rescaled' range and the spectrum of fractional
    Gaussian noise.", 
  location     = "https://users.math.yale.edu/~bbm3/web_pdfs/055computerExperimentsPart1.pdf"
}

@Article{cewfgnp3,
  author       = "Benoit~B. Mandelbrot and James~R. Wallis",
  title        = "Computer Experiments with Fractional Gaussian Noises, Part 3, Mathematical Appendix",
  journal      = "Water Resources Research",
  year         = 1969,
  volume       = 5,
  number       = 1,
  pages        = "260--267",
  month        = feb,
  keywords     = "brownian motion, self-similarity, fractional brownian motion,
    grid correction",
  abstract     = "The present Appendix is devoted to mathematical
    considerations designed to fill in the innumerable logical gaps left in the
    preceding paper.  Even though most proofs will be merely sketched or
    committed, the notation remains heavy, and some readers may which to skip
    to formulas 1 and 2, which define Type 1 functions.",  
  location     = "https://users.math.yale.edu/~bbm3/web_pdfs/055computerExperimentsPart1.pdf"
}

@Article{epae,
  author       = "Arthur English",
  title        = "Extreme Programming",
  journal      = "Network World",
  year         = 2002,
  volume       = 19,
  number       = 4,
  pages        = 60,
  month        = jan,
  keywords     = "extreme programming, software development",
  abstract     = "Looking for a way to optimize creation of network software in
    your IT department? The lightweight development process of extreme
    programming might be the ticket." 
}

@Article{sfsaa,
  author       = "Robert~M. Winteringham",
  title        = "Stolen from Stardust and Air",
  subtitle     = "Idea Theft in the Entertainment Industry and a Proposal for a Concept Initiator Credit",
  journal      = "Federal Communications Law Journal",
  year         = 1994,
  volume       = 46,
  number       = 2,
  pages        = "373--396",
  keywords     = "copyright, initiator standard, idea theft",
  location     = "https://www.repository.law.indiana.edu/cgi/viewcontent.cgi?article=1019&context=fclj"
}

@Article{apdfc,
  author       = "Watson, Ian and Gurd, John",
  title        = "{A} Practical Data Flow Computer",
  journal      = ieeec,
  year         = 1982,
  volume       = 15,
  number       = 2,
  pages        = "51--57",
  month        = feb,
  keywords     = "system architecture, data-flow computing, token queue, token matching",
  abstract     = "Based on a tagged dynamic data flow model, this prototype
    machine has eight unusual matching functions for handling incoming data
    tokens at its computational nodes.",
  location     = "https://doi.org/10.1109/MC.1982.1653941"
}

@Article{fdap,
  author       = "Robin Evans",
  title        = "Figures, Doors and Passages",
  journal      = "Architectural Design",
  year         = 1978,
  volume       = 48,
  number       = 4,
  pages        = "267--278",
  keywords     = "This is the first of a series of articles by Robin Evans on
    the history of the house in relation to human affairs.  It is concerned
    exclusively with the issue of access and distinguishes between two extreme
    types, the matrix of connected rooms and the corridor plan, suggesting that
    each is the format for a distinctive way of life." 
}

@Article{eiotffsfdsa,
  author       = "Brent, R.~P.",
  title        = "Efficient Implementation of the First-Fit Strategy for Dynamic Storage Allocation",
  journal      = toplas,
  year         = 1989,
  volume       = 11,
  number       = 3,
  pages        = "388--403",
  month        = jul,
  keywords     = "storage management, allocation policies, heaps, trees,
    first-fit allocation",
  abstract     = "We describe an algorithm that efficiently implements the
    first-fit strategy for dynamic storage allocation.  The algorithm imposes a
    storage overhead of only one word per allocated block (plus a few percent
    of the total space used for dynamic storage), and the time required to
    allocate or free a block is O(log W), where W is the maximum number of
    words allocated dynamically.  The algorithm is faster than many commonly
    used algorithms, especially when many small blocks are allocated, and has
    good worst-case behavior.  It is relatively easy to implement and could be
    used internally by an operating system or to provide run-time support for
    high-level languages such as Pascal and Ada.  A Pascal implementation is
    given in the Appendix.", 
  location     = "https://doi.org/10.1145/65979.65981", 
  location     = "https://maths-people.anu.edu.au/~brent/pd/rpb089.pdf"
}

@Article{spamsv,
  author       = "Joan~S. Birman",
  title        = "Scientific Publishing:  {A} Mathematician's Viewpoint",
  journal      = "Notices of the AMS",
  year         = 2000,
  volume       = 47,
  number       = 7,
  pages        = "770--774",
  keywords     = "scientific publishing, market economies",
  abstract     = "We are in a time of ferment with regard to the ways in which
    mathematical research is being communicated throughout the world, and in
    particular with regard to the nature and cost of scientific journals.  This
    topic has been discussed in articles in the Notices by a commercial
    publisher [1] and by two research librarians [2] and also in numerous
    letters to the editor.  This article examines these and related issues from
    the point of view of a mathematician who has been actively involved in the
    journal editorial process." 
}

@Article{tdoaooci,
  author       = "Timothy A. Budd",
  title        = "The Design of an Object-Oriented Command Interpreter",
  journal      = spe,
  year         = 1988,
  volume       = 19,
  number       = 1,
  pages        = "33--51",
  month        = jan,
  keywords     = "interpreters, command languages, c, unix shell,
    object-oriented systems, productivity",
  abstract     = "Object-oriented programming languages are noted for their
    support of quick construction of large software systems.  They achieve this
    ability by emphasizing the what of system behavior, and de-emphasizing the
    how.  Such characteristics should make the object-oriented approach
    attractive to casual or novice computer users.  One of the best known
    object-oriented programming languages, Smalltalk, was initially designed
    with such users in mind.  On the other end of the scale, the Unix operating
    system is widely regarded as a good environment for software development.
    However, its large number of often terse and cryptic commands make it
    difficult for novice or casual users to use.  In this paper we argue that
    one solution is to create an object-oriented command interpreter, or shell,
    between the user and the underlying system.  This paper describes a
    prototype object-oriented shell, and the lessons learned from building and
    using the shell.",
  location     = "https://ir.library.oregonstate.edu/concern/technical_reports/kh04dq929"
}

@Article{accfj,
  author       = "Colby, Christopher and Lee, Peter and Necula, George~C. and Blau, Fred and Plesko, Mark and Cline, Kenneth",
  title        = "{A} Certifying Compiler for {Java}",
  journal      = sigplan # " (" # pcpldi # ", PLDI '00)",
  year         = 2000,
  volume       = 35,
  number       = 5,
  pages        = "95--107",
  month        = may,
  keywords     = "code annotations, verification generation, type-secure code,
    certified code, proof-carrying code",
  abstract     = "This paper presents the initial results of a project to
    determine if the techniques of proof-carrying code and certifying compilers
    can be applied to programming languages of realistic size and complexity.
    The experiment shows that: (1) it is possible to implement a certifying
    native-code compiler for a large subset of the Java programming language;
    (2) the compiler is freely able to apply many standard local and global
    optimizations; and (3) the PCC binaries it produces are of reasonable size
    and can be rapidly checked for type safety by a small proof-checker.  This
    paper also presents further evidence that PCC provides several advantages
    for compiler development.  In particular, generating proofs of the target
    code helps to identify compiler bugs, many of which would have been
    difficult to discover by testing.", 
  location     = "https://doi.org/10.1145/358438.349315"
}

@Article{macdsmd,
  author       = "Fleisch, Brett~D. and Popek, Gerald~J.",
  title        = "Mirage:  {A} Coherent Distributed Shared Memory Design",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "211--223",
  month        = dec,
  keywords     = "distributed shared storage, coherence protocol, paged segments",
  abstract     = "Shared memory is an effective and efficient paradigm for
    interprocess communication.  We are concerned with software that makes use
    of shared memory in a single site system and its extension to a
    multimachine environment.  Here we describe the design of a distributed
    shared memory (DSM) system called Mirage developed at UCLA.  Mirage
    provides a form of network transparency to make network boundaries
    invisible for shared memory and is upward compatible with an existing
    interface to shared memory.  We present the rationale behind our design
    decisions and important details of the implementation.  Mirage's basic
    performance is examined by component timings, a worst case application, and
    a &ldquo;representative&rdquo; application.  In some instances of page
    contention, the tuning parameter in our design improves application
    throughput.  In other cases, thrashing is reduced and overall system
    performance improved using our tuning parameter.", 
  location     = "https://doi.org/10.1145/74851.74871"
}

@Article{laeftmfdfcc,
  author       = "Gray, Cary G. and Cheriton, David R.",
  title        = "Leases:  An Efficient Fault-Tolerant Mechanism for Distributed File Cache Consistency",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "202--210",
  month        = dec,
  keywords     = "caching, consistency, distributed systems, v kernel, lease
    management, fault tolerance",
  abstract     = "Caching introduces the overhead and complexity of ensuring
    consistency, reducing some of its performance benefits.  In a distributed
    system, caching must deal with the additional complications of
    communication and host failures.  Leases are proposed as a time-based
    mechanism that provides efficient consistent access to cached data in
    distributed systems.  Non-Byzantine failures affect performance, not
    correctness, with their effect minimized by short leases.  An analytic
    model and an evaluation for file access in the V system show that leases of
    short duration provide good performance.  The impact of leases on
    performance grows more significant in systems of larger scale and higher
    processor performance.",
  location     = "https://doi.org/10.1145/74850.74870",
  location     = "https://web.stanford.edu/class/cs240/readings/89-leases.pdf"
}

@Article{taisoitsk,
  author       = "Henry Massalin and Calton Pu",
  title        = "Threads and Input\slash Output in the {Synthesis} Kernel",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "191--201",
  month        = dec,
  keywords     = "dynamic code generation, partial evaluation, active data
    structures, kernel architecture, threading",
  abstract     = "The Synthesis operating system kernel combines several
    techniques to provide high performance, including kernel code synthesis,
    fine-grain scheduling, and optimistic synchronization.  Kernel code
    synthesis reduces the execution path for frequently used kernel calls.
    Optimistic synchronization increases concurrency within the kernel.  Their
    combination results in significant performance improvement over traditional
    operating system implementations.  Using hardware and software emulating a
    SUN 3/160 running SUNOS.  Synthesis achieves several times to several dozen
    times speedup for Unix kernel calls and context switch times of 21
    microseconds or faster.", 
  location     = "http://pages.cs.wisc.edu/~remzi/Classes/736/Fall2007/Papers/massalin.pdf"
}

@Article{riicsd,
  author       = "Randell, Brian and Lee, P.~A. and Treleaven, P.~C.",
  title        = "Reliability Issues in Computing System Design",
  journal      = surveys,
  year         = 1978,
  volume       = 10,
  number       = 2,
  pages        = "123--165",
  month        = jun,
  keywords     = "fault tolerance, error, failure, fault, fault avoidance,
    hardware reliability, software reliability, system structure, redundancy,
    atomic actions",
  abstract     = "This paper surveys the various problems involved in achieving
    high reliability from complex computing systems and discusses the
    relationship between system structuring techniques and fault-tolerance
    techniques.  Topics covered include: 1) protective redundancy in hardware
    and software, 2) the use of atomic actions to structure the activity of a
    system in limit information flow 3) error detection techniques, 4)
    strategies for locating and dealing with faults and for assessing the
    damage caused, and 5) forward and backward error recovery techniques, based
    on the concepts of recovery line, commitment, exception, and compensation.
    The ideas described relate to technique used to date in systems intended
    for environments in which high reliability is demanded.  Three specific
    systems of JPL-STAR, the Bell Laboratories ESS No. 1A processor, and the
    PLURIBUS are described in some detail and compared.", 
  location     = "https://doi.org/10.1145/356725.356729"
}

@Article{pcasifmsmm,
  author       = "Tucker, Andrew and Gupta, Anoop",
  title        = "Process Control and Scheduling Issues for Multiprogrammed Shared-Memory Multiprocessors",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "159--166",
  month        = dec,
  keywords     = "multiprocessor scheduling, threads, thread management,
    performance, parallel programming, multi-programming",
  abstract     = "Shared-memory multiprocessors are frequently used in a
    time-sharing style with multiple parallel applications executing at the
    same time.  In such an environment, where the machine load is continuously
    varying, the question arises of how an application should maximize its
    performance while being fair to other users of the system.  In this paper,
    we address this issue.  We first show that if the number of runnable
    processes belonging to a parallel application significantly exceeds the
    effective number of physical processors executing it, its performance can
    be significantly degraded.  We then propose a way of controlling the number
    of runnable processes associated with an application dynamically, to ensure
    good performance.  The optimal number of runnable processes for each
    application is determined by a centralized server, and applications
    dynamically suspend or resume processes in order to match that number.  A
    preliminary implementation of the proposed scheme is now running on the
    Encore Multimax and we show how it helps improve the performance of several
    applications.  In some cases the improvement is more than a factor of two.
    We also discuss implications of the proposed scheme for multiprocessor
    schedulers, and how the scheme should interface with parallel programming
    languages.", 
  location     = "https://doi.org/10.1145/74850.74866"
}

@Article{albsbbtcdpc,
  author       = "Barkley, Ronald~E. and Lee, T.~Paul",
  title        = "A Lazy Buddy System Bounded by Two Coalescing Delays per Class",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "167--176",
  month        = dec,
  keywords     = "storage management, buddy allocation, lazy coalescing",
  abstract     = "The watermark-based lazy buddy system for dynamic memory
    management uses lazy coalescing rules controlled by watermark parameters to
    achieve low operational costs.  The correctness of the watermark-based lazy
    buddy system is shown by defining a space of legal states called the lazy
    space and proving that the watermark-based lazy coalescing rules always
    keep the memory state within that space.  In this paper we describe a
    different lazy coalescing policy, called the DELAY-2 algorithm, that
    focuses directly on keeping the memory state within the lazy space.  The
    resulting implementation is simpler, and experimental data shows it to be
    up to 12% faster than the watermark-based buddy system and about 33% faster
    than the standard buddy system.  Inexpensive operations make the DELAY-2
    algorithm attractive as a memory manager for an operating system.  The
    watermark-based lazy buddy policy offers fine control over the coalescing
    policy of the buddy system.  However, applications such as the UNIX System
    kernel memory manager do not need such fine control.  For these
    applications, the DELAY-2 buddy system provides an efficient memory manager
    with low operational costs and low request blocking probability.  In the
    DELAY-2 buddy system, the worst-case time for a free operation is bounded
    by two coalescing delays per class, and when all blocks are returned to the
    system, the system memory is coalesced back to its original state.  This
    ensures that the memory space can be completely shared.", 
  location     = "https://doi.org/10.1145/74850.74867"
}

@Article{aotmp,
  author       = "Duchamp, Dan",
  title        = "Analysis of Transaction  Management Performance",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "177--190",
  month        = dec,
  keywords     = "transactions, transaction management, two phase commit,
    non-blocking commitment, performance, log batching, multi-threading",
  abstract     = "There is currently much interest in incorporating
    transactions into both operating systems and general-purpose programming
    languages.  This paper provides a detailed examination of the design and
    performance of the transaction manager of the Camelot system.  Camelot is a
    transaction facility that provides a rich model of transactions intended to
    support a wide variety of general-purpose applications.  The transaction
    manager's principal function is to execute the protocols that ensure
    atomicity.  The conclusions of this study are: a simple optimization to
    two-phase commit reduces logging activity of distributed transactions;
    non-blocking commit is practical for some applications; multithreaded
    design improves throughput provided that log batching is used;
    multi-casting reduces the variance of distributed commit protocols in a LAN
    environment; and the performance of transaction mechanisms such as Camelot
    depend heavily upon kernel performance.", 
  location     = "https://doi.org/10.1145/74850.74868"
}

@Article{tasppoanom,
  author       = "Chase, Jeffrey~S. and Amador, Franz~G. and Lazowska, Edward~D. and Levy, Henry~M. and Littlefield, Richard~J.",
  title        = "The {Amber} System:  Parallel Programming on a Network of Multiprocessors",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "147--158",
  month        = dec,
  keywords     = "distributed programming, multiprocessor networks, migration,
    threads, global address spaces",
  abstract     = "This paper describes a programming system called Amber that
    permits a single application program to use a homogeneous network of
    computers in a uniform way, making the network appear to the application as
    an integrated multiprocessor.  Amber is specifically designed for high
    performance in the case where each node in the network is a shared-memory
    multiprocessor.  Amber shows that support for loosely-coupled
    multiprocessing can be efficiently realized using an object-based
    programming model.  Amber programs execute in a uniform network-wide object
    space, with memory coherence maintained at the object level.  Careful data
    placement and consistency control are essential for reducing communication
    overhead in a loosely-coupled system.  Amber programmers use object
    migration primitives to control the location of data and processing.", 
  location     = "https://doi.org/10.1145/74851.74865"
}

@Article{lstlbcilssmm,
  author       = "Rosenburg, Bryan~S.",
  title        = "Low-Synchronization Translation Lookaside Buffer Consistency in Large-Scale Shared-Memory Multiprocessors",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "137--146",
  month        = dec,
  keywords     = "tlb consistency, tlb invalidation, multiprocessor
    architecture, interrupt handling, locking protocols, mach, performance,
    deadlock avoidance",
  abstract     = "Operating systems for most current shared-memory
    multiprocessors must maintain translation lookaside buffer (TLB)
    consistency across processors.  A processor that changes a shared page
    table must flush outdated mapping information from its own TLB, and it must
    force the other processors using the page table to do so as well.
    Published algorithms for maintaining TLB consistency on some popular
    commercial multiprocessors incur excessively high synchronization costs.
    We present an efficient TLB consistency algorithm that can be implemented
    on multiprocessors that include a small set of reasonable architectural
    features.  This algorithm has been incorporated in a version of the MACH
    operating system developed for the IBM Research Parallel Processor
    Prototype (RP3).", 
  location     = "https://doi.org/10.1145/74850.74864"
}
27;5;13~
@Article{srrws,
  author       = "Schwanke, Robert~W. and Kaiser, Gail~E.",
  title        = "Smarter Recompilation",
  journal      = toplas,
  year         = 1988,
  volume       = 10,
  number       = 4,
  pages        = "627--632",
  month        = oct,
  keywords     = "intelligent software tools, overloading, separate
    compilation, type checking, consistency, software configuration management",
  abstract     = "Tichy's Smart Recompilation method can be made smarter by
    permitting benign type inconsistencies between separately compiled modules.
    This enhanced method helps the programmer to make far-reaching changes in
    small, manageable steps.", 
  location     = "https://doi.org/10.1145/48022.214505"
}

@Article{ehliwa,
  author       = "Cameron, Robert~D.",
  title        = "Efficient High-Level Iteration with Accumulators",
  journal      = toplas,
  year         = 1989,
  volume       = 11,
  number       = 2,
  pages        = "194--211",
  month        = apr,
  keywords     = "accumulation, acculators, generators, iteration, iterators,
    loop constructs, mapping functions, modula, reduce operator, language
    extension, control structures",
  abstract     = "Accumulators are proposed as a new type of high-level
    iteration construct for imperative languages.  Accumulators are
    user-programmed mechanisms for successively combining a sequence of values
    into a single result value.  The accumulated result can either be a simple
    numeric value such as the sum of a series or a data structure such as a
    list.  Accumulators naturally complement constructs that allow iteration
    through user-programmed sequences of values such as the iterators of CLU
    and the generators of Alphard.  A practical design for high-level iteration
    is illustrated by way of an extension to Modula-2 called Modula Plus.  The
    extension incorporates both a redesigned mechanism for iterators as well as
    the accumulator design.  Several applications are illustrated including
    both numeric and data structure accumulation.  It is shown that the design
    supports efficient iteration both because it is amenable to implementation
    via in-line coding and because it allows high-level iteration concepts to
    be implemented as encapsulations of efficient low-level manipulations.", 
  location     = "https://doi.org/10.1145/63264.63401"
}

@Article{iteoufbc,
  author       = "Braunstein, Andrew and Riley, Mark and Wilkes, John",
  title        = "Improving the Efficiency of " # unix # " File Buffer Caches",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "71--82",
  month        = dec,
  keywords     = "cache management, virtual storage management, memory-mapped
    files, i-o performance, tlb",
  abstract     = "This paper reports on the effects of using hardware virtual
    memory assists in managing file buffer caches in UNIX.  A controlled
    experimental environment was constructed from two systems whose only
    difference was that one of them (XMF) used the virtual memory hardware to
    assist file buffer cache search and retrieval.  An extensive series of
    performance characterizations was used to study the effects of varying the
    buffer cache size (from 3 Megabytes to 70 MB); I\O transfer sizes (from 4
    bytes to 64 KB); cache-resident and non-cache-resident data; READs and
    WRITEs; and a range of application programs.  The results: small READ/WRITE
    transfers from the cache (&le;1 KB) were 5O% faster under XMF, while larger
    transfers (&ge;8 KB) were 20% faster.  Retrieving data from disk, the XMF
    improvement was 25% and 1O% respectively, although OPEN/CLOSE system calls
    took slightly longer in XMF.  Some individual programs ran as much as 40%
    faster on XMF, while an application benchmark suite showed a 7-15%
    improvement in overall execution time.  Perhaps surprisingly.  XMF had
    fewer translation lookaside buffer misses.", 
  location     = "https://doi.org/10.1145/74850.74858"
}

@Article{araatpv,
  author       = "Lee, Tony~T. and Lai, Ming-Yee",
  title        = "{A} Relational Algebraic Approach to Protocol Verification",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 2,
  pages        = "184--193",
  month        = feb,
  keywords     = "communications protocol analysis, finite state machine,
    protocol verification, relational algebra",
  abstract     = "Communications protocols are usually modeled by a pair of
    finite-state machines that generate the interaction between processes.
    Protocol verification is a procedure to validate the logical correctness of
    these interaction sequences and to detect potential design errors.  A
    relational approach is proposed to represent a finite-state machine as a
    transition table.  On this basis, the well-established theory of relational
    databases can be utilized to derive the global-state transitions of the
    system.  Furthermore, logical errors of a protocol such as deadlocks,
    incomplete specifications and nonexecutable interactions can be formulated
    in terms of relational algebra.  This approach has been implemented on the
    INGRES database system and applied to the verification of several
    protocols.", 
  location     = "https://doi.org/10.1109/32.4637"
}

@Article{pofr,
  author       = "Schroeder, Michael~D. and Burrows, Michael",
  title        = "Performance of Firefly {RPC}",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "83--90",
  month        = dec,
  keywords     = "rpc, multiprocessor systems, storage sharing, data
  marshalling, latency, throughput, parameter passing",
  abstract     = "In this paper, we report on the performance of the remote
    procedure call implementation for the Firefly multiprocessor and analyze
    the implementation to account precisely for all measured latency.  From the
    analysis and measurements, we estimate how much faster RPC could be if
    certain improvements were made.  The elapsed time for an inter-machine call
    to a remote procedure that accepts no arguments and produces no results is
    2.66 milliseconds.  The elapsed time for an RPC that has a single 1440-byte
    result (the maximum result that will fit in a single packet) is 6.35
    milliseconds.  Maximum inter-machine throughput of application program data
    using RPC is 4.65 megabits/second, achieved with 4 threads making parallel
    RPCs that return the maximum sized result that fits in a single RPC result
    packet.  CPU utilization at maximum throughput is about 1.2 CPU seconds per
    second on the calling machine and a little less on the server.  These
    measurements are for RPCs from user space on one machine to user space on
    another, using the installed system and a 10 megabit/second Ethernet.  The
    RPC packet exchange protocol is built on IP/UDP, and the times include
    calculating and verifying UDP checksums.  The Fireflies used in the tests
    had 5 Micro VAX II processors and a DEQNA Ethernet controller.", 
  location     = "https://doi.org/10.1145/74850.74859"
}

@Article{lrpc,
  author       = "Bershad, Brian~N. and Anderson, Thomas~E. and Lazowska, Edward~D. and Levy, Henry~M.",
  title        = "Lightweight Remote Procedure Call",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "102--113",
  month        = dec,
  keywords     = "rpc, common-case optimization, intra-machine communication,
    parameter size, parameter complexity, stub generation",
  abstract     = "Lightweight Remote Procedure Call (LRPC) is a communication
    facility designed and optimized for communication between protection
    domains on the same machine.  In contemporary small-kernel operating
    systems, existing RPC systems incur an unnecessarily high cost when used
    for the type of communication that predominates &mdash; between protection
    domains on the same machine.  This cost leads system designers to coalesce
    weakly-related subsystems into the same protection domain, trading safety
    for performance.  By reducing the overhead of same-machine communication,
    LRPC encourages both safety and performance.  LRPC combines the control
    transfer and communication model of capability systems with the programming
    semantics and large-grained protection model of RPC.  LRPC achieves a
    factor of three performance improvement over more traditional approaches
    based on independent threads exchanging messages, reducing the cost of
    same-machine communication to nearly the lower bound imposed by
    conventional hardware.  LRPC has been integrated into the Taos operating
    system of the DEC SRC Firefly multiprocessor workstation.", 
  location     = "https://doi.org/10.1145/74850.74861"
}

@Article{eilpfsde,
  author       = "Degano, Pierpaolo and Mannucci, Stefano and Mojana, Bruno",
  title        = "Efficient Incremental {LR} Parsing for Syntax-Directed Editors",
  journal      = toplas,
  year         = 1988,
  volume       = 10,
  number       = 3,
  pages        = "345--373",
  month        = jul,
  keywords     = "context free grammars, incremental lr parsing,
    syntax-directed editors, generative development, analytic development, jump
    tables",
  abstract     = "A technique for generating parsers which is an extension to
    LR techniques and is based on parsing table splitting, is presented.  Then
    this technique is slightly extended to support incremental syntax analysis.
    Given a context-free grammar and a set &ldquo;IC&rdquo; of nonterminals
    devised to be incremental, a set of subtables is generated to drive the
    analysis of program fragments derivable from nonterminals in IC.  The
    proposed technique generates parsing tables which are considerably smaller
    than the standard ones, even when incrementality is not exploited.  Thus,
    these tables may be stored as arrays permitting faster access and accurate
    error handling.  Furthermore, our tables are suitable for generating
    syntax-directed editors which provide a full analytic mode.  The efficiency
    of the analytic component of a syntax-directed editor obtained in this way
    and its easy integration with the generative component stress the
    advantages of incremental program writing.", 
  location     = "https://doi.org/10.1145/44501.214503"
}

@Article{tpcrati,
  author       = "Weiser, Mark and Demers, Alan and Hauser, Carl",
  title        = "The {Portable Common Runtime} Aproach to Interoperability",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "114--122",
  month        = dec,
  keywords     = "Operating system abstractions do not always reach high enough
    for direct use by a language or applications designer.  The gap is filled
    by language-specific runtime environments, which become more complex for
    richer languages (CommonLisp needs more than C+ +, which needs more than
    C).  But language-specific environments inhibit integrated multi-lingual
    programming, and also make porting hard (for instance, because of operating
    system dependencies).  To help solve these problems, we have built the
    Portable Common Runtime (PCR), a language-independent and
    operating-system-independent base for modern languages.  PCR offers four
    interrelated facilities: storage management (including universal garbage
    collection), symbol binding (including static and dynamic linking and
    loading), threads (lightweight processes), and low-level I/O (including
    network sockets).  PCR is &ldquo;common&rdquo; because these facilities
    simultaneously support programs in several languages.  PCR supports C.
    Cedar, Scheme, and CommonLisp intercalling and runs pre-existing C and
    CommonLisp (Kyoto) binaries.  PCR is &ldquo;portable&rdquo; because it uses
    only a small set of operating system features.  The PCR source code is
    available for use by other researchers and developers.", 
  location     = "https://doi.org/10.1145/74850.74862"
}

@Article{gvmmfosk,
  author       = "Abrossimov, Vadim and Rozier, Marc and Shapiro, Marc",
  title        = "Generic Virtual Memory Management for Operating System Kernels",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "123--136",
  month        = dec,
  keywords     = "virtual storage management, demand paging, page fault
  handling, library interface development, portability",
  abstract     = "We discuss the rationale and design of a Generic Memory
    management Interface, for a family of scalable operating systems.  It
    consists of a general interface for managing virtual memory, independently
    of the underlying hardware architecture (e.g.  paged versus segmented
    memory), and independently of the operating system kernel in which it is to
    be integrated.  In particular, this interface provides abstractions for
    support of a single, consistent cache for both mapped objects and explicit
    I/O, and control of data caching in real memory.  Data management policies
    are delegated to external managers.  A portable implementation of the
    Generic Memory management Interface for paged architectures, the Paged
    Virtual Memory manager, is detailed.  The PVM uses the novel history object
    technique for efficient deferred copying.  The GMI is used by the Chorus
    Nucleus, in particular to support a distributed version of Unix.
    Performance measurements compare favorably with other systems.", 
  location     = "https://doi.org/10.1145/74850.74863"
}

@Article{sbetfnmm,
  author       = "Bolosky, William~F. and Fitzgerald, Robert~P. and Scott, Michael~L.",
  title        = "Simple but Effective Techniques for {NUMA} Memory Management",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "19--31",
  month        = dec,
  keywords     = "mach, ibm ace, numa multiprocessors, automatic page
    placement, parallel programming",
  abstract     = "Multiprocessors with non-uniform memory access times
    introduce the problem of placing data near the processes that use them, in
    order to improve performance.  We have implemented an automatic page
    placement strategy in the Mach operating system on the IBM ACE
    multiprocessor workstation.  Our experience indicates that even very simple
    automatic strategies can produce nearly optimal page placement.  It also
    suggests that the greatest leverage for further performance improvement
    lies in reducing false sharing, which occurs when the same page contains
    objects that would best be placed in different memories.", 
  location     = "https://doi.org/10.1145/74850.74854",
  location     = "https://www.cs.rochester.edu/u/scott/papers/1989_SOSP_8CE_NUMA.pdf"
}

@Article{ermwitffs,
  author       = "Edwards, David~A. and McKendry, Martin~S.",
  title        = "Exploiting Read-Mostly Workloads in The {FileNet} File System",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "58--70",
  month        = dec,
  keywords     = "network file systems, distributed applications, cache
    invalidation protocols",
  abstract     = "Most recent studies of file system workloads have focussed on
    loads imposed by general computing.  This paper introduces a significantly
    different workload imposed by a distributed application system.  The
    FileNet system is a distributed application system that supports document
    image processing.  The FileNet file system was designed to support the
    workload imposed by this application.  To characterize the read-mostly
    workload applied to the file system and how it differs from general
    computing environments, we present statistics gathered from live production
    installations.  We contrast these statistics with previously published data
    for more general computing.  We describe the key algorithms of the file
    system, focusing on the caching approach.  A bimodal client caching
    approach is employed, to match the file modification patterns observed.
    Different cache consistency algorithms are used depending on usage patterns
    observed for each file.  Under most conditions, files cached at
    workstations can be accessed without contacting servers.  When a file is
    subject to frequent modification that causes excessive cache consistency
    traffic, caching is disabled for that file, and servers participate in all
    open and close activities.  The data from production sites is examined to
    evaluate the success of the approach under its applied load.  Contrasts
    with alternative approaches are made based on this data.", 
  location     = "https://doi.org/10.1145/74850.74857"
}

@Article{tioacmaoanmewp,
  author       = "Cox, Alan~L. and Fowler, Robert~J.",
  title        = "The Implementation of a Coherent Memory Abstraction on a {NUMA} Multiprocessor:  Experiences with {PLATINUM}",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "32--44",
  month        = dec,
  keywords     = "storage management, shared-storage coherency, shootdowns,
    data coherency protocol, replication, management policy",
  abstract     = "PLATINUM is an operating system kernel with a novel memory
    management system for Non-Uniform Memory Access (NUMA) multiprocessor
    architectures.  This memory management system implements a coherent memory
    abstraction.  Coherent memory is uniformly accessible from all processors
    in the system.  When used by applications coded with appropriate
    programming styles it appears to be nearly as fast as local physical memory
    and it reduces memory contention.  Coherent memory makes programming NUMA
    multiprocessors easier for the user while attaining a level of performance
    comparable with hand-tuned programs.  This paper describes the design and
    implementation of the PLATINUM memory management system, emphasizing the
    coherent memory.  We measure the cost of basic operations implementing the
    coherent memory.  We also measure the performance of a set of application
    programs running on PLATINUM.  Finally, we comment on the interaction
    between architecture and the coherent memory system.  PLATINUM currently
    runs on the BBN Butterfly Plus Multiprocessor.", 
  location     = "https://doi.org/10.1145/74850.74855"
}

@Article{snewccp,
  author       = "Srinivasan, V. and Mogul, Jeffrey~C.",
  title        = "Spritely {NFS}:  Experiments with Cache-Consistency Protocols",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "45--57",
  month        = dec,
  keywords     = "cache consistency protocol, sprite, nfs, performance,
    call-backs", 
  abstract     = "File caching is essential to good performance in a
    distributed system, especially as processor speeds and memory sizes
    continue to improve rapidly while disk latencies do not.  Stateless-server
    systems, such as NFS, cannot properly manage client file caches.  Stateful
    systems, such as Sprite, can use explicit cache consistency protocols to
    improve both cache consistency and overall performance.  By modifying NFS
    to use the Sprite cache consistency protocols, we isolate the effects of
    the consistency mechanism from the other features of Sprite.  We find
    dramatic improvements on some, although not all, benchmarks, suggesting
    that an explicit cache consistency protocol is necessary for both
    correctness and good performance.",
  location     = "https://doi.org/10.1145/74850.74856"
}

@Article{aloa1989,
  author       = "Burrows, Michael and Abadi, Mart{\' \i}n and Needham, Roger",
  title        = "{A} Logic of Authentication",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "1--12",
  month        = dec,
  keywords     = "logical postulates, kerberos, andrew secure rpc,
    needham-schroeder public-key protocol, ccitt x.509, formal reasoning
    systems", 
  abstract     = "Authentication protocols are the basis of security in many
    distributed systems, and it is therefore essential to ensure that these
    protocols function correctly.  Unfortunately, their design has been
    extremely error prone.  Most of the protocols found in the literature
    contain redundancies or security flaws.  A simple logic has allowed us to
    describe the beliefs of trustworthy parties involved in authentication
    protocols and the evolution of these beliefs as a consequence of
    communication.  We have been able to explain a variety of authentication
    protocols formally, to discover subtleties and errors in them, and to
    suggest improvements.  In this paper, we present the logic and then give
    the results of our analysis of four published protocols, chosen either
    because of their practical importance or because they serve to illustrate
    our method.", 
  location     = "https://doi.org/10.1145/74850.74852", 
  location     = "https://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-39.pdf"
}

@Article{aasda,
  author       = "Karimi, Jahangir and Konsynski, Benn~R.",
  title        = "An Automated Software Design Assistant",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 2,
  pages        = "194--210",
  month        = feb,
  keywords     = "system design, system structure, coupling, cohesion, software
    metrics, modularization", 
  abstract     = "An automated software design assistant was implemented as a
    part of a long-term project with the objectives of applying the
    computer-aided technique to the tools in a software engineering
    environment.  A set of quantitative measures are derived based on the
    degree to which a particular design satisfied the attributes associated
    with a structured software design.  The measure are then used as decision
    rules for a computer-aided methodology for structured design.  The
    feasibility of the approach is also demonstrated by a case study using a
    small application system design problem.", 
  location     = "https://doi.org/10.1109/32.4638"
}

@Article{rrfpck,
  author       = "Lomas, T.~Mark~A. and Gong, Li and Saltzer, Jerome~H and Needhamn, Roger~M.",
  title        = "Reducing Risks from Poorly Chosen Keys",
  journal      = sosp89,
  year         = 1989,
  volume       = 23,
  number       = 5,
  pages        = "14--18",
  month        = dec,
  keywords     = "attack surface, known plaintexts, verifiable plaintext,
    security protocols",
  abstract     = "It is well-known that, left to themselves, people will choose
    passwords that can be rather readily guessed.  If this is done, they are
    usually vulnerable to an attack based on copying the content of messages
    forming part of an authentication protocol and experimenting, e.g.  with a
    dictionary, offline.  The most usual counter to this threat is to require
    people to use passwords which are obscure, or even to insist on the system
    choosing their passwords for them.  In this paper we show alternatively how
    to construct an authentication protocol in which offline experimentation is
    impracticable; any attack based on experiment must involve the real
    authentication server and is thus open to detection by the server noticing
    multiple attempts.", 
  location     = "https://doi.org/10.1145/74850.74853"
}

@Article{osstssars,
  author       = "Linden, Theodore~A.",
  title        = "Operating System Structures to Support Security and Reliable Software",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 4,
  pages        = "409--445",
  month        = dec,
  keywords     = "Capability, capability-based addressing, computer security,
    extended-type objects, operating system structures, protection, reliable
    software, reliability, security, small protection domains, types.", 
  abstract     = "Security has become an important and challenging goal in the
    design of computer systems.  This survey focuses on two system structuring
    concepts that support security; namely, small protection domains and
    extended-type objects.  These two concepts are especially promising because
    they also support reliable software by encouraging and enforcing highly
    modular software structures--in both systems software and in applications
    programs.  Small protection domains allow each subunit or module of a
    program to be executed in a restricted environment that can prevent
    unanticipated or undesirable actions by that module.  Extended-type objects
    provide a vehicle for data abstraction by allowing objects of new types to
    be manipulated in terms of operations that are natural for these objects.
    This provides a way to extend system protection features so that protection
    can be enforced in terms of applications-oriented operations on objects.
    This survey also explains one approach toward implementing these concepts
    thoroughly and efficiently--an approach based on the concept of
    capabilities incorporated into the addressing structure of the computer.
    Capability-based addressing is seen as a practical way to support future
    requirements for security and reliable software without sacrificing
    requirements for performance, flexibility, and sharing.", 
  location     = "https://csrc.nist.gov/csrc/media/publications/conference-paper/1998/10/08/proceedings-of-the-21st-nissc-1998/documents/early-cs-papers/lind76.pdf",
  location     = "https://doi.org/10.1145/356678.356682"
}

@Article{tlpaipoda,
  author       = "Kriszti{\' a}n Flautner and Rich Uhlig and Steve Reinhardt and Trevor Mudge",
  title        = "Thread-Level Parallelism and Interactive Performance of Desktop Applications",
  journal      = osr # " (" # pot # "Third International Conference on " # asplos # ", ASPLOS '20)",
  year         = 2000,
  volume       = 34,
  number       = 5,
  pages        = "129--138",
  month        = nov,
  keywords     = "desktop applications, multi-core architecture, thread
    parallelism, user interfaces, program structure",
  abstract     = "Multiprocessing is already prevalent in servers where
    multiple clients present an obvious source of thread-level parallelism.
    However, the case for multiprocessing is less clear for desktop
    applications.  Nevertheless, architects are designing processors that count
    on the availability of thread-level parallelism.  Unlike server workloads,
    the primary requirement of interactive applications is to respond to user
    events under human perception bounds rather than to maximize end-to-end
    throughput.  In this paper we report on the thread-level parallelism and
    interactive response time of a variety of desktop applications.  By
    tracking the communication between tasks, we can focus our measurements on
    the portions of the benchmark’s execution that have the greatest impact on
    the user.  We find that running our benchmarks on a dual-processor machine
    improves response time of mouse-click events by as much as 36%, and 22% on
    average—out of a maximum possible 50%.  The benefits of multiprocessing are
    even more apparent when background tasks are considered.  In our
    experiments, running a simple MP3 playback program in the background
    increases response time by 14% on a uniprocessor while it only increases
    the response time on a dual processor by 4%.  When response times are fast
    enough for further improvements to be imperceptible, the increased idle
    time after interactive episodes could be exploited to build systems that
    are more power efficient.", 
  location     = "https://doi.org/10.1145/384264.379233", 
  location     = "http://web.eecs.umich.edu/~manowar/publications/tlp-interactive-apps-ASPLOS2000.pdf"
}

@Article{asacsmfadt,
  author       = "Jacques Loeckx",
  title        = "Algorithmic Specifications:  {A} Constructive Specification Method for Abstract Data Types",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 4,
  pages        = "646--685",
  month        = oct,
  keywords     = "algebraic specifications, constructive specification,
    specification languages, semantics, syntax, extensional semantics,
    intentional semantics, proof methods",
  abstract     = "This paper presents a new specification method for abstract
    data types and a pertaining logic.  The specification method proposed
    differs from the classical algebraic one by its constructive, yet abstract
    nature.  Although it leads to a different style in specification, the
    method avoids some fundamental problems inherent in the algebraic
    specification method.  The logic proposed is essentially a first-order
    logic for strict (partial) functions.  It allows in particular the
    expression of the semantic conditions guaranteeing the consistency of a
    specification.", 
  location     = "https://doi.org/10.1145/29873.30399"
}

@Article{tz1cp,
  author       = "James~E. Smith and G.~E. Dermer and B.~D. Vanderwarn and S.~D. Klinger and C.~M. Rozewski and D.~L. Fowler and K.~R. Scidmore and J.~P. Laudon",
  title        = "The {ZS}-1 Central Processor",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "199--204",
  month        = oct,
  keywords     = "scientific processor, pipelining, virtual storage",
  abstract     = "The Astronautics ZS-1 is a high speed, 64-bit computer system
    designed for scientific and engineering applications.  The ZS-1 central
    processor uses a decoupled architecture, which splits instructions into two
    streams---one for fixed point/memory address computation and the other for
    floating point operations.  The two instruction streams are then processed
    in parallel.  Pipelining is also used extensively throughout the ZS-1.This
    paper describes the architecture and implementation of the ZS-1 central
    processor, beginning with some of the basic design objectives.
    Descriptions of the instruction set, pipeline structure, and virtual memory
    implementation demonstrate the methods used to satisfy the objectives.
    High performance is achieved through a combination of static (compile-time)
    instruction scheduling and dynamic (run-time) scheduling.  Both types of
    scheduling are illustrated with examples.", 
  location     = "https://doi.org/10.1145/36177.36203"
}

@Article{pcfga,
  author       = "Adam Levinthal and Pat Hanrahan and Mike Paquette and Jim Lawson",
  title        = "Parallel Computers for Graphics Applications",
  journal      = asplos87,
  year         = 1987,
  volume       = 22,
  number       = 10,
  pages        = "193--198",
  month        = oct,
  keywords     = "parallel processing, simd processors, high-level parallel
    languages, graphic processors",
  abstract     = "Specialized computer architectures can provide better
    price/performance for executing image processing and graphics applications
    than general purpose designs.  Two processors are presented that use
    parallel SIMD data paths to support common graphics data structures as
    primitive operands in arithmetic expressions.  A variant of the C language
    has been implemented to allow high level language coding of user
    applications on these processors.  High level programming support is
    designed into the processor architecture that implements parallel object
    data typing and parallel conditional evaluation in hardware.", 
  location     = "https://doi.org/10.1145/36177.36202"
}

@Book{cpec,
  author       = "Paul~E. Ceruzzi",
  title        = "Computing",
  subtitle     = "A Concise History",
  publisher    = mitp,
  year         = 2012,
  address      = cma,
  keywords     = "analog machines, digital machines, stored program machines, history,
    microprocessors, the internet, the world wide web",
  location     = "QA 76.C467"
}

@Book{twswb,
  author       = "Sara Wachter-Boettcher",
  title        = "Technically Wrong",
  publisher    = "W.~W. Norton",
  year         = 2017,
  address      = nyny,
  keywords     = "culture, user experience, tracking, algorithms, meritocracy",
  location     = "TA 169.5.W33"
}

@Book{cswsm,
  author       = "Sayaka Murata",
  title        = "Convenience Store Woman",
  publisher    = "Grove Press",
  year         = 2018,
  address      = nyny,
  keywords     = "alienation, conformance, norms, commerce, work, personality",
  location     = "PL 873.U73 C6613"
}

@Book{inff,
  author       = "Florian Freistetter",
  title        = "Isaac Newton",
  subtitle     = "The Asshole Who Reinvented the Universe",
  publisher    = "Prometheus Books",
  year         = 2018,
  address      = "Amherst, " # NY,
  keywords     = "isaac newton, royal society, calculus, optics, astronomy,
    libnetz, hooke, personality, scientific practice",
  location     = "QC 16.N7 F7413 2018"
}

@Book{tlm2014,
  author       = "Lauren Myracle",
  title        = "ttyl",
  publisher    = "Amulet Books",
  year         = 2014,
  address      = nyny,
  keywords     = "high school, sophomores, texting",
  location     = "PZ 7.M9955 Tt"
}

@Book{emjaj,
  author       = "Jennifer~A. Jordan",
  title        = "Edible Memory",
  subtitle     = "The Lure of Heirloom Tomatoes \& Other Forgotten Foods",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "heirloom varieties, vegetables, fruits",
  location     = "SB 453.5.J67"
}

@Book{digmp,
  author       = "Mark Pilgrim",
  title        = "Dive into Greasemonkey",
  publisher    = "Lulu",
  year         = 2005,
  keywords     = "web development, web browsers, javascript",
  location     = "http://www.lulu.com/shop/mark-pilgrim/dive-into-greasemonkey/paperback/product-228158.html"
}

@Book{wtay,
  author       = "Preti Taneja",
  title        = "We That Are Young",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "business, family, murder, india",
  location     = "PR 6120.A465 W47"
}

@Book{wsnifa,
  author       = "Ian~F. Akyildiz and Mehmet Can Vuran",
  title        = "Wireless Sensor Networks",
  publisher    = "Wiley",
  year         = 2010,
  address      = "West Sussex, U.K.",
  keywords     = "applications, design, physical layer, mac layer, error
    control, network layer, transport layer, application layer, cross-layer
    solutions, time synchronization, localization, topology management, actor
    networks, wireless multimedia sensor networks, wireless underwater sensor
    networks, wireless underground sensor networks, grand challenges",
  location     = "TK 7872.D48 A38"
}

@Book{ccnbr,
  author       = "Nayan~B. Ruparelia",
  title        = "Cloud Computing",
  publisher    = mitp,
  year         = 2016,
  address      = cma,
  keywords     = "cloud computing, value models, use cases, cloud transitions,
    iaas, paas, saas, inaas, bpaas",
  location     = "QA 76.585 R87"
}

@Book{cn5jfk,
  author       = "James.~F. Kurose and Keith~W. Ross",
  title        = "Computer Networking",
  subtitle     = "A Top-Down Approach",
  publisher    = aw,
  year         = 2010,
  address      = nyny,
  edition      = "fifth",
  keywords     = "computer networks, internet, osi network stack. wireless
    networks, mobile networks, multimedia networking, security, network
    management", 
  location     = "TK 5105.875 I57 K88"
}

@Book{isewtyt,
  author       = "David Cay Johnston",
  title        = "It's Even Worse Than You Think",
  subtitle     = "What the Trump Administration Is Doing to America",
  publisher    = "Simon \& Schuster",
  year         = 2018,
  address      = nyny,
  keywords     = "donald trump, corruption, deceit, failure",
  location     = "E 912.J64 2018"
}

@Book{dspsuj,
  author       = "Mark Allen Weiss",
  title        = "Data Structures \& Problem Solving Using Java",
  publisher    = "Addison-Wesley",
  year         = 2010,
  address      = nyny,
  keywords     = "java",
  location     = "QA 76.73.J38 W45"
}

@Book{tpmlw,
  author       = "Liz Williams",
  title        = "The Poision Master",
  publisher    = "Bantam",
  year         = 2003,
  address      = nyny,
  keywords     = "assassination",
  location     = "https://lccn.loc.gov/2003577136"
}

@Book{ohtwbi,
  author       = "Anthony Powell",
  title        = "{O}, How the Wheel Becomes It!",
  publisher    = ucp,
  year         = 1983,
  address      = chil,
  keywords     = "the past, lit'rary life, publishing, media",
  location     = "PR 6031.O74 O2"
}

@Book{gsbhw,
  author       = "Ben~H. Winters",
  title        = "Golden State",
  publisher    = "Mulholland Books",
  year         = 2019,
  address      = nyny,
  keywords     = "the truth, surveillance, who dunnit?",
  location     = "https://lccn.loc.gov/2018941036"
}

@Book{hotf,
  author       = "H.~W. Brands",
  title        = "Heirs of the Founders",
  publisher    = "Doubleday",
  year         = 2018,
  address      = nyny,
  keywords     = "john calhoun, henry clay, daniel webster, abolition,
    slavery, the constitution, nullification, the union, american government,
    congress, american politics",
  location     = "E 388.B73"
}

@Book{gtceo,
  author       = "Elinor Ostrom",
  title        = "Governing the Commons",
  subtitle     = "The Evolution of Institutions for Collective Action",
  publisher    = cup,
  year         = 1990,
  address      = cen,
  keywords     = "the commons, self-organization, self-governance,
    institutional change, institutional failures, ",
  location     = "HD 1286 O97"
}

@Book{cnw,
  author       = "Nico Walker",
  title        = "Cherry",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "drug abuse, iraq, bank robbery",
  location     = "PS 3623.A359552 C54"
}

@Book{cijjrl,
  author       = "Joe~R. Lansdale",
  title        = "Cold in July",
  publisher    = "Bantam Books",
  year         = 1989,
  address      = nyny,
  keywords     = "murrdaar, witness protection",
  location     = "https://lccn.loc.gov/00520681"
}

@Book{tmdbdak,
  author       = "David~A. Kaplan",
  title        = "The Most Dangerous Branch",
  subtitle     = "Inside the Supreme Court's Assault on the Constitution",
  publisher    = "Crown",
  year         = 2018,
  address      = nyny,
  keywords     = "u.s. supreme court, judicial restraint, judicial philosophy,
    u.s. government, separation of powers",
  location     = "KF 8779.K37"
}

@Book{pubs,
  author       = "Bruce Sterling",
  title        = "Pirate Utopia",
  publisher    = "Tachyon Publishing",
  year         = 2016,
  address      = sfca,
  keywords     = "wwi, yugoslavia, engineers, pirates, fascism",
  location     = "PS 3569.T3876 P57"
}

@Book{otcrhm,
  author       = "Martin, Roger H.",
  title        = "Off to College",
  subtitle     = "A Guide for Parents",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "first-year students, student orientation, athletics,
    substance abuse, special needs students",
  location     = "LB 2343.32.M37"
}

@Book{kchm,
  author       = "Haruki Murakami",
  title        = "Killing Commendatore",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "artists, the mysterious",
  location     = "PL 856.U673 K5713"
}

@Book{lott,
  author       = "Catherine Merridale",
  title        = "Lenin on the Train",
  publisher    = "Metropolitan Books",
  year         = 2017,
  address      = nyny,
  keywords     = "russia, revolution, wwi, lenin, socialism, espionage,
    sabotage",
  location     = "DK 254.L443 M37"
}

@Book{aatps,
  author       = "Ernest~G. Manes and Michael~A. Arbib",
  title        = "Algebraic Approaches to Program Semantics",
  publisher    = sv,
  year         = 1986,
  series       = "Texts and Monographs in Computer Science",
  address      = nyny,
  keywords     = "program semantics, denotational semantics, category theory,
    assertion semantics, specification, recursion, order semantics, fixed
    points, metric spaces, functors, data types, parametric specifications
    equational specification",
  location     = "QA 76.7.M34"
}

@Book{nodnf,
  author       = "Nuruddin Farah",
  title        = "North of Dawn",
  publisher    = "Riverhead Books",
  year         = 2018,
  address      = nyny,
  keywords     = "immigration, terrorism, islam, samalia, family relations",
  location     = "PR 9396.9.F3 N6"
}

@Book{hsnws,
  author       = "William Stallings",
  title        = "High-Speed Networks",
  subtitle     = "TCP/IP and ATM Design Principles",
  publisher    = ph,
  year         = 1998,
  address      = srnj,
  keywords     = "tcp/ip, acm, network protocols, data networks, high-speed
    lans, performance modeling, queuing analysis, self-similar traffic,
    link-level flow and error control, transport-level traffic control,
    internetwork traffic management, internet routing, routing protocols,
    multimedia routing, information theory, compression",
  location     = "TK 5105.585.S73"
}

@Book{ohip,
  author       = "Karyn~L. Freedman",
  title        = "One Hour in Paris",
  subtitle     = "A True Story of Rape and Recovery",
  publisher    = ucp,
  year         = 2014,
  address      = chil,
  keywords     = "rape, recovery",
  location     = "B 995.F744 A3"
}

@Book{lxjw,
  author       = "Josephine Wilkinson",
  title        = "Louis {XIV}",
  subtitle     = "The Power and the Glory",
  publisher    = "Pegasus Books",
  year         = 2019,
  address      = nyny,
  month        = mar,
  keywords     = "louie da fourteenth, france history, 17th century history,
    absolute monarchy",
  location     = "https://lccn.loc.gov/2018439183"
}

@Book{fftj,
  author       = "Margery Allingham",
  title        = "Flowers for the Judge",
  publisher    = "Bantam",
  year         = 1984,
  address      = nyny,
  month        = mar,
  keywords     = "murrdaar, publishing",
  location     = "PR 6001.L678"
}

@Book{psevh,
  author       = "Eric van Herwijnen",
  title        = "Practical {SGML}",
  publisher    = "Kluwer Academic",
  year         = 1990,
  address      = "Dordrecht, The Netherlands",
  keywords     = "sgml, document structure, iso standard",
  location     = "QA 76.73.S44 V36"
}

@Book{twetf,
  author       = "Tana French",
  title        = "The Witch Elm",
  publisher    = "Viking",
  year         = 2018,
  address      = nyny,
  keywords     = "murrdaar, memory, self-hood",
  location     = "PR 6106.R457 W58"
}

@Book{ddmjb,
  author       = "Michael~J. Behe",
  title        = "Darwin Devolves",
  subtitle     = "The New Science About DNA That Challenges Evolution",
  publisher    = "HarperOne",
  year         = 2019,
  address      = nyny,
  keywords     = "irreducible complexity, evolution, mutation, natural descent",
  location     = "QH 3673.B427"
}

@Book{mwftu,
  author       = "Margery Allingham",
  title        = "More Work for the Undertaker",
  publisher    = "Avon",
  year         = "1989",
  price        = "$3.50",
  address      = nyny,
  keywords     = "murrdaar, cross purposes",
  location     = "PR 6001.L678 M57"
}

@Book{starg2e,
  author       = "David~R. Musser and Gillmer~J. Derge and Atul Saini",
  title        = "STL Tutorial and Reference Guide",
  edition      = "second",		  
  publisher    = aw,
  year         = 2001,
  series       = "Professional Computing",
  address      = rma,
  keywords     = "standard template library, generic programming, c++, data structures",
  location     = "QA 76.73.C153 M87"
  }
		      		  
@Book{libwb,
  author       = "William Boyd",
  title        = "Love is Blind",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "lurv, revenge, plagiarism, pianos, pianists",
  location     = "PR 6052.O9192 L68"
}

@Book{ltaym,
  author       = "Ian Stewart",
  title        = "Letters to a Young Mathematician",
  publisher    = "Basic Books",
  year         = 2006,
  address      = nyny,
  keywords     = "mathematics, careers, mentorship",
  location     = "QA 99.S84"
}

@Book{tpde,
  author       = "David Eggers",
  title        = "The Parade",
  publisher    = "Knopf",
  year         = 2019,
  address      = nyny,
  keywords     = "the turn of the screw, progress, duty, corporatism, the tiger
    and its spots",
  location     = "PS 3605.G34 P37"
}

@Book{wyskapebdt,
  author       = "Jessamyn Conrad",
  title        = "What You Should Know About Politics\ldots\ But Don't",
  subtitle     = "A Nonpartisan Guide to the Issues that Matter",
  publisher    = "Arcade Publishing",
  year         = 2016,
  address      = nyny,
  edition      = "third",
  keywords     = "us politics, elections, us economy, foreign policy, the
    military, health care, energy, the environment, civil liberties, culture
    wars, homeland security, education, trade",
  location     = "JK 275.C66"
}

@Book{ssl2019,
  author       = "Steve Luxenberg",
  title        = "Separate",
  subtitle     = "The Story of Plessy v. Ferguson, and America's Journey from Slavery to Segregation",
  publisher    = "W.~W. Norton",
  year         = 2019,
  address      = nyny,
  keywords     = "segregation, racism, civil rights, jim crow, supreme court,
    justice, john harlan, albion tourgee, henry brown, homer plessy, 19th
    century u.s. history",
  location     = "KF 223.P56 L88"
}

@Book{psta,
  author       = "Samuel Steward and Jeremy Mulderig and Justin Spring",
  title        = "Philip Sparrow Tells All",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "essays",
  location     = "PS 3537.T479 A6 2015"
}

@Book{tmgjh,
  author       = "Jessica Handler",
  title        = "The Magnetic Girl",
  publisher    = "Hub City Press",
  year         = 2019,
  address      = "Spartanburg, South Carolina",
  keywords     = "show bidness, fraud, fambly",
  location     = "PS 3608.A69985 M34"
}

@Book{tfocpc,
  author       = "Paul Collier",
  title        = "The Future of Capitalism",
  subtitle     = "Facing the New Anxieties",
  publisher    = "Harpers",
  year         = 2018,
  address      = nyny,
  keywords     = "communitarianism, ",
  location     = "976-0-06-274865-2"
}

@Book{sspm,
  author       = "Peter Mendelsund",
  title        = "Same Same",
  publisher    = "Vintage",
  year         = 2019,
  address      = nyny,
  keywords     = "institutions, think tanks",
  location     = "PS 3613.E48223 S26"
}

@Book{wirwl,
  author       = "Wendy Lesser",
  title        = "Why {I} Read",
  subtitle     = "The Serious Pleasure of Books",
  publisher    = fsg,
  year         = 2014,
  address      = nyny,
  keywords     = "character, plot, novelty, authority, grandeur, intimacy,
    books, reading",
  location     = "Z 1003.L543"
}

@Book{ccksr,
  author       = "Keith Schengili-Roberts",
  title        = "Core {CSS}",
  publisher    = "Prentice Hall",
  year         = 2000,
  address      = usrnj,
  keywords     = "css, www, fonts, colors, boxes, text",
  location     = "TK 5105.888.S32"
}

@Book{hthae,
  author       = "Daniel Immerwahr",
  title        = "How to Hide an Empire",
  subtitle     = "A History of the Greater United States",
  publisher    = fsg,
  year         = 2019,
  address      = nyny,
  keywords     = "colonization, empire, foreign policy, politics, economics,
    united states, history",
  location     = "F 965.I46"
}

@Book{olitcb,
  author       = "T.~C. Boyle",
  title        = "Outside Looking In",
  publisher    = "Ecco",
  year         = 2019,
  address      = nyny,
  keywords     = "psychedelics, the 60s, tim leary, drugs, human relations",
  location     = ""
}

@Book{tcotlp,
  author       = "Margery Allingham",
  title        = "The Case of the Late Pig",
  publisher    = "Avon Books",
  year         = 1989,
  address      = nyny,
  month        = jul,
  price        = "$3.50",
  keywords     = "dopplegangers, murrdaar",
  location     = "PR 6001.L678"
}

@Book{ceba,
  author       = "Ben Albahari and Peter Drayton and Brad Merrill",
  title        = "C\# Essentials",
  publisher    = "O'Reilly",
  year         = 2001,
  address      = seca,
  month        = feb,
  keywords     = "c#, programming languages, object-oriented languages, .net",
  location     = "QA 76.73.C154 A418"
}

@Book{seflb,
  title        = "Software Engineering",
  subtitle     = "An Advanced Course",
  publisher    = sv,
  year         = 1977,
  editor       = "Friedrich~L. Bauer",
  volume       = 30,
  series       = lncs,
  address      = bege,
  keywords     = "software systems, hierarchies, language characteristics,
    low-level languages, language definition, concurrency, modularity,
    portability, debugging, testing, reliability, project management,
    documentation, performance prediction, performance measurement, pricing,
    evaluation",
  location     = "QA 76.6.A33"
}

@Book{tpjmp,
  author       = "John McPhee",
  title        = "The Patch",
  publisher    = fsg,
  year         = 2018,
  address      = nyy,
  keywords     = "golf, tennis, fishing, princeton, sport",
  location     = "AC 8.M267"
}

@Book{idtm,
  author       = "Tim Maughan",
  title        = "Infinite Detail",
  publisher    = fsg,
  year         = 2019,
  address      = nyny,
  keywords     = "dystopias, networking, idealism",
  location     = "PR 6113.A924 I54"
}

@Book{owhsb,
  author       = "Stephen Budiansky",
  title        = "Oliver Wendell Holmes",
  subtitle     = "A Life in War, Law, and Ideas",
  publisher    = "W.~W. Norton",
  year         = 2019,
  address      = nyny,
  keywords     = "oliver wendell holmes, supreme court, philosophy of law, free
    speech",
  location     = "KF 8745.H6 B83"
}

@Book{tccab,
  author       = "Alfred Bester",
  title        = "The Computer Connection",
  publisher    = "Berkely",
  year         = 1975,
  address      = nyny,
  keywords     = "immortals, the surveillance state",
  location     = "PS 3552.E796"
}

@Book{tottfaf,
  author       = "Fernando~A. Flores",
  title        = "Tears of the Trufflepig",
  publisher    = fsg,
  year         = 2019,
  address      = nyny,
  keywords     = "the future, mexican-american relations, crime syndicates",
  location     = "PS 3606.L5886 T43"
}

@Book{ydimd,
  author       = "Deborah Eisenberg",
  title        = "Your Duck is My Duck",
  publisher    = "Ecco",
  year         = 2018,
  address      = nyny,
  keywords     = "philanthropy, memoirs, family, mental health",
  location     = "PS 3555.I793 A6"
}

@Book{tovcs,
  author       = "Cliff Sims",
  title        = "Team of Vipers",
  subtitle     = "My 500 Extraordinary Days in the Trump White House",
  publisher    = "St. Martin's Press",
  year         = 2019,
  address      = nyny,
  keywords     = "u.s. politics, presidential politics, donald trump, white
    house politics",
  location     = "https://lccn.loc.gov/2018439173"
}

@Book{twam,
  author       = "Sarah Caudwell",
  title        = "Thus Was Adonis Murdered",
  publisher    = "Dell",
  year         = 1981,
  price        = "$7.99",
  address      = nyny,
  keywords     = "art loving, murrdaar, venice",
  location     = "PR 6053.A855 T5"
}

@Book{mmitmr,
  author       = "Vukcevich, Ray",
  title        = "Meet Me in the Moon Room",
  publisher    = "Small Beer Press",
  year         = 2001,
  address      = "Brooklyn, N.Y.",
  keywords     = "stories",
  location     = "PS 3572.U85 M44"
}

@Book{bwtr,
  author       = "Pitchaya Sudbanthad",
  title        = "Bangkok Wakes to Rain",
  publisher    = "Riverhead Books",
  year         = 2019,
  address      = nyny,
  keywords     = "past, present, future, ecological disaster",
  location     = "PS 3619.U346 B36"
}

@Book{tstwii,
  author       = "Charles~L. {Ponce de Leon}",
  title        = "That's the Way It Is",
  subtitle     = "A History of Television News in America",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "television, journalism, tv news, cable tv, commerce",
  location     = "HE 8700.8.P66"
}

@Book{tcbs,
  author       = "Barry Strauss",
  title        = "Ten Ceasars",
  subtitle     = "Roman Emperors from Augustus to Constantine",
  publisher    = "Simon \& Schuster",
  year         = 2019,
  address      = nyny,
  keywords     = "roman emperors, augustus, tiberius, nero, vesparian, trajan,
    hadrian, marcus aurelius, septimius severus, diocletian, constantine",
  location     = "DG 274.S77"
}

@Book{sdw2015,
  author       = "David Walton",
  title        = "Superposition",
  publisher    = "Pyr",
  year         = 2015,
  address      = "Jersey City, New Jersey",
  keywords     = "quantum trickery, calling demons from the vasty deep",
  location     = "PS 3623.A454 S87"
}

@Book{ctcm,
  author       = "Zdzislaw Alexander Melzak",
  title        = "Companion to Concrete Mathematics",
  subtitle     = "Mathematical Techniques and Various Applications",
  publisher    = "John Wiley \& Sons",
  year         = 1973,
  address      = nyny,
  keywords     = "geometry, iteration, series and products, integrals",
  location     = "QA 37.2.M44"
}

@Book{tccpm,
  author       = "Pablo Medina",
  title        = "The Cuban Comedy",
  publisher    = "Unnamed Press",
  year         = 2019,
  address      = laca,
  keywords     = "cuba, revolution, poets",
  location     = "979 1 944700 87 4"
}

@Book{strhlg,
  author       = "Henry Louis {Gates, Jr.}",
  title        = "Stoney the Road",
  subtitle     = "Reconstruction, White Supremacy, and the Rise of Jim Crow",
  publisher    = "Penguin Press",
  year         = 2019,
  address      = nyny,
  keywords     = "reconstruction, jim crow, slavery",
  location     = "E 185.61 G253"
}

@Book{teotbl,
  author       = "Margery Allingham",
  title        = "The Estate of the Beckoning Lady",
  publisher    = "Avon Books",
  year         = 1990,
  address      = nyny,
  price        = "$3.50",
  keywords     = "murrdarr, accidents, real estate",
  location     = "PR 6001.L678"
}

@Book{lbab,
  author       = "Kirankalyan Kulkarni",
  title        = "Learn Bitcoin and Blockchain",
  subtitle     = "Understanding Blockchain and Bitcoin Architecture to Build Decentralized Applications",
  publisher    = "Packt Publishing",
  month        = aug,
  year         = 2018,
  address      = "Birmingham, U.K.",
  keywords     = "bitcoin, blockchain, cryptocurrency, hash functions",
  location     = "978-1-78953-613-3"
}

@Book{sas2019,
  author       = "Ali Smith",
  title        = "Spring",
  publisher    = "Pantheon Books",
  year         = 2019,
  address      = nyny,
  keywords     = "detention, remembering",
  location     = "PR 6069.M4213 S67"
}

@Book{tsmbs,
  author       = "Bhaskar Sunkara",
  title        = "The Socialist Manifesto",
  subtitle     = "The Case for Radical Politics in an Era of Extreme Inequality",
  publisher    = "Basic Books",
  year         = 2019,
  address      = nyny,
  keywords     = "government, socialism, marxism, history, political strategy",
  location     = "HX 73.S86"
}

@Book{tftgju,
  author       = "John Updike",
  title        = "Too Far to Go",
  subtitle     = "The Maples Stories",
  publisher    = "Fawcett Crest",
  price        = "$2.50",
  year         = 1979,
  address      = nyny,
  keywords     = "love, marriage, separating, divorce, relations",
  location     = "PS 3571.P4 T66"
}

@Book{taoa,
  author       = "Jack Campbell",
  title        = "The Assassins of Altis",
  publisher    = "Jabberwocky Literary Agency",
  year         = 2015,
  keywords     = "mechanics, mages, cliff-hangers",
  location     = "978-1-62567-134-9"
}

@Book{ashp,
  author       = "Harvey Pekar",
  title        = "American Splendor",
  subtitle     = "The Life and Times of Harvey Pekar",  
  publisher    = "Dolphin\slash Doubleday",
  year         = 1986,
  illustrators = "Kevin Brown, Gregory Budgett, Robert Crumb, Gary Dumm and Gerry Shamray",
  address      = "Garden City, "# NY,
  keywords     = "biography, slices o' life, cleveland, blue-collar life, comix",
  location     = "PN 6727.P44 A74 2003"
}

@Book{tdrjp,
  author       = "Jay Parini",
  title        = "The Damascus Road",
  subtitle     = "A Novel of Saint Paul",
  publisher    = "Doubleday",
  year         = 2019,
  address      = nyny,
  keywords     = "early christianity, the gospels, evangelism",
  location     = "PS 3566.A65 D36"
}

@Book{mbje,
  author       = "Jennifer Egan",
  title        = "Manhattan Beach",
  publisher    = "Scribner",
  year         = 2017,
  address      = nyny,
  keywords     = "criminals, nyc, diving",
  location     = "PS 3555.G292 M36"
}

@Book{tdcwp,
  author       = "William Poundstone",
  title        = "The Doomsday Calculation",
  publisher    = "Little, Brown Spark",
  year         = 2019,
  series       = nyny,
  keywords     = "bayesian statistics, predictions mathematics",
  location     = ""
}

@Book{ihors,
  author       = "Roy Scranton",
  title        = "{I} $\heartsuit$ Oklahoma",
  publisher    = "Soho",
  year         = 2019,
  address      = nyny,
  keywords     = "america, road trips, art",
  location     = "PS 3619.C743 I25"
}

@Book{tswth,
  author       = "Sarah Caudwell",
  title        = "The Shortest Way to Hades",
  publisher    = "Dell",
  year         = 1985,
  address      = nyny,
  price        = "$7.99",
  keywords     = "murrdaar, lines of succession, da classics",
  location     = "PR 6053.A855 S5"
}

@Book{tbjc,
  author       = "Paul Febribach",
  title        = "The Big Jones Cookbook",
  subtitle     = "Recipes for Savoring the Heritage of Regional Southern Cooking",
  publisher    = ucp,
  year         = 2015,
  address      = chil,
  keywords     = "southern cooking, whole-hog cooking",
  location     = "TX 715.2.S68 F44"
}

@Book{btrrjc,
  author       = "John Clubbe",
  title        = "Beethoven",
  subtitle     = "The Relentless Revolutionary",
  publisher    = "W.~W. Norton \& Co.",
  year         = 2019,
  address      = nyny,
  keywords     = "beethoven, german romanticism, napoleon, vienna, music,
    composition, political theory",
  location     = "ML 410.B42 C55"
}

@Book{dodos,
  author       = "Paul~J. Fortier",
  title        = "Design of Distributed Operating Systems",
  subtitle     = "Concepts and Technology",
  publisher    = "Intertext Publications",
  year         = 1986,
  address      = nyny,
  keywords     = "operating systems, distributed computing, distributed
    operating systems, object models, process models",
  location     = "QA 76.76.O63 F67"
}

@Book{loldh,
  author       = "Doug Hoyte",
  title        = "Let Over Lambda",
  subtitle     = "50 Years of Lisp",
  publisher    = "HCSW\slash Hoytech",
  year         = 2008,
  keywords     = "lisp, closures, macros, read macros, generative programming,
    anaphoric macros",
  location     = "978-1-4357-1275-1"
}

@Book{csj19,
  author       = "Scott Johnston",
  title        = "Campusland",
  publisher    = "St. Martin's Press",
  year         = 2019,
  address      = nyny,
  keywords     = "college life, wokedness, modern times",
  location     = "PS 3610.O3893 C36"
}

@Book{smaa,
  author       = "Averill Law",
  title        = "Simulation Modeling and Analysis",
  publisher    = "McGraw-Hill",
  year         = 2006,
  address      = boma,
  keywords     = "simulation modelling, complex systems, simulation software,
    probability, statistics, probability distributions, random-number
    generators, random variates, data analysis, variance reduction",
  location     = "QA 76.9.C65 L38"
}

@Book{mfet,
  author       = "Elizabeth Tallent",
  title        = "Mendocino Fire",
  publisher    = "Harper",
  year         = 2015,
  address      = nyny,
  keywords     = "short stories",
  location     = "PS 3570.A5366 A6"
}

@Book{qs1lk,
  author       = "Leonard Kleinrock",
  title        = "Queueing Systems",
  publisher    = "John Wiley \& Sons",
  year         = 1975,
  volume       = "1: Theory",
  address      = nyny,
  keywords     = "queueing theory, markovian queues, probability theory,
    transform theory, birth-death queueing, random processes, queueing systems",
  location     = "T 57.9.K6"
}

@Book{qs2lk,
  author       = "Leonard Kleinrock",
  title        = "Queueing Systems",
  publisher    = "John Wiley \& Sons",
  year         = 1976,
  volume       = "2: Computer Applications",
  address      = nyny,
  keywords     = "queueing theory, markovian queues, probability theory,
    transform theory, birth-death queueing, random processes, queueing systems",
  location     = "T 57.9.K6"
}

@Book{ttwg,
  author       = "Richard Panek",
  title        = "The Trouble With Gravity",
  subtitle     = "Solving the Mystery Beneath Our Feet",
  publisher    = "Houghton Mifflin Harcourt",
  year         = 2019,
  address      = boma,
  keywords     = "gravity, myths, matter, motion, fiction, facts, excelsis",
  location     = "QB 331.P35"
}

@Book{tssom,
  author       = "Sarah Caudwell",
  title        = "The Sirens Sang of Murder",
  publisher    = "Dell",
  year         = 1989,
  price        = "$7.99",		  
  address      = nyny,
  keywords     = "murrdaar, tax shenanigans, the usual suspect",
  location     = "PR 6053.A855 S54"
}

@Book{fsavivd,
  author       = "Bruce~S. Davie",
  title        = "Formal Specification and Verification in {VLSI} Design",
  publisher    = "Edinburgh University Press",
  year         = 1990,
  series       = "Edinburgh Information Technology Series",
  volume       = 8,		  
  address      = "Edinburgh, Scotland, U.K.",
  keywords     = "hardware description languages, specifications, design,
    verification, validation, constraints",
  location     = "TK 7874.D39"
}

@Book{fjw19,
  author       = "Jeanette Winterson",
  title        = "Frankissstein",
  publisher    = "Grove Press",
  year         = 2019,
  address      = nyny,
  keywords     = "ai, artificial life, 19th century romantics",
  location     = "PR 6073.I558 F73"
}

@Book{teoct,
  author       = "Corey Robin",
  title        = "The Enigma of Clarence Thomas",
  publisher    = "Metropolitan Books",
  year         = 2019,
  address      = nyny,
  keywords     = "clarence thomas, supreme court, black nationalism,
    constitutional law, racism, economics, social relations",
  location     = "KF 8745.T48 R63"
}

@Book{fgmg17,
  author       = "Mira Grant",
  title        = "Final Girls",
  publisher    = "Subtrerranean Press",
  year         = 2017,
  address      = "Burton, Michigan",
  keywords     = "mind control, dreams, zombies",
  location     = "978-1-59606-824-7"
}

@Book{tcna,
  author       = "Natalie Angier",
  title        = "The Canon",
  subtitle     = "A Whirligig Tour of the Beautiful Basics of Science",
  publisher    = "Houghton Mifflin",
  year         = 2007,
  address      = boma,
  keywords     = "probabilities, physics, chemistry, evolutionary biology,
    molecular biology, geology, astronomy",
  location     = "Q 162.A59"
}

@Book{tawrak,
  author       = "Robert~A. Kaster",
  title        = "The Appian Way",
  subtitle     = "Ghost Road, Queen of Roads",
  publisher    = ucp,
  year         = 2012,
  address      = chil,
  keywords     = "ancient rome, the appian way, southern italy, tourism",
  location     = "DG 29.A6 K37"
}

@Book{xwspaawx,
  author       = "Douglas~A. Young",
  title        = "{X} Window Systems Programming and Applications with Xt",
  publisher    = "Prentice-Hall",
  year         = 1989,
  address      = ecnj,
  keywords     = "x window system, xt intrinsics, x resource manager, widget
    programming, event handling, color, raster images, graphics contexts, text,
    fonts, graphics primitives, interclient communications",
  location     = "QA 76.76 W56 Y68"
}

@Book{tlrmspw,
  author       = "Maj Sj{\" o}wall and Per Wahl{\" o}{\" o}",
  title        = "The Locked Room",
  publisher    = "Vintage",
  year         = 1980,
  address      = nyny,
  price        = "$1.95",
  keywords     = "bank robbery, police bureaucracy, the twisty fingers of fate,
    murrrdaaar",
  location     = "PZ 4.S61953Lo"
}

@Book{wohrs,
  author       = "Roel Sterckx",
  title        = "Ways of Heaven",
  subtitle     = "An Introduction to Chinese Thought",
  publisher    = "Basic Books",
  year         = 2019,
  address      = nyny,
  keywords     = "ancient china, philosophy, legalism, confucianism, rituals,
    morals, ethics",
  location     = ""
}

@Book{rrw2011,
  author       = "Richard White",
  title        = "Railroaded",
  subtitle     = "The Transcontinentals and the Making of Modern America",
  publisher    = "W.~W. Norton \& Co.",
  year         = 2011,
  address      = nyny,
  keywords     = "transcontinental railroads, collis huntington, mark hopkins,
    leland stanford, charles croker, jay gould, charles adams, central
    pacific, union pacific, southern pacific, corruption, capitalism, finance",
  location     = "HE 2751 W55"
}

@Book{tbscrme,
  title        = "The Bittersweet Science",
  subtitle     = "Fifteen Writers in the Gym, in the Corner, and at Ringside",
  publisher    = ucp,
  year         = 2017,
  editor       = "Carlo Rotella and Michael Ezra",
  address      = chil,
  keywords     = "boxing, antonio margarito, all-time rankings, bernard
    hopknis, dempsey-wills, jimmy bivins, ray jones jr",
  location     = "GV 1133.B58"
}

@Book{mejc,
  author       = "Jonathan Coe",
  title        = "Middle England",
  publisher    = "Knopf",
  year         = 2018,
  address      = nyny,
  keywords     = "brexit, interpersonal relations, the shifting ground",
  location     = "PR 6053.O26 M56"
}

@Book{tsihg,
  author       = "Sarah Caudwell",
  title        = "The Sibyl in Her Grave",
  publisher    = "Dell",
  year         = 2000,
  price        = "$7.99",
  address      = nyny,
  keywords     = "murrdaar, who dat, shady business",
  location     = "PR 6053.A855 S53"
}

@Book{jssjljc,
  author       = "John Lewis and Joseph Chase",
  title        = "Java Software Structures",
  subtitle     = "Designing and Using Data Structures",
  publisher    = "Pearson",
  year         = 2014,
  address      = boma,
  edition      = "fourth",
  keywords     = "algorithm analysis, stacks, queues, lists, iterators,
    recursion, searching, sorting, trees, binary search trees, heaps, priority
    queues, sets, maps, multi-way search trees, graphs, uml, object-oriented
    design, graphics, guis, hashing, regular expressions",
  location     = "QA 76.73.J38 L493"
}

@Book{oepn,
  author       = "Pekka Nyk{\" a}nen",
  title        = "Operation Elop",
  subtitle     = "The Final Years of Nokia's Mobile Phones",
  year         = 2018,
  keywords     = "bidness, mobile phones, nokia, management, competition",
  location     = "https://asokan.org/operation-elop/"
}

@Book{epegsmm,
  title        = "Extreme Programming Examined",
  publisher    = "Addison-Wesley",
  year         = 2001,
  editor       = "Giancarlo Succi and Michele Marchesi",
  series       = "The XP Series",
  address      = boma,
  keywords     = "software design, software management, pair programming,
    refactoring", 
  location     = "QA 76.76 D47 S83"
}

@Book{mjl,
  author       = "Julia Lovell",
  title        = "Maoism",
  subtitle     = "A Global History",
  publisher    = "Knpof",
  year         = 2019,
  address      = nyny,
  keywords     = "mao, chinese communism, armed revolution, maylasia, cambodia,
    india, peru, nepal, china",
  location     = "HX 418 L68"
}

@Misc{1mmmitxss,
  author       = "Michael Steil",
  title        = "17 Mistakes {Microsoft} Made in the {Xbox} Security System",
  booktitle    = "22nd Chaos Communication Congress (22C3)",
  year         = 2005,
  month        = "27--30 " # dec,
  address      = "Berlin, Germany",
  keywords     = "security, xbox, bootloader, encryption, hashing",
  location     = "https://events.ccc.de/congress/2005/fahrplan/attachments/674-slides_xbox.pdf",
  location     = "https://www.slideshare.net/Flashdomain/17-mistakes-microsoft-made-in-the-xbox-security-system"
}

@Misc{asjsc,
  author       = "Stringfellow Barr",
  title        = "Notes on Dialogue",
  year         = 1968,
  month        = jan,
  keywords     = "listening, dialogue, communication",
  location     = "https://www.bc.edu/content/dam/files/centers/boisi/pdf/f10/Notes_on_Dialogue.pdf"
}

@Misc{htbaggssa,
  author       = "Marie desJardins",
  title        = "How to be a good graduate student\slash advisor",
  howpublished = "on the web",
  year         = 1994,
  month        = mar,
  keywords     = "graduate school, scholarship",
  abstract     = "This paper attempts to raise some issues that are important
    for graduate students to be successful and to get as much out of the
    process as possible, and for advisors who wish to help their students be
    successful.  The intent is not to provide prescriptive advice -- no
    formulas for finishing a thesis or twelve-step programs for becoming a
    better advisor are given -- but to raise awareness on both sides of the
    advisor-student relationship as to what the expectations are and should be
    for this relationship, what a graduate student should expect to accomplish,
    common problems, and where to go if the advisor is not forthcoming.",
  location     = "http://heibeck.freeshell.org/Grad_Advice/how2b/how.2b.html"
}

@Misc{bptf14,
  author       = "Paul Heckbert",
  title        = "Brief {Postscript} tutoral for 15-462",
  year         = 1997,
  month        = "18 " # sep,
  keywords     = "postscript, debugging, operators",
  location     = "https://www.cs.cmu.edu/afs/andrew/scs/cs/15-463/98/pub/www/assts/ps.html"
}

@Misc{aascfs,
  author       = "Charles~F. Schmidt",
  title        = "{AI} and Search",
  keywords     = "exhaustive search, backtracking, depth-first search,
    breadth-first search, hill climbing"
}

@Misc{ftfpr,
  author       = "Karl E. Wiegers",
  title        = "First Things First: Prioritizing Requirements",
  howpublished = "www.modernanalyst.com",
  keywords     = "requirements, priorities, value, cost, risk",
  location     = "https://www.modernanalyst.com/Resources/Articles/tabid/115/ID/74/First-Things-First-Prioritizing-Requirements.aspx#mp-pusher"
}

@TechReport{djplm,
  author       = "Peter Haggar",
  title        = "Dispelling {Java} Programming Language Myths",
  institution  = "IBM developerWorks Journal",
  year         = 2001,
  month        = oct,
  keywords     = "garbage collection, reference parameters, atomic operations,
    synchronization, threads, rtsj"
}

@TechReport{domdl1s,
  author       = "Vidur Apparao and Steve Byrne and Mike Champion and Scott Isaacs and Arnaud {Le Hors} and Gavin Nicol and Jonathan Robie and Peter Sharpe and Bill Smith and Jared Sorensen and Robert Sutor and Ray Whitmer and Chris Wilson",
  title        = "{Document Object Model} ({DOM}) Level 1 Specification",
  institution  = "W3C",
  year         = 1998,
  number       = "REC-DOM-Level-1-19981001",
  month        = sep,
  keywords     = "dom, html, idl",
  abstract     = "This specification defines the Document Object Model Level 1,
    a platform- and language-neutral interface that allows programs and scripts
    to dynamically access and update the content, structure and style of
    documents.  The Document Object Model provides a standard set of objects
    for representing HTML and XML documents, a standard model of how these
    objects can be combined, and a standard interface for accessing and
    manipulating them.  Vendors can support the DOM as an interface to their
    proprietary data structures and APIs, and content authors can write to the
    standard DOM interfaces rather than product-specific APIs, thus increasing
    interoperability on the Web.  The goal of the DOM specification is to
    define a programmatic interface for XML and HTML.  The DOM Level 1
    specification is separated into two parts: Core and HTML.  The Core DOM
    Level 1 section provides a low-level set of fundamental interfaces that can
    represent any structured document, as well as defining extended interfaces
    for representing an XML document.  These extended XML interfaces need not
    be implemented by a DOM implementation that only provides access to HTML
    documents; all of the fundamental interfaces in the Core section must be
    implemented.  A compliant DOM implementation that implements the extended
    XML interfaces is required to also implement the fundamental Core
    interfaces, but not the HTML interfaces.  The HTML Level 1 section provides
    additional, higher-level interfaces that are used with the fundamental
    interfaces defined in the Core Level 1 section to provide a more convenient
    view of an HTML document.  A compliant implementation of the HTML DOM
    implements all of the fundamental Core interfaces as well as the HTML
    interfaces.", 
  location     = "https://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/"
}

@TechReport{mlwal,
  author       = "Keith Smillie",
  title        = "My Life with Array Languages",
  institution  = dcs # "University of Alberta",
  year         = 2005,
  address      = "Alberta, Canada",
  keywords     = "apl, nail, j",
  location     = "https://webdocs.cs.ualberta.ca/~smillie/Jpage/MyLife.pdf"
}

@TechReport{tplo2014,
  author       = "Niklaus Wirth",
  title        = "The Programming Language {Oberon}",
  year         = 2014,
  month        = oct,
  keywords     = "oberon, language definition"
}

@TechReport{epofataacsuaaoz,
  author       = "Heger, Christian and Lothar Schmitz",
  title        = "Establishing Properties of Frameworks and Their Applications: A Case Study Using {Alloy} and {Object-Z}",
  institution  = "Fak. f{\" u}r Informatik, Univ. der Bundeswehr",
  address      = "Munich, Germany",
  year         = 2009,
}

@TechReport{fmpitlm,
  author       = "David Weinreb and David Moon",
  title        = "Flavors: Message Passing in the {Lisp Machine}",
  institution  = ail # ", " # mit,
  year         = 1980,
  type         = "A.I. Memo",
  number       = 602,
  address      = cama,
  month        = nov,
  keywords     = "flavors, object-oriented programming, inheritance, generics,
    message passing, actors, lisp",
  abstract     = "The object oriented programming style used in the Smalltalk
    and Actor languages is available in Lisp Machine Lisp, and used by the Lisp
    Machine software system.  It is used to perform generic operations on
    objects.  Part of its implementation is simply a convention in procedure
    calling style; part is a powerful language feature, called Flavors, for
    defining abstract objects.  This chapter attempts to explain what
    programming with objects and with message passing means, the various means
    of implementing these in Lisp Machine Lisp, and when you should use them.
    It assumes no prior knowledge of any other languages.", 
  location     = "https://dspace.mit.edu/handle/1721.1/5700"
}

@TechReport{daioamfafsfdpc,
  author       = "Dawson~R. Engler and Deborah~A. Wallach and M.~Frans Kaashoek",
  title        = "Design and Implementation of a Modular, Flexible, and Fast System for Dynamic Protocol Composition",
  institution  = lcs # mit,
  year         = 1996,
  type         = "Memorandum",
  number       = "TM-552",
  address      = cma,
  month        = may,
  keywords     = "ash, pipes, on-demand generation",
  abstract     = "Distributed systems must communicate.  To communicate at all
    requires high-level protocols be built with manageable complexity.  To
    communicate well requires protocols efficient both in design and
    implementation.  The ASH system provides mechanisms to address both of
    these needs.  To manage complexity, it provides a simple interface that
    allows protocols to be dynamically composed in a modular manner.  As a
    result, the complexity of building a high-level messaging service is
    reduced since it can be built from multiple, independent pieces at runtime.
    To provide efﬁciency, the ASH interface is designed so that the message
    processing steps of each protocol (such as checksumming, byte-swapping,
    encryption, etc.) can be dynamically integrated intoa single specialized
    loop that touches each byte of the message at most once.  The ASH system is
    the first to dynamically integrate the data processing elements of each
    protocol.  This ability is crucial since without it dynamic protocol
    composition cannot be efficient.  This paper presents the design and
    implementation of the ASH system.  It is interesting because it uses modern
    compilation techniques to eliminate the runtime overhead of modularity.  To
    make the system efficient we have had to solve problems ranging from
    theoretical graph algorithms, to language design, to determining the most
    efﬁcient way to access unaligned memory, and designing efﬁcient and
    portable methods of generating executable code at runtime.  As a result of
    careful design and the the use of dynamic code generation to specialize
    data processing paths, the ASH system provides performance that is
    comparable to (and in some situations significantly better than)
    hand-coded, hard-wired protocol implementations.  The ASH system has been
    integrated into the Aegis operating system, and runs on both Ethernet and
    DEC AN2 networks.  A standalone version of the ASH system runs on SPARC,
    MIPS, and Alpha processors.  The system itself will be publicly released
    in the near future.", 
  location     = "https://pdos.csail.mit.edu/~engler/ash-osdi.ps"
}

@Manual{wdud,
  title        = "Writing Documentation Using DocBook",
  author       = "David Rugge and Mark Galassi and Eric Bischoff",
  year         = 2006,
  keywords     = "docbook",
  location     = "https://web.fe.up.pt/~jmcruz/etc/web/crash-course.pdf"
}


@MastersThesis{trpc,
  author       = "Michelle Denise Abram",
  title        = "Transparent Remote Procedure Calls",
  school       = "Baskin School of Engineering, " # ucal # " Santa Cruz",
  year         = 1992,
  address      = scca,
  month        = dec,
  keywords     = "rpc",
  abstract     = "With the vastly increased need for computing power in modern
    computing environments, the ability to distribute jobs across machine
    boundaries has become essential.  The main drawback of distributed
    computing is the excessive complexity of network programming.  One way to
    solve this problem is to create an environment that emulates the typical
    programming environment.  This is the basis of remote procedure calls
    (RPC).  A remote procedure call is the execution of a procedure that
    resides on a foreign host.  A program at the remote site receives data from
    the caller, calls the procedure locally, and returns the result.  To the
    programmer, remote procedure calls closely resemble local procedure calls.
    This is a well developed idea, and a number of RPC packages have been
    implemented.  The problem with most of these packages is that complex
    initialization routines are required to use them.  It is unnecessary to
    concern the programmer with the underlying connectivity and packet exchange
    mechanisms required to implement an RPC package.  Further, these
    initialization requirements undermine the central goal of RPC programming:
    transparent distributed computing.  We present a remote procedure call
    package that has been designed to relieve the programmer of this burden
    without sacrificing power.", 
  location     = "https://www.soe.ucsc.edu/research/technical-reports/UCSC-CRL-93-07"
}

